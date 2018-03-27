package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Variant;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by White Stream on 02.06.2017.
 */
public interface VariantRepository extends CrudRepository<Variant, Long> {
}
