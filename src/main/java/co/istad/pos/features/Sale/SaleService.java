package co.istad.pos.features.Sale;

import co.istad.pos.features.Sale.dto.SaleRequest;
import co.istad.pos.features.Sale.dto.SaleResponse;

public interface SaleService {

    SaleResponse createSale(SaleRequest saleRequest);



}
