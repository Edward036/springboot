package org.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author meisen
 * 2017-04-26
 */
@Component
public class BlogProperties {

    @Value("${com.springboot.blog.name}")
    private String name;

    @Value("${com.springboot.blog.title}")
    private String title;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
