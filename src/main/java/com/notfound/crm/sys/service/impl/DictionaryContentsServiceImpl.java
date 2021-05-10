package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.DictionaryContentsFrom;
import com.notfound.crm.sys.mapper.DictionaryContentsMapper;
import com.notfound.crm.sys.service.IDictionaryContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 22:50
 * @Version 1.0
 * @Description
 */
@Service
public class DictionaryContentsServiceImpl extends BaseServiceImpl<DictionaryContentsFrom> implements IDictionaryContentsService {
    @Autowired
    private DictionaryContentsMapper dictionaryContentsMapper;

    public DictionaryContentsServiceImpl(DictionaryContentsMapper dictionaryContentsMapper) {
        super(dictionaryContentsMapper);
    }
}
