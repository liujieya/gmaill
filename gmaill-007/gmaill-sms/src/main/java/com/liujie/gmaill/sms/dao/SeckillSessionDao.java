package com.liujie.gmaill.sms.dao;

import com.liujie.gmaill.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-17 14:25:19
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
