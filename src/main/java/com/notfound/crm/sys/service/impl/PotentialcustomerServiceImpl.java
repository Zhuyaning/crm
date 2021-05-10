package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.mapper.PotentialcustomerMapper;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/10
 *   Time: 11:07
 */
@Service
public class PotentialcustomerServiceImpl extends BaseServiceImpl<PotentialcustomerForm> implements IPotentialcustomerService {

    @Autowired
    private PotentialcustomerMapper potentialcustomerMapper;

    public PotentialcustomerServiceImpl(PotentialcustomerMapper potentialcustomerMapper) {
        super(potentialcustomerMapper);
    }

}
