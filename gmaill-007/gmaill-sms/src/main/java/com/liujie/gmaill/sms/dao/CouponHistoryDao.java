package com.liujie.gmaill.sms.dao;

import com.liujie.gmaill.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
