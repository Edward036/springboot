package org.springboot.repository;

import org.springboot.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User 资源库 接口
 * @author meisen
 * 2017-12-27
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据用户姓名分页查询用户列表
     * @param name 姓名
     * @param pageable 分页
     * @return 分页数据
     */
    Page<User> findByNameLike(String name, Pageable pageable);

}
