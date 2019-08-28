package com.vip.project.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class NavMenu {
    private Integer menuId;

    private Integer navId;

    private String menuName;

    private Integer status;

    private String menuImg;

    private BigDecimal menuPrice;

    private Integer shopId;
}