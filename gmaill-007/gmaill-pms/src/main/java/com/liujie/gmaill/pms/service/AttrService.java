package com.liujie.gmaill.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.pms.entity.AttrEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:38
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);
}

