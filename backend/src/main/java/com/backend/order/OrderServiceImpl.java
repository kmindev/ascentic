package com.backend.order;

import com.backend.member.Member;
import com.backend.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;

    @Override
    public Order insertOrder(String memberId, Order order) {
        Member member = memberRepository.findById(memberId).orElse(null);
        order.setMember(member);
        return orderRepository.save(order);
    }

    @Override
    public Order getRecentAddr(String memberId) {
//        AddressDTO addressDTO = orderRepository.findRecentAddressByMemberId(memberId).orElse(null);
        Member member = memberRepository.findById(memberId).orElse(null);
        Order order = orderRepository.findTopByMember(member);
        return order;
    }
}