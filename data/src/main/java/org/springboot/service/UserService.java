package org.springboot.service;

import org.springboot.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * 用户服务接口， 定义用户常用操作
 * @author meisen
 * 2017-12-10
 */
public interface UserService {

    /**
     * 新增、编辑、保存用户
     * @param user 新用户
     * @return 保存后的用户
     */
    User saveOrUpdateUser(User user);

    /**
     * 注册用户
     * @param user 用户
     * @return 注册用户
     */
    User registerUser(User user);

    /**
     * 删除用户
     * @param id 删除用户id
     */
    void removeUser(Long id);

    /**
     * 根据id获取用户
     *
     * @param id 用户id
     * @return 获取用户
     */
    User getUserById(Long id);

    /**
     * 根据用户名进行分页模糊查询
     * @param name 用户名
     * @param pageable 分页
     * @return 分页数据
     */
    Page<User> listUserByNameLike(String name, Pageable pageable);
}
