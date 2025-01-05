package co.istad.pos.features.Sale.dto;

import co.istad.pos.features.SaleItem.dto.SaleItemResponse;
import lombok.Builder;

@Builder
public record SaleResponse(
        String uuid,
        SaleItemResponse items,
        double total,
        double paid,
        double change,
        boolean active,
        String paymentMethod,
        float discount
) {
}
