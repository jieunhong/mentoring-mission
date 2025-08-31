package org.example.controller;

import org.example.dto.*;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 1. 주문하기
     * POST /api/orders
     */
    @PostMapping
    public ResponseEntity<ApiResponseDto<OrderResponseDto>> addOrder(@RequestBody OrderRequestDto requestDto) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 2. 주문 취소하기
     * PUT /api/orders/{id}/cancel
     */
    @PutMapping("/{id}/cancel")
    public ResponseEntity<ApiResponseDto<String>> cancelOrder(@PathVariable Long id) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 3. 가게별 하루 총 매출 계산
     * GET /api/orders/sales/{storeCode}
     */
    @GetMapping("/sales/{storeCode}")
    public ResponseEntity<ApiResponseDto<SalesResponseDto>> calculateTotalSales(@PathVariable String storeCode) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }

    /**
     * 4. 가게별 객단가 계산
     * GET /api/orders/average/{storeCode}
     */
    @GetMapping("/average/{storeCode}")
    public ResponseEntity<ApiResponseDto<SalesResponseDto>> calculateAverageOrderValue(@PathVariable String storeCode) {
        // TODO: 멘티가 직접 구현할 부분
        return null;
    }
}
