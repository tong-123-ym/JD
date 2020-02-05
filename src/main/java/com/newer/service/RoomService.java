package com.newer.service;

import com.newer.mapper.RoomsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class RoomService {
    private RoomsMapper roomsMapper;
    private SqlSession sqlSession;
    //映射器接口实例化
    private void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        roomsMapper=sqlSession.getMapper(RoomsMapper.class);

    }
    public List<String> findType(){
        init();
        //查询全部所有房间类型信息
        List<String> list=roomsMapper.findTypes();
        SqlSessionUtil.close(sqlSession);
        return list;
    }
    public List<String> findrid(String type){
        init();
        //查询全部所有房间类型信息
        List<String> list=roomsMapper.findRoomId(type);
        SqlSessionUtil.close(sqlSession);
        return list;
    }
}
