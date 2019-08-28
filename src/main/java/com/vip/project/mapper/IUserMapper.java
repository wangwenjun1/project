package com.vip.project.mapper;

import com.vip.project.domain.entity.User;
import com.vip.project.domain.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {
    /**
     * 查询对应用户的购物车信息和购物车商品信息
     * @return
     */
    List<UserVo> findAllUser(@Param("uid") int uid);

    /**
     * 登录查询是否有用户信息
     * @param uid
     * @return
     */
    User findUser(@Param("uid") int uid);

    /**
     * 添加新的用户信息
     * @param username
     * @param password
     * @param email
     * @return
     */
    int addUser(@Param("username") String username , @Param("password") String password , @Param("email") String email);
}