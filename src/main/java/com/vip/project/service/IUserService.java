package com.vip.project.service;

import com.vip.project.domain.vo.UserVo;

import java.util.List;

/**
 * @Author luotao
 */
public interface IUserService {

    List<UserVo> userList(int id);
}
