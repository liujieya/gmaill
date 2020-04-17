package com.liujie.mybtaisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liujie.mybtaisplus.mapper.UserMapper;
import com.liujie.mybtaisplus.pojo.MybtisPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: LiuJ
 * @Date: 2020/4/17
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    /**
     * 通过ID查询
     * @param params 编号
     * @return 返回结果
     */
    public MybtisPlus selectById(String params){
      return   userMapper.selectById(params);
    }


    /**
     * 通过ID批量查询
     * @param params 编号
     * @return 返回结果
     */
    public List<MybtisPlus> selectBatchIds(List<Integer> params){
        return userMapper.selectBatchIds(params);
    }

    /**
     * 通过name模糊查询
     * @param params 编号
     * @return 返回结果
     */
    public List<MybtisPlus> QuerWrapper(Map<String,Object> params){

        /*查询条件*/
        QueryWrapper queryWrapper = new QueryWrapper();

        /*按名称模糊查询*/
        queryWrapper.like("name",params.get("name"));

        /*按年龄>=范围查询*/
        queryWrapper.ge("age",params.get("age"));

        /*按年龄降序排序*/
        queryWrapper.orderByDesc("age");

        /*指定返回需要的列*/
        queryWrapper.select("id","name","age");

       return userMapper.selectList(queryWrapper);
    }


    /**
     * 分页查询
     * @param params 参数
     * @return 返回结果
     */
    public List selectPage(Map<String,Object> params){

        /*查询条件*/
        QueryWrapper queryWrapper = new QueryWrapper();

        /*按名称模糊查询*/
        queryWrapper.like("name",params.get("name"));

        /*按年龄>=范围查询*/
        queryWrapper.ge("age",params.get("age"));

        /*按年龄降序排序*/
        queryWrapper.orderByDesc("age");

        /*指定返回需要的列*/
        queryWrapper.select("id","name","age");

        //获取分页编号
        long current = Long.parseLong(params.get("current").toString());
        long size = Long.parseLong(params.get("size").toString());

        Page page = userMapper.selectPage(new Page<>(current,size),queryWrapper);
        /*返回数据*/
        return  page.getRecords();
    }

    /**
     * 执行添加操作
     * @param params 参数
     * @return 返回结果
     */
    public int insert(MybtisPlus params){

       return userMapper.insert(
                    new MybtisPlus(
                            params.getId(),
                            params.getName(),
                            params.getAge(),
                            params.getEmail()));
    }

    /**
     * 根据ID执行修改操作
     * @param params 参数
     * @return 返回结果
     */
    public int updateById(MybtisPlus params){

        return userMapper.updateById(
                            new MybtisPlus(
                            params.getId(),
                            params.getName(),
                            params.getAge(),
                            params.getEmail()));


    }




}
