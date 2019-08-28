package com.vip.project.service;

import com.vip.project.domain.vo.ShopVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface IShopService {
    /**
     * 查询所有商品服务接口
     * @return
     */
    List<ShopVo> shops();

    /**
     * 分页模糊查询服务接口
     * @param keyword
     * @return
     */
    List<ShopVo> blurredShops(String keyword , int page);
}
