package com.mengyunzhi.synthetical.service;

import com.mengyunzhi.synthetical.entity.Orders;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * @author zengsw
 * 订单Service
 */

public interface OrderService {

    /**
     * 新增订单
     */
    // TODO Orders insertOrder(Orders orders) throws AuthException;

    /**
     * 查找用户正在执行的订单
     */
    List<Orders>  findOrdersRunningByUser();

    /**
     * 查找用户已经完成的订单
     */
    List<Orders>  findOrdersCompletedByUser();

    /**
     * 订单综合查询
     */
    List<Orders> query(BigDecimal minPrice,
                       Date startDate,
                       Date endDate,
                       Float minDistance,
                       Float maxDistance);
}
