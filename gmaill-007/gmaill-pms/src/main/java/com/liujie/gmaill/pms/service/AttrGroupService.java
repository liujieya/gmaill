package com.liujie.gmaill.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.pms.entity.AttrGroupEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 属性分组
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:38
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

