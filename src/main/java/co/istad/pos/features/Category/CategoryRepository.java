package co.istad.pos.features.Category;

import co.istad.pos.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByUuid (String uuid);

    Category findByName (String name);
}
