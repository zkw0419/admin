package io.zkw.jcartstoreback.service.impl;

import io.zkw.jcartstoreback.dao.ReturnHistoryMapper;
import io.zkw.jcartstoreback.po.ReturnHistory;
import io.zkw.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;


    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);

        return returnHistories;
    }
}
