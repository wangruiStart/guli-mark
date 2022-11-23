package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author wangrui
 * @email 412285675@qq.com
 * @date 2022-11-23 09:47:58
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

