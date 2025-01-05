package co.istad.pos.features.SaleItem.dto;

import co.istad.pos.features.Product.dto.ProductResponse;
import lombok.Builder;

@Builder
public record ItemsDetailResponse(
        ProductResponse product,
        int qty
) {
}
