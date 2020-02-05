package com.newer.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //获取数据库链接会话对象的方法
    public static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();
    }
    //关闭资源
    public static  void close(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
