package io.zkw.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.zkw.jcartadministrationback.dao.OrderDetailMapper;
import io.zkw.jcartadministrationback.dao.OrderMapper;
import io.zkw.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zkw.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.zkw.jcartadministrationback.po.Order;
import io.zkw.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {

        PageHelper.startPage(pageNum, 10);
        Page<OrderListOutDTO> page = orderMapper.search();
        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        return null;
    }

    @Override
    public void update(Order order) {

    }
}
