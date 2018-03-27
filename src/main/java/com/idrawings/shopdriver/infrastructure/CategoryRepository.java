package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by White Stream on 02.06.2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
