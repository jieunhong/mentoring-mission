package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@RequiredArgsConstructor
@Builder
@ToString
public class OrderResponseDto {
    // TODO: 멘티가 직접 구현할 부분
    private Long orderId;
    private String storeName;
    private List<String> foodList;
}
