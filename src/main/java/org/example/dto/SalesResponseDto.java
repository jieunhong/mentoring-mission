package org.example.dto;

public class SalesResponseDto {
    // TODO: 멘티가 직접 구현할 부분
    private Long totalRevenue;
    private Long averageOrderValue;

    public SalesResponseDto(Long totalRevenue, Long averageOrderValue) {
        this.totalRevenue = totalRevenue;
        this.averageOrderValue = averageOrderValue;
    }

    public Long getTotalRevenue() {
        return totalRevenue;
    }
    public void setTotalRevenue(Long totalRevenue) {}

    public void setAverageOrderValue(Long averageOrderValue) {
        this.averageOrderValue = averageOrderValue;
    }
    public Long getAverageOrderValue() {
        return averageOrderValue;
    }

    @Override
    public String toString() {
        return "SalesResponseDto [totalRevenue=" + totalRevenue + ", averageOrderValue=" + averageOrderValue + "]";
    }
}
