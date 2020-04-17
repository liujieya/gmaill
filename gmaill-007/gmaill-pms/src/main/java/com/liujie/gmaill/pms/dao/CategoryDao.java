package com.liujie.gmaill.pms.dao;

import com.liujie.gmaill.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
