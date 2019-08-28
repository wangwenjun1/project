package com.vip.project.mapper;

import com.vip.project.domain.vo.SubMenuVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface ISubMenuMapper {

    List<SubMenuVo> findAllSubMenu();
}