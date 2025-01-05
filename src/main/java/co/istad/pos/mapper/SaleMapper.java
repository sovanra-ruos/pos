package co.istad.pos.mapper;

import co.istad.pos.domain.Sale;
import co.istad.pos.features.Sale.dto.SaleRequest;
import co.istad.pos.features.Sale.dto.SaleResponse;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface SaleMapper {

    SaleResponse toSaleResponse(Sale sale);

    Sale toSale(SaleRequest saleRequest);
}
