-- insert into tb_subscribe_send (sb_send_num, sb_send_paydate, sb_send_payment, sb_send_postcode,
--                                sb_send_review, sb_send_score, sb_member_num, sp_num)
-- values (1,  '2023-05-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', '향이 너무 좋습니다!!!', 4,  1, 2),
--        (2,  '2023-04-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', '빠른 배송 정말 좋습니닿ㅎㅎ', 5,  1, 1),
--        (3,  '2023-03-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', '향이 너무 좋습니다!!!', 5, 1, 1),
--        (4, '2023-02-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', '평생 구독할거에욥ㅂ', 5,  1, 1),
--        (5,  '2023-01-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', 'ascentic 최고!!!!!', 5,  1, 2),
--        (6,  '2022-12-05', 'naver', '경기 성남시 분당구 판교역로10번길 3', '좋은 냄새가 나요 !!!!!', 5,  1, 3),
--        (8, '2023-04-15', 'kakao', '경기 수원시 팔달구 효원로 241', '향이 내 취향이에요 ㅜㅜㅜ', 3,  2, 4),
--        (9,  '2023-03-15', 'kakao', '경기 수원시 팔달구 효원로 241', '향이 내 취향이에요 ㅜㅜㅜ', 3,  2, 5),
--        (10,  '2023-02-15', 'kakao', '경기 수원시 팔달구 효원로 241', '냄새가 너무 좋아여 ㅎㅎㅎ', 3, 2, 6),
--        (11,  '2023-04-07', 'card', '부산 연제구 중앙대로 1001', '믿고 쓰는 ascntic!!!', 2, 3, 4),
--        (12,  '2023-05-07', 'card', '부산 연제구 중앙대로 1001', '빠른 배송 정말 좋습니닿ㅎㅎ', 1, 3, 3);
--
-- -- 상세 주소는?, 구독평점은 소수점으로 와야할 듯

insert into ascentic.tb_subscribe_send (sb_send_num, sb_send_paydate, sb_send_payment, sb_send_postcode, sb_send_review, sb_send_score, sb_send_state, sb_shipping_code, sb_member_num, sp_num)
values  (1, '2023-02-05', 'naver', '경기 성남시 분당구 판교역로10번길  101동 202호', '향이 너무 좋습니다!!!', 4, '배송완료', "2578971", 1, 2),
        (2, '2023-02-15', 'kakao', '경기 수원시 팔달구 효원로 241 203동 401호', '빠른 배송 정말 좋습니닿ㅎㅎ', 3, '배송완료', "398751", 2, 6),
        (3, '2023-03-05', 'naver', '경기 성남시 분당구 판교역로10번길 3 101동 202호', '평생 구독할거에욥ㅂ', 4, '배송완료', "3598748", 1, 4),
        (4, '2023-03-15', 'kakao', '경기 수원시 팔달구 효원로 241 203동 401호', '향이 내 취향이에요 ㅜㅜㅜ', 3, '배송완료', "257632", 2, 5),
        (5, '2023-04-05', 'naver', '경기 성남시 분당구 판교역로10번길 3 101동 202호', '좋은 냄새가 나요 !!!!!', 3, '배송완료', "6879654", 1, 3),
        (6, '2023-04-15', 'kakao', '경기 수원시 팔달구 효원로 241 203동 401호', '향이 내 취향이에요 ㅜㅜㅜ', 3, '배송완료', "612897", 2, 4),
        (7, '2023-05-05', 'naver', '경기 성남시 분당구 판교역로10번길 3 101동 202호', '믿고 쓰는 ascntic!!!', 3, '배송완료', "2478956", 1, 5),
        (8, '2023-06-01', 'card', '부산 연제구 중앙대로 1001 103동 1501호', '믿고 쓰는 ascntic!!!', 2, '배송중', "254789", 3, 4),
        (9, '2023-06-02', 'card', '부산 연제구 중앙대로 832 503동 1101호', null, null, '배송준비중', null, 4, 3),
        (10, '2023-06-04', 'card', '경상남도 창원시 성산구 창원대로 1086 503동 102호', null, null, '결제완료', null, 4, 3),
        (11, '2023-06-05', 'naver', '경기 성남시 분당구 판교역로10번길 3 101동 202호', null, null, '상품준비중', null, 1, 5);
