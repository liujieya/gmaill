package com.liujie.gmaill.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.Query;
import com.liujie.gmaill.bean.QueryCondition;

import com.liujie.gmaill.pms.dao.BrandDao;
import com.liujie.gmaill.pms.entity.BrandEntity;
import com.liujie.gmaill.pms.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageVo(page);
    }

}
