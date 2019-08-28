package com.vip.project.service.impl;

import com.vip.project.domain.vo.SubMenuVo;
import com.vip.project.mapper.ISubMenuMapper;
import com.vip.project.service.ISubMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("subMenuService")
public class SubMenuServiceImpl implements ISubMenuService {

    @Resource
    ISubMenuMapper subMenuMapper;

    @Override
    public List<SubMenuVo> findAllMenu() {
        List<SubMenuVo> allSubMenu = subMenuMapper.findAllSubMenu();
        return allSubMenu;
    }
}
