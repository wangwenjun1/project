package com.vip.project.controller;

import com.vip.project.domain.vo.ShopVo;
import com.vip.project.service.impl.ShopServiceImpl;
import com.vip.project.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
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
public class ShopController {

    @Resource
    ShopServiceImpl shopService;

    @RequestMapping("/allShop")
    public Result shop(){
        try{
            List<ShopVo> shopList = shopService.shops();
            if(shopList != null && shopList.size()>0){
                return Result.success(shopList);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @RequestMapping("/blurredShops")
    public Result blurredShops( String keyword , int page){
        try{
            List<ShopVo> blurredShops = shopService.blurredShops(keyword , page);
            if(blurredShops != null && blurredShops.size()>0){
                return Result.success(blurredShops);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
