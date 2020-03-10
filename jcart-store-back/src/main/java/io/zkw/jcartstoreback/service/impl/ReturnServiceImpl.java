package io.zkw.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @Override
    public Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> page = returnMapper.selectPageByCustomerId(customerId);
        return page;
    }

    @Override
    public Return getById(Integer returnId) {
        Return aReturn = returnMapper.selectByPrimaryKey(returnId);
        return aReturn;
    }
}
