package com.vip.project.mapper;

import com.vip.project.domain.entity.Navigation;
import com.vip.project.domain.vo.NavigationVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface INavigationMapper {
    /**
     * 查询所有的导航栏以及下拉信息
     * @return
     */
    List<NavigationVo> findAllNav();
}