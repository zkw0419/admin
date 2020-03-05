package io.zkw.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zkw.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.zkw.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
