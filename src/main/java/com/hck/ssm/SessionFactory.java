package com.hck.ssm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactory {
    static private SqlSessionFactory factory= null;

    static{
        InputStream resourceAsStream= null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        factory= new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    static public SqlSession openSession(){
        return factory.openSession();
    }
}
