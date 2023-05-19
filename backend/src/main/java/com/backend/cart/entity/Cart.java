package com.backend.cart.entity;

import com.backend.member.entity.Member;
import com.backend.productoption.entity.ProductOption;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_num")
    private Integer cartNum;

    @ManyToOne
    @JoinColumn(name = "option_num")
    private ProductOption productOption;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "prod_count")
    private Integer prodCount;
}

