package com.liujie.gmaill.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.pms.entity.CategoryBrandRelationEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 品牌分类关联
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:37
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

