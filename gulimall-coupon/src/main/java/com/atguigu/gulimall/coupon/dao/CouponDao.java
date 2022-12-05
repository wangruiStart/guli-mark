package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangrui
 * @email 412285675@qq.com
 * @date 2022-12-05 16:33:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
