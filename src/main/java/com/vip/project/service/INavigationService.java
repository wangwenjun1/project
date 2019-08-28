package com.vip.project.service;

import com.vip.project.domain.vo.NavigationVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface INavigationService {
    /**
     * 导航信息服务接口
     * @return
     */
    List<NavigationVo> allNav();
}
