package com.vip.project.service.impl;

import com.vip.project.domain.entity.Banner;
import com.vip.project.mapper.IBannerMapper;
import com.vip.project.service.IBannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("bannerService")
public class BannerServiceImpl implements IBannerService {

    @Resource
    IBannerMapper bannerMapper;
    @Override
    public List<Banner> allBanner() {
        List<Banner> banner = bannerMapper.banner();
        return  banner;
    }
}
