package com.liujie.gmaill.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.sms.entity.HomeAdvEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

