package com.liujie.mybtaisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liujie.mybtaisplus.pojo.MybtisPlus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

/**
 * @author: LiuJ
 * @Date: 2020/4/17
 * @Description:
 */
@Mapper
@Controller
public interface UserMapper extends BaseMapper<MybtisPlus> {
}
