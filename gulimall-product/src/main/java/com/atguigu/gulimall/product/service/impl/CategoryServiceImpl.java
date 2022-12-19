package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1. 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        Map<Long, List<CategoryEntity>> listMap = categoryEntities.stream().collect(Collectors.groupingBy(CategoryEntity::getParentCid));
        return categoryEntities.stream()
                .peek(item -> {
                    List<CategoryEntity> childList = Optional.ofNullable(listMap.get(item.getCatId()))
                            .orElseGet(ArrayList::new)
                            .stream()
                            .sorted(Comparator.comparingInt(value -> Optional.ofNullable(value.getSort()).orElseGet(() -> -1)))
                            .collect(Collectors.toList());
                    item.setChildren(childList);
                })
                .filter(item -> item.getParentCid() == 0)
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    /**
     * 删除菜单
     */
    @Override
    public void removeMenuByIds(List<Long> menuIds) {
        baseMapper.deleteBatchIds(menuIds);
    }
}
