package com.liujie.gmaill.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.Query;
import com.liujie.gmaill.bean.QueryCondition;

import com.liujie.gmaill.sms.dao.HomeSubjectSpuDao;
import com.liujie.gmaill.sms.entity.HomeSubjectSpuEntity;
import com.liujie.gmaill.sms.service.HomeSubjectSpuService;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeSubjectSpuEntity> page = this.page(
                new Query<HomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<HomeSubjectSpuEntity>()
        );

        return new PageVo(page);
    }

}
