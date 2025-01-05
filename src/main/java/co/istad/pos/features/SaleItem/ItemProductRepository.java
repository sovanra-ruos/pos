package co.istad.pos.features.SaleItem;

import co.istad.pos.domain.ItemProduct;
import co.istad.pos.domain.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemProductRepository extends JpaRepository<ItemProduct,Long> {

    ItemProduct findBySaleItem (SaleItem saleItem);

    ItemProduct findBySaleItem_Uuid (String uuid);
}
