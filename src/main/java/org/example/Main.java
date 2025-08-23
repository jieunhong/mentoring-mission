package org.example;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.example.domain.Food;
import org.example.domain.Store;
import org.example.domain.Order;

public class Main {
    public static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        // 테스트용 데이터 생성 및 함수 테스트
        System.out.println("=== 주문 시스템 테스트 ===\n");

        // 테스트용 가게와 음식 생성
        List<Food> foods1 = new ArrayList<>();
        foods1.add(new Food(1L, "김치찌개", "매콤한 김치찌개", 8000L));
        foods1.add(new Food(2L, "된장찌개", "구수한 된장찌개", 7000L));

        List<Food> foods2 = new ArrayList<>();
        foods2.add(new Food(3L, "치킨", "바삭한 치킨", 15000L));
        foods2.add(new Food(4L, "피자", "치즈가 가득한 피자", 20000L));

        Store store1 = new Store("S001", "한식당", foods1);
        Store store2 = new Store("S002", "양식당", foods2);

        // 주문 추가 테스트
        addOrder(store1, foods1);
        addOrder(store2, foods2);
        addOrder(store1, List.of(foods1.get(0))); // 김치찌개만 주문
        addOrder(store2, Collections.emptyList());

        // 주문 취소 테스트
        cancelOrder(1L);

        // 계산 테스트
        System.out.println("\n=== 가게 1 결산 ===");
        System.out.println("매출 : " + calculateTotalSales(store1) + "원");
        System.out.println("객단가 : " + calculateAverageOrderValue(store1) + "원");

        // 계산 테스트
        System.out.println("\n=== 가게 2 결산 ===");
        System.out.println("매출 : " + calculateTotalSales(store2) + "원");
        System.out.println("객단가 : " + calculateAverageOrderValue(store2) + "원");

    }

    /**
     * 1. 주문하기
     */
    public static void addOrder(Store store, List<Food> foodList) {

        if (foodList.isEmpty()) {

            System.out.println("에러: 메뉴를 적어도 하나 선택해주세요.");
            return;

        }

        for (Food food : foodList) {
            if (!store.getMenuList().contains(food)) {
                System.out.println("에러: 유효한 주문이 아닙니다. (주문한 메뉴 미존재");
                return;
            }
        }

        Order order = new Order((long) (orderList.size() + 1), store, foodList);
        orderList.add(order);

    }

    /**
     * 2. 취소하기
     */
    public static void cancelOrder(Long id) {

    }

    /**
     * 3. 가게별 하루 총 매출 계산
     */
    public static Long calculateTotalSales(Store store) {
        return 0L;
    }

    /**
     * 4. 가게별 객단가 계산
     */
    public static Long calculateAverageOrderValue(Store store) {
        return 0L;
    }
}