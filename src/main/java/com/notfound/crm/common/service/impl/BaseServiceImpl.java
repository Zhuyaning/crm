package com.notfound.crm.common.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.notfound.crm.common.service.IBaseService;
import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.mapper.BaseMapper;

import java.util.List;

/**
 * @author Wan_JiaLin
 * @Create 2021-05-02 15:08
 * @Description:
 */
public class BaseServiceImpl<F> implements IBaseService<F> {

    private BaseMapper baseMapper;

    public BaseServiceImpl(BaseMapper baseMapper){this.baseMapper=baseMapper;}

    @Override
    public Result add(F f) {
        baseMapper.insert(f);
        return new Result();
    }

    @Override
    public Result delete(Long id) {
        baseMapper.delete(id);
        return new Result();
    }

    @Override
    public Result Update(F f) {
        baseMapper.update(f);
        return new Result();
    }

    @Override
    public Result query(Long id) {
        Object data = baseMapper.selectOne(id);

        return new Result(data);
    }

    @Override
    public Result queryPage(Query query) {
        Page<Object> data = PageHelper.startPage(query.getCurrentPage(), query.getPageSize());

        List list = baseMapper.selectList(query);

        PageInfo pageData = new PageInfo(data.getPageNum(), data.getPageSize(), data.getTotal(), list);

        return new Result(pageData);
    }
}
