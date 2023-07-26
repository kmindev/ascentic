# 🌸ascentic

## 🖇Notion Link



(https://dented-bell-59e.notion.site/ascentic-95bedf2355ae443d81bfed57e146cee7?pvs=4)

## 💡프로젝트 소개



- 향 제품을 구독·판매하는 웹 쇼핑몰입니다.
- 시중에 존재하는 너무 많은 향으로 인해 이름만 들어서 어떤 향인지 판단하기가 쉽지 않습니다.
- 이러한 문제점을 해결하기 위해 기획한 내용입니다.
    - 사용자가 간단한 취향 테스트를 통해 본인의 취향을 찾습니다.
    - 구독 서비스를 통해 원하는 향을 구독해 다양한 상품을 정기 배송으로 받아보며 본인 취향을 찾을 수 있습니다.
    - 여러 향 제품들을 구매할 수 있는 쇼핑몰을 구매할 수 있습니다.
- 멀티캠퍼스 풀스택(Java) 개발자 취업캠프 최종 프로젝트

## 👨‍👨‍👧‍👧팀 소개



- 나해성(팀장)
- 강경민
- 조성빈
- 조한식
- 전채은
- 황성민

## ✋역할
- ERD 설계와 DB 성능 개선
    - 데이터 중복을 최소화하기 위해 ERD를 설계했으나, 구현 또는 테스트 단계에서 특정 문제점이 발견되어 ERD를 대폭 수정하며 성능을 향상
- 코드의 가독성 개선
    - 코드의 가독성이 떨어지는 부분을 개선하기 위해 방법을 찾아 보았고, 특히 Stream을 적극 활용하고 메서드를 분리하는 등 가독성과 유지 보수성을 향상
- 스토어 서비스 관련 조회, 구매, 관리 설계 및 구현
    - 유연한 상품 옵션 구조를 설계하여 다양한 옵션 조합을 처리하고, 관리자가 여러 상품을 효율적으로 관리하고 실시간으로 판매 여부를 결정할 수 있도록 구현
    - 결제 시 포인트 적립과 결제 취소에 따른 데이터의 일관성을 유지하는 것이 중요. 포인트 적립과 반납 로직을 설계 및 구현하여 포인트 일관성을 유지
- 취향 테스트를 통해 취향 결과 제공 기능 설계 및 구현
    - 취향 테스트 대한 응답을 분석하여 사용자의 취향 결과를 도출하는 부분에서 데이터 처리와 알고리즘 선택에 대한 고민
    - 적절한 규칙에 따라 응답을 평가하여 취향 결과를 제공하도록 구현


## 🛠기술 스택



### Front-End
- `React.js`
- `redux-toolkit`

### Back-End
- `Spring Boot`
- `Spring Security`
- `JPA(Java Persistence API)`
- `JJWT`
  
### Database
- `MySQL`
  
### Open API
- `kakao 로그인 API`
- `Toss Payments 결제 API`

## 📅수행 절차



### 사전 기획

(04.18 ~ 04.23)

- 프로젝트 기획 및 주제 선정
- 아이디어와 세부사항 회의
- 아이디어 선정 기획안 작성

### 구현 및 테스트1

(04.31 ~ 05.12)

- 팀별 작업
- 프론트엔드/백엔드 기본 서비스 기능 구현
- 테스트

### 구현 및 테스트2

(05.24 ~ 06.05)

- 외부 API 연결
- 관리자 페이지 구현
- 예외처리
- 결제 구현
- 최종 점검

### 요구 사항 분석/설계

(04.24 ~ 04.30)

- 요구사항 분석
- 시스템 기능 도출
- UI 설계
- ERD 설계

### 재구성 및 수정

(05.13 ~ 05.19)

- DB 수정
- 샘플 데이터 삽입
- 스타일 재정비 작업
- 코드 재정비 작업

## 🔠페이지 구조도



- **사용자** 페이지 구조도

![Untitled](https://github.com/kmindev/ascentic/assets/97210232/9f8ecce4-337d-4a43-87b8-7cf95a191a9d)



- **관리자** 페이지 구조도

![Untitled 1](https://github.com/kmindev/ascentic/assets/97210232/368d38c1-889b-46ea-854f-1cd26b25b25d)


## 📚데이터베이스 설계



![Untitled 2](https://github.com/kmindev/ascentic/assets/97210232/6e3d9e64-ed40-4255-921f-e4085a59747e)


## ‼기능 소개

![Untitled 3](https://github.com/kmindev/ascentic/assets/97210232/4824f29a-51a3-4675-884d-58f2cb56f0df)




## ⭐페이지 소개

![image](https://github.com/kmindev/ascentic/assets/97210232/c8828402-432a-4725-8275-6b7fa2d81a5b)
![image](https://github.com/kmindev/ascentic/assets/97210232/5a493c1b-0169-4047-8465-51590098e973)
![image](https://github.com/kmindev/ascentic/assets/97210232/9887199b-571a-4b29-9d3f-d056ed66b978)
![image](https://github.com/kmindev/ascentic/assets/97210232/90061afb-446a-41de-920c-0981321ab9a2)
![image](https://github.com/kmindev/ascentic/assets/97210232/9fd091f9-c8a9-4dbb-bdfd-05e572661e00)
![image](https://github.com/kmindev/ascentic/assets/97210232/0d88e22a-bda2-49aa-bd8d-9c0e68a65e9f)
![image](https://github.com/kmindev/ascentic/assets/97210232/c1912d18-75bc-4090-9849-84ad7037b943)
![image](https://github.com/kmindev/ascentic/assets/97210232/ee9a78f5-8af5-4c74-8fb9-a28d94363812)
![image](https://github.com/kmindev/ascentic/assets/97210232/426c72de-6c20-4438-9afb-ae36614143d5)
![image](https://github.com/kmindev/ascentic/assets/97210232/0296c799-7316-4ab5-b790-cfb87cf7d1c1)
![image](https://github.com/kmindev/ascentic/assets/97210232/c968ff09-546b-4340-b29f-feba8cce5ec0)
![image](https://github.com/kmindev/ascentic/assets/97210232/34a0f891-60e4-4a23-9af5-2995269a181c)
![image](https://github.com/kmindev/ascentic/assets/97210232/856420b1-1491-4740-b3fe-55377502e750)
![image](https://github.com/kmindev/ascentic/assets/97210232/dbd9aed6-ae81-49ea-98f1-47bdaebcd39c)
![image](https://github.com/kmindev/ascentic/assets/97210232/5e151285-f21d-4e3e-bc13-b33f58275f7d)
![image](https://github.com/kmindev/ascentic/assets/97210232/bb37fea0-cafc-49df-aa37-2f33773b9f52)
![image](https://github.com/kmindev/ascentic/assets/97210232/0d6b9885-a827-449c-8d98-1e2d5146848e)
![image](https://github.com/kmindev/ascentic/assets/97210232/358f39ee-7f0a-4541-a4b7-1c01d31ba286)
![image](https://github.com/kmindev/ascentic/assets/97210232/5df9b68a-6f2e-436c-9f8b-9fe88a09d663)
![image](https://github.com/kmindev/ascentic/assets/97210232/051e6d48-4074-491d-a452-db0fcd32c785)






