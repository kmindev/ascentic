# INSERT INTO tb_inquiry (member_id, inquiry_title, inquiry_content, inquiry_date, inquiry_category, inquiry_comment,
#                         inquiry_state, comment_date)
# VALUES
#     ('chaeeun', '상품 문의입니다.', '상품에 대해 궁금한 점이 있어 문의드립니다.', '2023-05-23 14:20:00', '상품 문의', NULL, '미답변', NULL),
#     ('haesung', '배송 문의입니다.', '주문한 상품의 배송일정을 알고 싶습니다.', '2023-05-22 11:10:00', '배송 문의', NULL, '미답변', NULL),
#     ('hansic', '반품 요청합니다.', '상품을 다른 것으로 교환하거나 반품하고 싶습니다.', '2023-05-21 16:45:00', '반품/교환 문의', NULL, '미답변', NULL),
#     ('kyungmin', '결제 문제입니다.', '결제가 제대로 이루어지지 않습니다.', '2023-05-20 09:30:00', '결제 문제', NULL, '미답변', NULL),
#     ('sungbin', '서비스 문의드립니다.', '서비스 이용 방법에 대해 문의드립니다.', '2023-05-19 13:50:00', '서비스 문의', NULL, '미답변', NULL);

INSERT INTO tb_inquiry (member_id, inquiry_title, inquiry_content, inquiry_date, inquiry_category, inquiry_comment, inquiry_state, comment_date)
VALUES
    ('chaeeun', '상품 문의입니다.', '상품에 대해 궁금한 점이 있어 문의드립니다.', '2023-05-23 14:20:00', '상품 문의', '문의하신 내용에 대해 다음과 같이 답변드립니다. 상품 문의에 관련하여 자세한 내용은 홈페이지를 통해 확인하실 수 있습니다.', true, '2023-05-24 09:30:00'),
    ('haesung', '배송 문의입니다.', '주문한 상품의 배송일정을 알고 싶습니다.', '2023-05-22 11:10:00', '배송 문의', '주문하신 상품의 배송일정은 곧 안내해 드리겠습니다. 현재 조속히 처리 중에 있습니다.', true, '2023-05-23 10:45:00'),
    ('hansic', '반품 요청합니다.', '상품을 다른 것으로 교환하거나 반품하고 싶습니다.', '2023-05-21 16:45:00', '반품/교환 문의', '반품/교환 절차와 관련하여 안내를 드립니다. 상세한 내용은 공지사항을 참고해주세요.', true, '2023-05-22 14:20:00'),
    ('kyungmin', '결제 문제입니다.', '결제가 제대로 이루어지지 않습니다.', '2023-05-20 09:30:00', '결제 문제', NULL, false, NULL),
    ('kyungmin', '결제 문제입니다.', '결제가 제대로 이루어지지 않습니다.', '2023-05-20 09:30:00', '결제 문제', '불편을 드려서 죄송합니다.', true, '2023-05-10'),
    ('sungbin', '서비스 문의드립니다.', '서비스 이용 방법에 대해 문의드립니다.', '2023-05-19 13:50:00', '서비스 문의', NULL , false, NULL);