package org.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.domain.Food;
import org.example.domain.Order;
import org.example.domain.Store;
import org.example.dto.*;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private static List<Order> orderList = new ArrayList<>();

    // 테스트용 데이터 초기화
    static {
        List<Food> foods1 = new ArrayList<>();
        foods1.add(new Food(1L, "김치찌개", "매콤한 김치찌개", 8000L));
        foods1.add(new Food(2L, "된장찌개", "구수한 된장찌개", 7000L));

        List<Food> foods2 = new ArrayList<>();
        foods2.add(new Food(3L, "치킨", "바삭한 치킨", 15000L));
        foods2.add(new Food(4L, "피자", "치즈가 가득한 피자", 20000L));

        Store store1 = new Store("S001", "한식당", foods1);
        Store store2 = new Store("S002", "양식당", foods2);

        // 초기 주문 데이터 - 직접 Order 객체 생성
        Order order1 = new Order(1L, store1, foods1);
        Order order2 = new Order(2L, store2, foods2);
        orderList.add(order1);
        orderList.add(order2);
    }


    /**
     * 1. 주문하기
     */
    public ApiResponseDto<OrderResponseDto> addOrder(OrderRequestDto requestDto) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 2. 주문 취소하기
     */
    public ApiResponseDto<String> cancelOrder(Long id) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 3. 가게별 하루 총 매출 계산
     */
    public ApiResponseDto<SalesResponseDto> calculateTotalSales(String storeCode) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 4. 가게별 객단가 계산
     */
    public ApiResponseDto<SalesResponseDto> calculateAverageOrderValue(String storeCode) {
        // TODO: 멘티가 직접 구현할 부분
        List<Order> validOrders = orderList.stream()
                .filter(order -> order.getStore().getCode().equals(storeCode))
                .filter(order -> !order.getCanceled())
                .collect(Collectors.toList());

        Long totalRevenue = validOrders.stream()
                .mapToLong(order ->
                        order.getFoodList().stream()
                                .mapToLong(food -> food.getPrice())
                                .sum()
                )
                .sum();

        double averageOrderValue = (double) totalRevenue / validOrders.size();

        SalesResponseDto responseDto = new SalesResponseDto((Long) totalRevenue, (long) averageOrderValue);


        return null;
    }
}
