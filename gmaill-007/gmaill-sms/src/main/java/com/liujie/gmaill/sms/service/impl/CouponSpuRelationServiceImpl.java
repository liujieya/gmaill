package com.liujie.gmaill.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.Query;
import com.liujie.gmaill.bean.QueryCondition;

import com.liujie.gmaill.sms.dao.CouponSpuRelationDao;
import com.liujie.gmaill.sms.entity.CouponSpuRelationEntity;
import com.liujie.gmaill.sms.service.CouponSpuRelationService;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponSpuRelationEntity> page = this.page(
                new Query<CouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuRelationEntity>()
        );

        return new PageVo(page);
    }

}
