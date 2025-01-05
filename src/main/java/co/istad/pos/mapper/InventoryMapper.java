package co.istad.pos.mapper;

import co.istad.pos.domain.Inventory;
import co.istad.pos.features.inventory.dto.InventoryRequest;
import co.istad.pos.features.inventory.dto.InventoryResponse;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface InventoryMapper {

    InventoryResponse toInventoryResponse(Inventory inventory);

    Inventory toInventory(InventoryRequest inventoryRequest);


}

