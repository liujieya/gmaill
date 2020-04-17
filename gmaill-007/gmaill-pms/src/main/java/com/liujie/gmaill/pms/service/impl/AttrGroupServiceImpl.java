package com.liujie.gmaill.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.Query;
import com.liujie.gmaill.bean.QueryCondition;

import com.liujie.gmaill.pms.dao.AttrGroupDao;
import com.liujie.gmaill.pms.entity.AttrGroupEntity;
import com.liujie.gmaill.pms.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageVo(page);
    }

}
