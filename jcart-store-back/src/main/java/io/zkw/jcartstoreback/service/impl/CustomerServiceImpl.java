package io.zkw.jcartstoreback.service.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.zkw.jcartstoreback.enumeration.CustomerStatus;
import io.zkw.jcartstoreback.dao.CustomerMapper;
import io.zkw.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zkw.jcartstoreback.po.Customer;
import io.zkw.jcartstoreback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Integer register(CustomerRegisterInDTO customerRegisterInDTO) {

        Customer customer = new Customer();
        customer.setUsername(customerRegisterInDTO.getUsername());
        customer.setRealName(customerRegisterInDTO.getRealName());
        customer.setEmail(customerRegisterInDTO.getEmail());
        customer.setEmailVerified(false);
        customer.setMobile(customerRegisterInDTO.getMobile());
        customer.setMobileVerified(false);
        customer.setNewsSubscribed(customerRegisterInDTO.getNewsSubscribed());
        customer.setCreateTime(new Date());
        customer.setStatus((byte) CustomerStatus.Enable.ordinal());
        customer.setRewordPoints(0);

        String password = customerRegisterInDTO.getPassword();
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        customer.setEncryptedPassword(bcryptHashString);

        customerMapper.insertSelective(customer);
        Integer customerId = customer.getCustomerId();

        return customerId;
    }

    @Override
    public Customer getByUsername(String username) {
        Customer customer = customerMapper.selectByUsername(username);
        return customer;
    }

    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }

    @Override
    public Customer getByEmail(String email) {
        Customer customer = customerMapper.selectByEmail(email);
        return customer;
    }

    @Override
    public void update(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
