package com.vip.project.mapper;

import com.vip.project.domain.vo.CategoryVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface ICategoryMapper {
    /**
     * 查询所有的总类及相应的商品信息
     * @return
     */
    List<CategoryVo> findAllCate();
}