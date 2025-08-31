package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesResponseDto {
    private boolean success;
    private String message;
    private StoreData data;

    @Getter
    @Setter
    public static class StoreData {
        private String storeCode;
        private String storeName;
        private int totalSales;
        private int averageOrderValue;
        private int orderCount;
    }
}