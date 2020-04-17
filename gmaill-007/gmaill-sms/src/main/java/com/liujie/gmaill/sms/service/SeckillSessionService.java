package com.liujie.gmaill.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.sms.entity.SeckillSessionEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 秒杀活动场次
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

