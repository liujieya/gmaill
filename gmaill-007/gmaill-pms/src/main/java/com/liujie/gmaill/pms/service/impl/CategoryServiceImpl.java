package com.liujie.gmaill.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.Query;
import com.liujie.gmaill.bean.QueryCondition;

import com.liujie.gmaill.pms.dao.CategoryDao;
import com.liujie.gmaill.pms.entity.CategoryEntity;
import com.liujie.gmaill.pms.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageVo(page);
    }

}
