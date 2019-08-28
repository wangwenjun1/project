package com.vip.project.controller;

import com.vip.project.domain.entity.Banner;
import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.domain.vo.NavigationVo;
import com.vip.project.service.IBannerService;
import com.vip.project.service.impl.CategoryServiceImpl;
import com.vip.project.service.impl.NavigationServiceImpl;
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
public class HeadController {

    @Resource
    CategoryServiceImpl categoryService;
    @Resource
    NavigationServiceImpl navigationService;
    @Resource
    IBannerService bannerService;

    @RequestMapping("/cate")
    public Result cate(){
        try{
            List<CategoryVo> categoryVoList = categoryService.AllCate();
            if(categoryVoList != null && categoryVoList.size() >0){
                return Result.success(categoryVoList);
            }
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @RequestMapping("/nav")
    public Result nav(){
        try{
            List<NavigationVo> navigationVos = navigationService.allNav();
            if(navigationVos != null && navigationVos.size() >0){
                return Result.success(navigationVos);
            }
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @RequestMapping("/banner")
    public Result banner(){
        try{
            List<Banner> banners = bannerService.allBanner();
            if(banners != null && banners.size()>0){
                return Result.success(banners);
            }
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
