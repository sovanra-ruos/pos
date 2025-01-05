package co.istad.pos.features.Product;

import co.istad.pos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByUuid (String uuid);

    Product findByName (String name);


}
