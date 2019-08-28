package com.vip.project.mapper;


import com.vip.project.domain.vo.ShopVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Administrator
 */
public interface IShopMapper {
    /**
     * 查询所有商品
     * @return
     */
    List<ShopVo> findAllShop();

    /**
     * 模糊查询商品
     * @return
     */
    List<ShopVo> findShops(@Param("keyword") String keyword , @Param("page") int page);
}