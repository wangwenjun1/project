package com.vip.project.domain.vo;

import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.entity.ShopCar;
import lombok.Data;

/**
 * @Author luotao
 */
@Data
public class ShopCarVo extends ShopCar {
    private Shop shop;
}
