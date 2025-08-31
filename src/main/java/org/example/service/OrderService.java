package org.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.domain.Food;
import org.example.domain.Order;
import org.example.domain.Store;
import org.example.dto.*;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private static List<Order> orderList = new ArrayList<>();
    private static Map<String, Store> storeMap = new HashMap<>();

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

        //storeMap에 Store 객체 추가
        storeMap.put("S001", store1);
        storeMap.put("S002", store2);

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

        if (requestDto.getFoodList().isEmpty()) {
            return new ApiResponseDto<>(false, "에러: 메뉴를 적어도 하나 선택해주세요.", null);
        }

        if (!storeMap.containsKey(requestDto.getCode())) {
            return new ApiResponseDto<>(false, "존재하지 않는 가게입니다.", null);
        }

        //stream 사용 시 return 불가능 하므로 for 사용
        for (String food : requestDto.getFoodList()) {

            if (!storeMap.get(requestDto.getCode()).getMenuList().contains(food)) {
                return new ApiResponseDto<>(false, "에러: 유효한 주문이 아닙니다. (주문한 메뉴 미존재)", null);
            }

        }

        List<Food> foodList = requestDto.getFoodList().stream()
                .map(foodName -> storeMap.get(requestDto.getCode())
                        .getMenuList().stream()
                        .filter(food -> food.getTitle().equals(foodName)).findFirst().get()).toList();

        orderList.add(new Order((long) (orderList.size() + 1), storeMap.get(requestDto.getCode()), foodList));
        OrderResponseDto orderResponseDto = OrderResponseDto.builder()
                .orderId((long) orderList.size())
                .storeName(storeMap.get(requestDto.getCode()).getName())
                .foodList(requestDto.getFoodList()).build();

        return new ApiResponseDto<>(true, "주문이 성공하였습니다.", orderResponseDto);

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
        return null;
    }
}
