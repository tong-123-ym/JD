package com.newer.service;

import com.newer.domain.Checkins;
import com.newer.mapper.CheckinsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class CheckinsService {
    private SqlSession sqlSession;

    private CheckinsMapper checkinsMapper;
    private void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        checkinsMapper=sqlSession.getMapper(CheckinsMapper.class);

    }
    public int addcheck(Checkins checkins){
        init();
        int row=checkinsMapper.addCheckins(checkins);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        return row;
    }
    public List<Checkins> SelCheck(){
        init();
        List<Checkins> list=new ArrayList<>();
        list=checkinsMapper.SelAll();
        SqlSessionUtil.close(sqlSession);
        return list;
    }
}
