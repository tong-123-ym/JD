package com.newer.test;

import com.newer.domain.Checkins;
import com.newer.mapper.CheckinsMapper;
import com.newer.mapper.RoomsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test  {
    @Test
    public  void testFind(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoomsMapper mapper=sqlSession.getMapper(RoomsMapper.class);
        mapper.findTypes().forEach(rooms->System.out.println(rooms));
        SqlSessionUtil.close(sqlSession);

    }
    @Test
    public  void testfind(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoomsMapper mapper=sqlSession.getMapper(RoomsMapper.class);
        mapper.findRoomId("双人间").forEach(rooms->System.out.println(rooms));
        SqlSessionUtil.close(sqlSession);

    }
    @Test
    public  void testAll(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CheckinsMapper mapper=sqlSession.getMapper(CheckinsMapper.class);
        mapper.SelAll().forEach(rooms->System.out.println(rooms));
        SqlSessionUtil.close(sqlSession);

    }
}
