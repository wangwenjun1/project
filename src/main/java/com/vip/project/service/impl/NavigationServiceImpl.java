package com.vip.project.service.impl;

import com.vip.project.domain.vo.NavigationVo;
import com.vip.project.mapper.INavigationMapper;
import com.vip.project.service.INavigationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("navigationService")
public class NavigationServiceImpl implements INavigationService {

    @Resource
    INavigationMapper navigationMapper;
    @Override
    public List<NavigationVo> allNav() {
        List<NavigationVo> navigationList = navigationMapper.findAllNav();
        return navigationList;
    }
}
