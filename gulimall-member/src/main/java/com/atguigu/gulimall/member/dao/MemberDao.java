package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangrui
 * @email 412285675@qq.com
 * @date 2022-12-05 16:59:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
