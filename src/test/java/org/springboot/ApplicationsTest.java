package org.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.bean.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author meisen
 * 2017-04-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationsTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void helloTest() {
        Assert.assertEquals(blogProperties.getName(), "meisen");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot");
    }
}
