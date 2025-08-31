# 주문 시스템 API 테스트 가이드

## API 엔드포인트

### 1. 주문하기
- **URL**: `POST /api/orders`
- **Request Body**:
```json
{
  "storeCode": "S001",
  "foodIds": [1, 2]
}
```
- **Response**:
```json
{
  "success": true,
  "message": "주문이 성공적으로 생성되었습니다.",
  "data": {
    "id": 3,
    "storeCode": "S001",
    "storeName": "한식당",
    "foods": [
      {
        "id": 1,
        "title": "김치찌개",
        "description": "매콤한 김치찌개",
        "price": 8000
      },
      {
        "id": 2,
        "title": "된장찌개",
        "description": "구수한 된장찌개",
        "price": 7000
      }
    ],
    "totalPrice": 15000,
    "isCanceled": false,
    "createdAt": "2024-01-01T12:00:00",
    "canceledAt": null
  }
}
```

### 2. 주문 취소하기
- **URL**: `PUT /api/orders/{id}/cancel`
- **Path Variable**: `id` - 취소할 주문 ID
- **Response**:
```json
{
  "success": true,
  "message": "주문 ID: 1 가 취소되었습니다.",
  "data": "주문이 성공적으로 취소되었습니다."
}
```

### 3. 가게별 총 매출 계산
- **URL**: `GET /api/orders/sales/{storeCode}`
- **Path Variable**: `storeCode` - 가게 코드 (예: S001, S002)
- **Response**:
```json
{
  "success": true,
  "message": "성공",
  "data": {
    "storeCode": "S001",
    "storeName": "한식당",
    "totalSales": 15000,
    "averageOrderValue": 0,
    "orderCount": 1
  }
}
```

### 4. 가게별 객단가 계산
- **URL**: `GET /api/orders/average/{storeCode}`
- **Path Variable**: `storeCode` - 가게 코드 (예: S001, S002)
- **Response**:
```json
{
  "success": true,
  "message": "성공",
  "data": {
    "storeCode": "S001",
    "storeName": "한식당",
    "totalSales": 15000,
    "averageOrderValue": 15000,
    "orderCount": 1
  }
}
```

## 테스트 데이터

### 가게 정보
- **S001**: 한식당
  - 김치찌개 (8,000원)
  - 된장찌개 (7,000원)
- **S002**: 양식당
  - 치킨 (15,000원)
  - 피자 (20,000원)

### 초기 주문 데이터
- 주문 ID 1: 한식당에서 김치찌개 + 된장찌개 주문
- 주문 ID 2: 양식당에서 치킨 + 피자 주문

## 테스트 방법

1. **애플리케이션 실행**
   ```bash
   ./gradlew bootRun
   ```

2. **API 테스트**
   - Postman, curl, 또는 브라우저에서 테스트
   - Swagger UI: `http://localhost:8080/swagger-ui.html`

3. **테스트 시나리오**
   - 새로운 주문 생성
   - 기존 주문 취소
   - 가게별 매출 및 객단가 조회

## 에러 응답 예시

```json
{
  "success": false,
  "message": "메뉴를 적어도 하나 선택해주세요.",
  "data": null
}
```

## 주의사항

- 모든 가격은 Long 타입으로 처리됩니다
- 주문 취소 시 `isCanceled` 플래그가 true로 설정됩니다
- 취소된 주문은 매출 계산에서 제외됩니다
- 가게 코드는 대소문자를 구분합니다 (S001, S002)
