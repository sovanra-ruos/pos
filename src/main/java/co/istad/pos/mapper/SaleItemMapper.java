package co.istad.pos.mapper;

import co.istad.pos.domain.ItemProduct;
import co.istad.pos.domain.SaleItem;
import co.istad.pos.features.SaleItem.dto.SaleItemRequest;
import co.istad.pos.features.SaleItem.dto.SaleItemResponse;
import co.istad.pos.features.SaleItem.dto.ItemsDetailResponse;
import co.istad.pos.features.Product.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface SaleItemMapper {

    @Mappings({
        @Mapping(target = "items", expression = "java(toItemsDetailResponseList(saleItem.getSaleItemProducts()))")
    })
    SaleItemResponse toSaleItemResponse(SaleItem saleItem);

    @Mappings({
        @Mapping(target = "saleItemProducts", ignore = true)
    })
    SaleItem toSaleItem(SaleItemRequest saleItemRequest);

    default List<ItemsDetailResponse> toItemsDetailResponseList(List<ItemProduct> saleItemProducts) {
        return saleItemProducts.stream()
                .map(sip -> ItemsDetailResponse.builder()
                        .product(ProductResponse.builder()
                                .uuid(sip.getProduct().getUuid())
                                .name(sip.getProduct().getName())
                                .image(sip.getProduct().getImage())
                                .price((float) sip.getProduct().getPrice())
                                .description(sip.getProduct().getDescription())
                                .build())
                        .qty(sip.getQty())
                        .build())
                .collect(Collectors.toList());
    }
}