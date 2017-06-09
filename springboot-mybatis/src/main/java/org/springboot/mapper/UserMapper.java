package org.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springboot.modal.User;

import java.util.List;

/**
 * @author meisen
 * 017-06-06
 */
@Mapper
public interface UserMapper {

    @Select("select * from user ")
    List<User> getAllUser();
}
