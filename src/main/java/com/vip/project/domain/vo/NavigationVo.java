package com.vip.project.domain.vo;

import com.vip.project.domain.entity.NavMenu;
import com.vip.project.domain.entity.Navigation;
import lombok.Data;

import java.util.List;

/**
 * @Author luotao
 */
@Data
public class NavigationVo extends Navigation {
    private List<NavMenu> navMenuList;
}
