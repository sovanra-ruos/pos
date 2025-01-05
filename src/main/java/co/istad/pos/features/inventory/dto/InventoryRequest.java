package co.istad.pos.features.inventory.dto;

import lombok.Builder;

@Builder
public record InventoryRequest(
        String productName,
        int qty
) {
}
