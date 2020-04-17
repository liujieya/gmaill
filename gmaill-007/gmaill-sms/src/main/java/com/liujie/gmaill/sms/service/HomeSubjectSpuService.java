package com.liujie.gmaill.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.sms.entity.HomeSubjectSpuEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

