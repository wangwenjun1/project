package com.vip.project.domain.vo;

import com.vip.project.domain.entity.ShopCar;
import com.vip.project.domain.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @Author luotao
 */
@Data
public class UserVo extends User {

    private List<ShopCar> shopcarList;
}
