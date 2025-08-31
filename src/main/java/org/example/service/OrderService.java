package org.example.service;

import org.example.dto.*;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    // TODO: 멘티가 직접 구현할 부분
    
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
        return null;
    }
}
