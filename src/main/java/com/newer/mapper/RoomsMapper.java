package com.newer.mapper;
import com.newer.domain.Rooms;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoomsMapper  {
    @Select("select distinct(roomtype) from rooms")
    List<String> findTypes();
    @Select("select *from rooms where state=1 and roomtype=#{roomtype}")
    List<String> findRoomId(@Param("roomtype") String roomtype);
    @Select("select *from rooms where roomid=#{roomid}")
    List<Rooms> findBymid(@Param("roommid")String roommid);
}
