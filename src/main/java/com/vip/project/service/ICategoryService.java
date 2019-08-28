package com.vip.project.service;

import com.vip.project.domain.vo.CategoryVo;

import java.util.List;

/**
 * @Author luotao
 */
public interface ICategoryService {
    /**
     * 总类信息服务接口
     * @return
     */
    List<CategoryVo> AllCate();
}
