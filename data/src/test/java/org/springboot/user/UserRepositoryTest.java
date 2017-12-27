package org.springboot.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.bean.User;
import org.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User测试类
 *
 * @author meisen
 * 2017-12-27
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = UserRepository.class)
public class UserRepositoryTest {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Before
//    public void initRepositoryData() {
//        userRepository.deleteAll();
//        userRepository.save(new User("meisen", "123"));
//        userRepository.save(new User("xiaomei", "123"));
//        userRepository.save(new User("meixiaosen", "123"));
//    }
//
//    @Test
//    public void testFindByNameLike() {
//        Pageable pageable = new PageRequest(0, 20);
//        String name = "xiao";
//        Page<User> page = userRepository.findByNameLike(name, pageable);
//        assertThat(page.getTotalElements()).isEqualTo(2);
//    }
}
