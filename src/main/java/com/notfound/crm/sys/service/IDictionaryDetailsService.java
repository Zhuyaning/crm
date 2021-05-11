package com.notfound.crm.sys.service;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.IBaseService;
import com.notfound.crm.sys.form.DictionaryDetailsFrom;
import com.notfound.crm.sys.vo.DictionaryDetailsVO;

import java.util.List;

/**
 * @author Zhengxiaolong
 * @Date 2021/5/10 22:57
 * @Version 1.0
 * @Description 字典详细业务层代码
 */
public interface IDictionaryDetailsService extends IBaseService<DictionaryDetailsFrom> {
    List<DictionaryDetailsVO> selectDicConTitle(Query query);
}
