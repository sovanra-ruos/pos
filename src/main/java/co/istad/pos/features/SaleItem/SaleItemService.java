package co.istad.pos.features.SaleItem;

import co.istad.pos.features.SaleItem.dto.SaleItemRequest;
import co.istad.pos.features.SaleItem.dto.SaleItemResponse;
import co.istad.pos.features.SaleItem.dto.UpdateQuantityRequest;
import co.istad.pos.utils.CustomPage;

import java.util.List;

public interface SaleItemService {

    SaleItemResponse createSaleItem(SaleItemRequest saleItemRequest);

    CustomPage<SaleItemResponse> getSaleItems(int page, int size);

    SaleItemResponse getSaleItem(String uuid);

    void deleteSaleItem(String uuid);

    SaleItemResponse updateQuantity(String uuid, UpdateQuantityRequest request);

}
