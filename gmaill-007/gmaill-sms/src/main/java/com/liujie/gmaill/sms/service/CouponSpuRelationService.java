package com.liujie.gmaill.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.sms.entity.CouponSpuRelationEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

