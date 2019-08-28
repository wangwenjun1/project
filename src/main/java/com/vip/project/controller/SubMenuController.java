package com.vip.project.controller;

import com.vip.project.domain.vo.SubMenuVo;
import com.vip.project.service.ISubMenuService;
import com.vip.project.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@RestController
@RequestMapping("/v1")
@Slf4j
public class SubMenuController {
    @Resource
    ISubMenuService subMenuService;

    @RequestMapping("/subMenu")
    public Result subMenu(){
        try{
            List<SubMenuVo> allMenu = subMenuService.findAllMenu();
            if(allMenu != null && allMenu.size() > 0){
                return Result.success(allMenu);
            }
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
