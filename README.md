# 🏪 음식점 주문 관리 시스템 (Food Order Management System)

## 📋 프로젝트 개요

이 프로젝트는 **여러 음식점의 주문을 관리하고 매출 분석을 제공하는 Java 기반 애플리케이션**입니다. 
고객 주문부터 매출 분석까지 음식점 운영에 필요한 핵심 기능을 제공합니다.

## 🎯 주요 기능

### 1. 주문 관리
- **주문 생성**: 새로운 주문을 시스템에 등록
- **주문 취소**: 기존 주문의 취소 처리
- **주문 조회**: 전체 주문 목록 확인

### 2. 매출 분석
- **일일 매출 계산**: 가게별 하루 총 매출 집계
- **객단가 분석**: 가게별 평균 주문 금액 계산
- **취소 주문 제외**: 정확한 매출 데이터 제공

## 🏗️ 시스템 아키텍처

### 도메인 모델

#### Food (음식)
```java
- id: 음식 고유 식별자
- title: 음식 이름
- description: 음식 설명
- price: 음식 가격
```

#### Store (가게)
```java
- code: 가게 코드
- name: 가게 이름
- foodList: 제공 음식 목록
```

#### Order (주문)
```java
- id: 주문 고유 식별자
- store: 주문 가게
- foodList: 주문 음식 목록
- isCanceled: 취소 여부
- createdAt: 주문 생성 시간
- canceledAt: 주문 취소 시간
```

## 🚀 설치 및 실행

### 필수 요구사항
- Java 11 이상
- Gradle (선택사항)

### 실행 방법

#### 1. Java 직접 실행
```bash
# 컴파일
mkdir -p build/classes
javac -d build/classes src/main/java/org/example/domain/*.java src/main/java/org/example/Main.java

# 실행
java -cp build/classes org.example.Main
```

#### 2. Gradle 사용 (권장)
```bash
# Gradle wrapper 실행 권한 부여
chmod +x gradlew

# 프로젝트 실행
./gradlew run
```

## 📊 사용 예시

### 테스트 데이터
```java
// 한식당 메뉴
- 김치찌개: 8,000원
- 된장찌개: 7,000원

// 양식당 메뉴  
- 치킨: 15,000원
- 피자: 20,000원
```

### 실행 결과
```
=== 주문 시스템 테스트 ===

=== 가게 1 결산 ===
매출 : 15000원
객단가 : 7500원

=== 가게 2 결산 ===
매출 : 35000원
객단가 : 35000원
```

## 🔧 API 메서드

### `addOrder(Store store, List<Food> foodList)`
- 새로운 주문을 생성하여 시스템에 추가
- 자동으로 주문 ID 할당 및 생성 시간 기록

### `cancelOrder(Long id)`
- 지정된 ID의 주문을 취소 처리
- 취소 시간 기록 및 매출 계산에서 제외

### `calculateTotalSales(Store store)`
- 특정 가게의 오늘 총 매출 계산
- 취소된 주문은 계산에서 제외

### `calculateAverageOrderValue(Store store)`
- 특정 가게의 평균 주문 금액(객단가) 계산
- 유효한 주문만을 대상으로 계산


## 🔮 향후 개선 계획 (추후...)

- [ ] 데이터베이스 연동 (현재는 메모리 기반)
- [ ] 사용자 인터페이스 (GUI/Web) 추가
- [ ] 주문 상태 관리 (접수, 조리, 배달 등)
- [ ] 재고 관리 시스템
- [ ] 고객 관리 기능
- [ ] 통계 리포트 생성

## 📝 라이선스

이 프로젝트는 교육 목적으로 제작되었습니다.

## 👥 기여자

- 프로젝트 개발자

---

**문의사항이나 개선 제안이 있으시면 언제든 연락주세요!** 🚀
- 
