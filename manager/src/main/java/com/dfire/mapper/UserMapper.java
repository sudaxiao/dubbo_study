package com.dfire.mapper;

import com.dfire.entity.User;
import com.dfire.entity.result_entity.UserResult;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ch on 2017/7/12.
 */

public interface UserMapper {
    int insert(User user);
   // @Select("select * from user")
    List<User> selectAll();
    User selectByPrimaryKey(Integer id);
    int update(User user);
    int deleteByPrimaryKey(Integer id);
    List<UserResult> groupBySex();
    List<UserResult> groupByAge();
}