package co.istad.pos.features.SaleItem;

import co.istad.pos.domain.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem,Long> {

    SaleItem findByUuid (String uuid);

}
