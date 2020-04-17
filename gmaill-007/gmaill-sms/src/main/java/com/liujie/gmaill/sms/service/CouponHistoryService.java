package com.liujie.gmaill.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.sms.entity.CouponHistoryEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

