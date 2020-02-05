package com.newer.mapper;

import com.newer.domain.Checkins;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CheckinsMapper {
    @Insert("INSERT INTO checkins VALUES (null,#{name}, #{gender}, #{cardtype}, #{cardno}, #{roomid}, #{num}, null, 1, " +
            "now(), NULL)")
    int addCheckins(Checkins checkins);
    @Results(value = {@Result(property = "cid",column = "cid",id = true),@Result(property = "name",column = "name")
            ,@Result(property = "checkinTime",column = "checkintime"),@Result(property = "num",column = "num")
            ,@Result(property = "rooms",column = "roomid",javaType = com.newer.domain.Rooms.class, one = @One(select = "com.newer.mapper.RoomsMapper.findBymid"))})
    @Select("select * from checkins where cstate=1")
    List<Checkins> SelAll();
}
