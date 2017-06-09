package org.springboot.ctl;

import org.springboot.mapper.UserMapper;
import org.springboot.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author meisen
 * 2017-05-02
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody
    public List<User> user(){
        List<User> allUser = userMapper.getAllUser();
        return allUser;
    }


}



