package com.vip.project.service;

import com.vip.project.domain.vo.SubMenuVo;

import java.util.List;

/**
 * @Author luotao
 */
public interface ISubMenuService {
    /**
     * 查询一级菜单和二级菜单的服务接口
     * @return
     */
    List<SubMenuVo> findAllMenu();
}
