package org.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author meisen
 * 2017-06-08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserMapper.class)
@Transactional
@ComponentScan(basePackages={"org.springboot.mapper"})

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetAllUser(){
        System.out.println(userMapper.getAllUser());
    }
}
