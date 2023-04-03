package com.zhuang.order.service;

import com.zhuang.order.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    Long create(Order order);
}