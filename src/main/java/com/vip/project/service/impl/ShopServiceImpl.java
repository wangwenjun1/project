package com.vip.project.service.impl;

import com.vip.project.domain.vo.ShopVo;
import com.vip.project.mapper.IShopMapper;
import com.vip.project.service.IShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("shopService")
public class ShopServiceImpl implements IShopService {

    @Resource
    IShopMapper shopMapper;

    @Override
    public List<ShopVo> shops() {
        List<ShopVo> shopList = shopMapper.findAllShop();
        return shopList;
    }

    @Override
    public List<ShopVo> blurredShops(String keyword , int page) {
        page = (page - 1)*20;
        List<ShopVo> blurredShopsList = shopMapper.findShops(keyword , page);
        return blurredShopsList;
    }
}
