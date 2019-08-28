package com.vip.project.service;

import com.vip.project.domain.entity.Banner;

import java.util.List;

/**
 * @author Administrator
 */
public interface IBannerService {
    /**
     * 轮播图的服务接口
     * @return
     */
    List<Banner> allBanner();
}
