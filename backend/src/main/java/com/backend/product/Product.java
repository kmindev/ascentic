package com.backend.product;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_num;

//    @ManyToOne
    @Column(nullable = false, length = 20)
    private String user_id;

//    @Column(name = "review_id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long reviewId;
//
//    @Column(name = "info_key", nullable = false, length = 10)
//    private String infoKey;
//
//    @Column(name = "info_code1", nullable = false, length = 10)
//    private String infoCode1;
//
//    @Column(name = "info_code2", nullable = false, length = 10)
//    private String infoCode2;
//
//    @Column(name = "prod_name", nullable = false, length = 20)
//    private String prodName;
//
//    @Column(name = "prod_category", nullable = false, length = 5)
//    private String prodCategory;
//
//    @Column(name = "prod_price", nullable = false)
//    private Integer prodPrice;
//
//    @Column(name = "prod_stock", nullable = false)
//    private Integer prodStock;
//
//    @Column(name = "prod_tag", nullable = false, length = 50)
//    private String prodTag;
//
//    @Column(name = "prod_info", nullable = false, length = 50)
//    private String prodInfo;
//
//    @Column(name = "prod_date", nullable = false)
//    private LocalDateTime prodDate;
//
//    @Column(name = "prod_readcount", nullable = false)
//    private Integer prodReadCount;
//
//    @Column(name = "prod_wish", nullable = false)
//    private Integer prodWish;
//
//    @Column(name = "prod_code", nullable = false)
//    private Integer prodCode;
//
//    @Column(name = "prod_images", length = 1000)
//    private String prodImages;
//
//    @Column(name = "prod_volume")
//    private Integer prodVolume;
}