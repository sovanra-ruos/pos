package co.istad.pos.features.SaleItem.dto;

import co.istad.pos.features.Product.dto.ProductResponse;
import lombok.Builder;

import java.util.List;

@Builder
public record SaleItemResponse(
        String uuid,
        List<ItemsDetailResponse> items
) {
}
