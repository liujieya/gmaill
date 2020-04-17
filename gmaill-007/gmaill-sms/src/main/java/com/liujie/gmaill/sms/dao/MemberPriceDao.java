package com.liujie.gmaill.sms.dao;

import com.liujie.gmaill.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
