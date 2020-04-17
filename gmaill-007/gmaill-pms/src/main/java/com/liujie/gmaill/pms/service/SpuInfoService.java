package com.liujie.gmaill.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujie.gmaill.pms.entity.SpuInfoEntity;


import com.liujie.gmaill.bean.PageVo;
import com.liujie.gmaill.bean.QueryCondition;

/**
 * spu信息
 *
 * @author liu
 * @email douthug@foxmail.com
 * @date 2020-04-16 18:10:37
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

