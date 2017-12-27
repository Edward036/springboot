package org.springboot.bean;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author meisen
 * 2017-12-22
 */
@Entity
public class User {

    /**
     * 实体的唯一标识
     */
    @Id //组件
    @GeneratedValue(strategy = GenerationType.IDENTITY) //生成策略, 自增策略
    private Long id;

    @NotEmpty(message = "姓名不能为空")
    @Size(max = 50)
    @Column(nullable = false, length = 20)
    private String name;

    @NotEmpty(message = "密码不能为空")
    @Size(max = 100)
    @Column(length = 100)
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
