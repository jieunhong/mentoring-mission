package org.example.dto;

import lombok.*;

import java.util.List;

@Getter
@RequiredArgsConstructor
@ToString
@Builder
public class OrderRequestDto {
    // TODO: 멘티가 직접 구현할 부분
    private String code;
    private List<String> foodList;

    
}
