package com.vip.project.domain.vo;

import com.vip.project.domain.entity.SubMenu;
import com.vip.project.domain.entity.SubMenu1;
import lombok.Data;

import java.util.List;

/**
 * @Author luotao
 */
@Data
public class SubMenuVo extends SubMenu {
    private List<SubMenu1> subMenu1List;
}
