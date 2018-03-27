package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.LangProduct;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sergej on 18.10.2017.
 */
public interface LangProductsRepository extends CrudRepository<LangProduct, Long> {
}
