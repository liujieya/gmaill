package com.liujie.gmaill.pms.dao;

import com.liujie.gmaill.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:37
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
