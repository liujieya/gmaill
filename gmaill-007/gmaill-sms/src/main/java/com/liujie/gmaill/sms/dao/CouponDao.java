package com.liujie.gmaill.sms.dao;

import com.liujie.gmaill.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
