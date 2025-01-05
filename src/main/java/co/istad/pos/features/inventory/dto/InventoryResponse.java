package co.istad.pos.features.inventory.dto;

import co.istad.pos.features.Product.dto.ProductResponse;
import lombok.Builder;

@Builder
public record InventoryResponse(
        String uuid,
        int qty,
        ProductResponse product
) {
}
