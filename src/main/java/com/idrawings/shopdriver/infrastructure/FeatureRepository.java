package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Feature;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sergej on 11.11.2017.
 */
public interface FeatureRepository extends CrudRepository<Feature, Long> {
}
