package org.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springboot.modal.User;

/**
 * @author meisen
 *         2017-06-06
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name=#{name}")
    User findByUserName(@Param("name") String name);
}
