# 🎯 주문 시스템 API 구현 과제

## 📋 과제 개요
기존 Main 클래스에 있는 4개의 메서드를 Spring Boot API로 변환하는 과제입니다.

## 🎯 구현해야 할 기능

### 1. 주문하기 (addOrder)
- **기능**: 가게와 음식 리스트를 받아서 주문을 생성
- **입력**: 가게 코드, 음식 ID 리스트
- **출력**: 생성된 주문 정보

### 2. 주문 취소하기 (cancelOrder)
- **기능**: 주문 ID를 받아서 해당 주문을 취소
- **입력**: 주문 ID
- **출력**: 취소 성공/실패 메시지

### 3. 가게별 하루 총 매출 계산 (calculateTotalSales)
- **기능**: 가게 코드를 받아서 해당 가게의 총 매출 계산
- **입력**: 가게 코드
- **출력**: 총 매출액

### 4. 가게별 객단가 계산 (calculateAverageOrderValue)
- **기능**: 가게 코드를 받아서 해당 가게의 평균 주문 금액 계산
- **입력**: 가게 코드
- **출력**: 평균 주문 금액

## 🏗️ 구현해야 할 클래스들

### 1. DTO 클래스들
- `OrderRequestDto`: 주문 요청 데이터
- `OrderResponseDto`: 주문 응답 데이터
- `FoodDto`: 음식 정보 데이터
- `SalesResponseDto`: 매출 정보 데이터
- `ApiResponseDto<T>`: 공통 API 응답 데이터

### 2. Service 클래스
- `OrderService`: 주문 관련 비즈니스 로직 처리

### 3. Controller 클래스
- `OrderController`: REST API 엔드포인트 제공

## 📁 파일 구조
```
src/main/java/org/example/
├── dto/
│   ├── OrderRequestDto.java
│   ├── OrderResponseDto.java
│   ├── FoodDto.java
│   ├── SalesResponseDto.java
│   └── ApiResponseDto.java
├── service/
│   └── OrderService.java
├── controller/
│   └── OrderController.java
└── Main.java
```

## 🔧 구현 단계

### Step 1: DTO 클래스 구현
각 DTO 클래스에 필요한 필드와 getter/setter 메서드를 구현하세요.

### Step 2: Service 클래스 구현
OrderService의 각 메서드에 비즈니스 로직을 구현하세요.

### Step 3: Controller 클래스 구현
OrderController의 각 엔드포인트에 적절한 HTTP 응답을 구현하세요.

## 📡 API 엔드포인트

| 메서드 | URL | 설명 |
|--------|-----|------|
| POST | `/api/orders` | 주문하기 |
| PUT | `/api/orders/{id}/cancel` | 주문 취소하기 |
| GET | `/api/orders/sales/{storeCode}` | 가게별 총 매출 계산 |
| GET | `/api/orders/average/{storeCode}` | 가게별 객단가 계산 |

## 🧪 테스트 방법

1. **애플리케이션 실행**
   ```bash
   ./gradlew bootRun
   ```

2. **API 테스트**
   - Postman 사용
   - curl 명령어 사용
   - Swagger UI: `http://localhost:8080/swagger-ui.html`

## 💡 힌트

- 기존 Main 클래스의 로직을 참고하여 구현하세요
- Spring Boot의 `@RestController`, `@Service` 어노테이션을 활용하세요
- 적절한 HTTP 상태 코드를 반환하세요
- 에러 처리를 고려하세요

## ✅ 완성 체크리스트

- [ ] OrderRequestDto 구현 완료
- [ ] OrderResponseDto 구현 완료
- [ ] FoodDto 구현 완료
- [ ] SalesResponseDto 구현 완료
- [ ] ApiResponseDto 구현 완료
- [ ] OrderService 구현 완료
- [ ] OrderController 구현 완료
- [ ] API 테스트 완료

## 🚀 도전 과제 (선택사항)

- 데이터베이스 연동
- 유효성 검증 추가
- 로깅 기능 추가
- 단위 테스트 작성

**화이팅! 💪**
