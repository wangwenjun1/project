package com.vip.project.domain.vo;

import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.entity.ShopImage;
import lombok.Data;

/**
 * @Author luotao
 */
@Data
public class ShopVo extends Shop {

    private ShopImage shopImage;
}
