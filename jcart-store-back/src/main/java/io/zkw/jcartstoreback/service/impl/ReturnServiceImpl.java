package io.zkw.jcartstoreback.service.impl;

import io.zkw.jcartstoreback.dao.ReturnMapper;
import io.zkw.jcartstoreback.po.Return;
import io.zkw.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return areturn) {
        returnMapper.insertSelective(areturn);
        Integer returnId = areturn.getReturnId();

        return returnId;
    }
}
