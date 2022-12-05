package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangrui
 * @email 412285675@qq.com
 * @date 2022-12-05 17:28:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
