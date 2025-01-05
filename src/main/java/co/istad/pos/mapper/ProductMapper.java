package co.istad.pos.mapper;

import co.istad.pos.domain.Product;
import co.istad.pos.features.Product.dto.ProductRequest;
import co.istad.pos.features.Product.dto.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse toProductResponse(Product product);
    Product toProduct(ProductRequest productRequest);

}
