package com.liujie.mybtaisplus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liujie.mybtaisplus.pojo.MybtisPlus;
import com.liujie.mybtaisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: LiuJ
 * @Date: 2020/4/17
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 通过ID查询
     * @param params 编号
     * @return 返回结果
     */
    @RequestMapping(value = "/selectById",method = RequestMethod.POST)
    public MybtisPlus selectById(@RequestParam String params){
       return userService.selectById(params);
    }

    /**
     * 通过ID批量查询
     * @param params 编号
     * @return 返回结果
     */
    @RequestMapping(value = "/selectBatchIds",method = RequestMethod.POST)
    public List<MybtisPlus> selectBatchIds(@RequestParam List<Integer> params){
        return userService.selectBatchIds(params);
    }

    /**
     * 通过name模糊查询
     * @param params 编号
     * @return 返回结果
     */
    @RequestMapping(value = "/QuerWrapper",method = RequestMethod.POST)
    public List<MybtisPlus> QuerWrapper(@RequestParam Map<String,Object> params){
        return userService.QuerWrapper(params);
    }


    /**
     * 分页查询
     * @param params 编号
     * @return 返回结果
     */
    @RequestMapping(value = "/selectPage",method = RequestMethod.POST)
    public List selectPage(@RequestParam Map<String,Object> params){
        return userService.selectPage(params);
    }


    /**
     * 添加
     * @param params 参数列表
     * @return 返回结果
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(@RequestParam Map<String,Object> params){

        MybtisPlus mybtisPlus = new MybtisPlus();
        mybtisPlus.setId(Long.parseLong(params.get("id").toString()));
        mybtisPlus.setName(params.get("name").toString());
        mybtisPlus.setAge(Integer.parseInt(params.get("age").toString()));
        mybtisPlus.setEmail(params.get("email").toString());

        int insert = userService.insert(mybtisPlus);

        if (insert > 0){
            return "添加成功";
        }
        return "添加失败";

    }

    /**
     * 根据ID执行修改操作
     * @param params 参数列表
     * @return 返回结果
     */
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public String updateById(@RequestParam Map<String,Object> params){

        MybtisPlus mybtisPlus = new MybtisPlus();
        mybtisPlus.setId(Long.parseLong(params.get("id").toString()));
        mybtisPlus.setName(params.get("name").toString());
        mybtisPlus.setAge(Integer.parseInt(params.get("age").toString()));
        mybtisPlus.setEmail(params.get("email").toString());

        int insert = userService.updateById(mybtisPlus);

        if (insert > 0){
            return "修改成功";
        }
        return "修改失败";

    }

}
