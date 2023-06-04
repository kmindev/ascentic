package com.backend.order.repository;

import com.backend.order.entity.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findFirstByMemberIdOrderByOrderNumDesc(String memberId);

    Order findByOrderId(String orderId);

    Order findByOrderIdAndMemberId(String orderId
            , String memberId);

    List<Order> findByOrderState(String orderState);

    List<Order> findAllByOrderByOrderNumDesc();

    List<Order> findByMemberId(String memberId);

    Order findByMemberIdAndOrderPaymentStateIsFalse(String memberId);
}
