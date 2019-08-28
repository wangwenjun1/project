package com.vip.project.mapper;

import com.vip.project.domain.entity.ShopCar;
import com.vip.project.domain.vo.ShopCarVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IShopcarMapper {
    /**
     * 查询方法
     * 1.根据uid查询特定字段(不唯一)
     * 2.根据shopId查询特定字段(不唯一)
     * @param uid
     * @return
     */
    public ShopCar findCarByUidShopId(@Param("uid") int uid , @Param("shopId") int shopId);

    /**
     * 修改购买数量
     * 1.获得所需要修改产品的id
     * 2.根据op判断是增加还减少购买数量
     * @param carId
     * @param op 1 代表增加 2 代表删除
     * @return
     */
    public int carUpdate(@Param("carId") int carId , @Param("op") int op);

    /**
     * 添加商品的数据操作
     * 1.获得shopId,uid,number
     * @param shopId
     * @param uid
     * @param number
     * @return
     */
    public int carAdd(@Param("shopId") int shopId, @Param("uid") int uid, @Param("number") int number);

    /**
     * 当添加购物车商品已存在时修改商品数量的数据库更新操作
     * @param shopId
     * @param number
     * @return
     */
    public int carUpdateAdd(@Param("shopId") int shopId, @Param("uid") int uid , @Param("number") int number);

    /**
     * 假删除购物车信息
     * @param carId
     * @return
     */
    public int carDelete(@Param("carId") int carId);
}