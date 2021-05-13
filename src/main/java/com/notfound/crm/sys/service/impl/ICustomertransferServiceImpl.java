package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.domain.Customertransfer;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.mapper.CustomertransferMapper;
import com.notfound.crm.sys.mapper.PotentialcustomerMapper;
import com.notfound.crm.sys.service.ICustomertransferService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 10:26
 * @Version 1.0
 * @Description
 */
@Service
public class ICustomertransferServiceImpl extends BaseServiceImpl<CustomertransferFrom> implements ICustomertransferService {
    @Autowired
    private CustomertransferMapper customertransferMapper;
    @Autowired
    private PotentialcustomerMapper potentialcustomerMapper;

    @Autowired
    private SqlSession sqlSession;
    public ICustomertransferServiceImpl(CustomertransferMapper customertransferMapper) {
        super(customertransferMapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result inputAndUpdate(CustomertransferFrom customertransferFrom, PotentialcustomerForm potentialcustomerForm) {
//        Result query = employeeService.query(id);
//        Result query1 = potentialcustomerService.query(id);
        ValidatorUtil.validator(customertransferFrom);
        customertransferMapper.insert(customertransferFrom);
        ValidatorUtil.validator(potentialcustomerForm);
        potentialcustomerMapper.update(potentialcustomerForm);

        return new Result();
    }
}
