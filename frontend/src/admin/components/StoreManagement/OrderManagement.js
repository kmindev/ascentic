import React, { useState, useEffect } from "react";
import axios from "axios";
import styled from "styled-components";
import OrderList from "./OrderList";

const OrderManagement = () => {
  const [orders, setOrders] = useState([
    {
      //주문정보
      orderId: "주문번호",
      orderDate: "2023.06.01",
      orderState: "결제완료",
      //구매자정보
      memberId: "sungbin",
      orderName: "조성빈",
      orderTel: "01000000000",
      orderEmail: "test1@ascentic.com",
      //배송지정보
      shipName: "조성빈",
      shipTel: "01000000000",
      shipMainAddress: "경기 성남시 분당구 판교역로10번길 3",
      shipSubAddress: "101동 202호",
      shipMessage: "조심하게 오세용",
      //상품정보
      shipCharge: "3000",
      //   orderPriceSum: "",
      //   totalProdCount: "",
      //상품정보리스트
      orderProdDtoList: [
        {
          productNum: 1,
          prodImgName: "expProduct3.webp",
          prodName: "머스크 향수",
          optionName: "300ml",
          prodCount: 1,
          prodPrice: 29000,
        },
        {
          productNum: 2,
          prodImgName: "expProduct2.webp",
          prodName: "프루티 향초",
          optionName: "200g",
          prodPrice: 10000,
          prodCount: 2,
        },
      ],
      //결제정보
      orderPayment: "kakao",
      orderPaymentInfo: "결제정보",
      //배송정보
      shipCode: "",
    },
  ]);
  const [loading, setLoading] = useState(false);
  const [currentPage, setCurrentPage] = useState(1);
  const [category, setCategory] = useState("all");
  const [sortOption, setSortOption] = useState("early");

  //   useEffect(() => {
  //     const fetchData = async () => {
  //       setLoading(true);
  //       try {
  //         const res = await axios
  //           .get
  //           // `http://localhost:8080/subsProduct/list?scentnote=${category}`
  //           ();
  //         setOrders(res.data);
  //         console.log(res.data);
  //       } catch (e) {
  //         console.log(e);
  //       }
  //       setLoading(false);
  //     };
  //     fetchData();
  // if (sortOption === "early") {
  //   orders.sort((a, b) => {
  //     return new Date(b.orderDate) - new Date(a.orderDate);
  //   });
  // } else if(sortOption === "old"){
  //   orders.sort((a, b) => {
  //     return new Date(a.orderDate) - new Date(b.orderDate);
  //   });
  // }
  //     setCurrentPage(1);
  //   }, [category]);

  // 대기 중일 때
  if (loading) {
    // return <Loading isLoading={loading} />;
  }
  // 아직 값이 설정되지 않았을 때
  if (!orders) {
    return null;
  }
  return (
    <div>
      <HeaderWrap>
        <HeaderLeft>주문 관리</HeaderLeft>
        <HeaderRight></HeaderRight>
      </HeaderWrap>
      <InputContainer>
        <OrderCategoryBox>
          <button
            className={category === "all" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("all")}
          >
            전체보기
          </button>
          <button
            className={category === "결제완료" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("결제완료")}
          >
            결제완료
          </button>
          <button
            className={category === "배송준비중" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("배송준비중")}
          >
            배송준비중
          </button>
          <button
            className={category === "배송중" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("배송중")}
          >
            배송중
          </button>
          <button
            className={category === "배송완료" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("배송완료")}
          >
            배송완료
          </button>
          <button
            className={category === "주문취소" ? "activeCateBtn" : "cateBtn"}
            onClick={() => setCategory("주문취소")}
          >
            주문취소
          </button>
        </OrderCategoryBox>
        <SortOptionBox>
          <button
            className={sortOption === "early" ? "active" : ""}
            onClick={() => setSortOption("early")}
          >
            최근순
          </button>
          <button
            className={sortOption === "old" ? "active" : ""}
            onClick={() => setSortOption("old")}
          >
            오래된순
          </button>
        </SortOptionBox>
        <ListWrapper>
          <ListBox>
            <ContentTitle>
              <NumTitle>주문번호</NumTitle>
              <DateTitle>주문일</DateTitle>
              <NameTitle>주문자</NameTitle>
              <ProdTitle>주문상품정보</ProdTitle>
              <PriceTitle>금액</PriceTitle>
              <PayTitle>결제정보</PayTitle>
              <ShipmentTitle>송장번호</ShipmentTitle>
              <StatusTitle>주문상태</StatusTitle>
              <EditTitle>수정</EditTitle>
            </ContentTitle>
          </ListBox>
          <OrderList
            orders={orders}
            currentPage={currentPage}
            setCurrentPage={setCurrentPage}
          />
        </ListWrapper>
      </InputContainer>
    </div>
  );
};

const HeaderWrap = styled.div`
  display: flex;
  justify-content: space-between;
  width: 90%;
  margin: 0 auto;
  padding-top: 30px;
  border-bottom: 2px solid black;
`;

const HeaderLeft = styled.div`
  padding: 20px 0;
  font-size: 30px;
  font-weight: 600;
`;

const HeaderRight = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: end;
`;
const InputContainer = styled.div`
  width: 90%;
  height: 90%;
  margin: 0 auto;
`;
const OrderCategoryBox = styled.div`
  padding: 0 auto;
  margin-top: 10px;
  width: 100%;
  display: flex;
  justify-content: center;
  button {
    margin: 10px;
    padding: 10px;
    font-size: 1.3rem;
    background-color: white;
    border: 0;
    cursor: pointer;
  }
  .activeCateBtn,
  .cateBtn:hover {
    font-weight: 600;
    border-bottom: 2px solid black;
  }
`;
const SortOptionBox = styled.div`
  width: 95%;
  display: flex;
  justify-content: flex-end;
  padding: 0;
  button {
    background-color: white;
    border: 0;
    font-size: 1rem;
    font-weight: 400;
    margin: 0 5px 20px 5px;
    cursor: pointer;
  }
  .active {
    font-weight: 600;
    cursor: default;
  }
`;
const ListWrapper = styled.div`
  margin: 0 auto;
  width: 90%;
`;
const ListBox = styled.div`
  margin-top: 0;
  border-top: 1px solid gray;
  border-bottom: 1px solid gray;
  background-color: rgba(250, 250, 250, 1);
`;
const ContentTitle = styled.div`
  height: 40px;
  font-size: 1rem;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  text-align: center;
  div {
    margin: 0 10px;
    font-weight: 600;
    color: rgba(100, 100, 100, 1);
  }
`;
const NumTitle = styled.div`
  width: 8%;
`;
const DateTitle = styled.div`
  width: 10%;
`;
const NameTitle = styled.div`
  width: 12%;
`;
const ProdTitle = styled.div`
  width: 13%;
`;
const PriceTitle = styled.div`
  width: 8%;
`;
const PayTitle = styled.div`
  width: 10%;
`;
const ShipmentTitle = styled.div`
  width: 12%;
`;
const StatusTitle = styled.div`
  display: flex;
  width: 5%;
`;
const EditTitle = styled.div`
  width: 5%;
`;
export default OrderManagement;
