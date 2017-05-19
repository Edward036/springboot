package org.springboot.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author meisen
 *         2017-05-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    @Qualifier("devJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() {
        jdbcTemplate.update("DELETE FROM dev.USER ");
    }

    @Test
    public void test() throws Exception {
        // 往第一个数据源中插入两条数据
        jdbcTemplate.update("insert into dev.USER(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
        jdbcTemplate.update("insert into dev.USER(id,name,age) values(?, ?, ?)", 2, "bbb", 30);
        // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
       // jdbcTemplate.update("insert into user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
       // Assert.assertEquals("2", jdbcTemplate.queryForObject("select count(1) from dev.USER", String.class));
        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
        Assert.assertEquals("1", jdbcTemplate.queryForObject("select count(1) from dev.USER", String.class));
    }
}