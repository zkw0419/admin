package io.zkw.jcartstoreback.service;

import io.zkw.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zkw.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
