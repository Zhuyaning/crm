package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.DictionaryDetailsFrom;
import com.notfound.crm.sys.mapper.DictionaryDetailsMapper;
import com.notfound.crm.sys.service.IDictionaryDetailsService;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.DictionaryDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 22:59
 * @Version 1.0
 * @Description
 */
@Service
public class DictionaryDetailsServiceImpl extends BaseServiceImpl<DictionaryDetailsFrom> implements IDictionaryDetailsService {
    @Autowired
    private DictionaryDetailsMapper dictionaryDetailsMapper;

    public DictionaryDetailsServiceImpl(DictionaryDetailsMapper dictionaryDetailsMapper) {
        super(dictionaryDetailsMapper);
    }

    @Override
    public List<DictionaryDetailsVO> selectDicConTitle(ExtendsQuery query) {

        return dictionaryDetailsMapper.selectDicConTitle(query);
    }
}
