package com.vip.project.service.impl;

import com.vip.project.domain.vo.UserVo;
import com.vip.project.mapper.IUserMapper;
import com.vip.project.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
public class UserService implements IUserService {

    @Resource
    IUserMapper userMapper;

    @Override
    public List<UserVo> userList(int id) {
        List<UserVo> users = userMapper.findAllUser(id);
        return users;
    }
}
