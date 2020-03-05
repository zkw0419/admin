package io.zkw.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zkw.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zkw.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.zkw.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
