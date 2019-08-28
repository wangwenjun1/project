package com.vip.project.domain.vo;

import com.vip.project.domain.entity.Category;
import com.vip.project.domain.entity.Shop;
import lombok.Data;

import java.util.List;

/**
 * @Author luotao
 */
@Data
public class CategoryVo extends Category {

    private List<Shop> shopList;
}
