package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by White Stream on 01.06.2017.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
