package io.zkw.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zkw.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zkw.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zkw.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                     Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
