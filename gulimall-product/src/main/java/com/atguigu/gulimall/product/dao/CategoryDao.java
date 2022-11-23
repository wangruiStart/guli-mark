package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangrui
 * @email 412285675@qq.com
 * @date 2022-11-23 09:47:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
