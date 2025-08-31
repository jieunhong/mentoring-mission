package org.example.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
public class OrderResponseDto {
    // TODO: 멘티가 직접 구현할 부분
    private Long orderId;
    private String storeName;
    private List<String> foodList;
}
