package com.vip.project.controller;

import com.vip.project.domain.vo.UserVo;
import com.vip.project.service.impl.UserService;
import com.vip.project.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@RequestMapping("/v1")
@RestController
@Slf4j
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user")
    public Result user(int id){
        try{
            List<UserVo> users = userService.userList(id);
            if(users != null && users.size() > 0){
                return  Result.success(users);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
