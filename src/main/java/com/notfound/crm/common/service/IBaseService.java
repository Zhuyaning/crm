package com.notfound.crm.common.service;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:14
 * @Description:
 */
public interface IBaseService<F> {

    /**
     * 插入一条新数据
     * @param f
     * @return
     */
    Result add(F f);

    /**
     * 根据id删除一条数据
     * @param id
     * @return
     */
    Result delete(Long id);

    /**
     * 更新一条数据
     * @param f
     * @return
     */
    Result Update(F f);

    /**
     * 根据id查询一条数据
     * @param id
     * @return
     */
    Result query(Long id);

    /**
     * 根据条件查询数据
     * @param query
     * @return
     */
    Result queryPage(Query query);

}
