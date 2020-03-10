package io.zkw.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zkw.jcartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return areturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);
}
