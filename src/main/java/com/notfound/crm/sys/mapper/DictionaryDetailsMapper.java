package com.notfound.crm.sys.mapper;

import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.sys.form.DictionaryDetailsFrom;
import com.notfound.crm.sys.vo.DictionaryDetailsVO;

import java.util.List;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 21:19
 * @Version 1.0
 * @Description 字典明细持久层（CRUD）
 */
public interface DictionaryDetailsMapper extends BaseMapper<DictionaryDetailsFrom, DictionaryDetailsVO> {
    List<DictionaryDetailsVO> selectDicConTitle(DictionaryDetailsVO dictionaryDetailsVO);
}
