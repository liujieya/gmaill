package com.liujie.gmaill.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;


/**
 * @author: LiuJ
 * @Date: 2020/4/15
 * @Description: 分页工具类
 */
@ApiModel
@Data
public class PageVo{

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 每页记录数
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 当前页数
     */
    private int currPage;

    /**
     * 列表参数
     * 通配符集合
     */
    private List<?> list;

    /**
     * 分页
     * @param list          列表数据
     * @param totalCount    总记录数
     * @param pageSize      每页记录数
     * @param currPage      当前页数
     */
    public PageVo(List<?> list,int totalCount,int pageSize,int currPage){
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage =  currPage;
        this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
    }

    /**
     * 分页
     */
    public PageVo(IPage<?> page){
        this.list = page.getRecords();
        this.totalCount = (int)page.getTotal();
        this.pageSize = (int)page.getSize();
        this.currPage = (int)page.getCurrent();
        this.totalPage = (int)page.getPages();
    }

}
