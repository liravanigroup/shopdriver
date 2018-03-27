package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Option;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by White Stream on 09.07.2017.
 */
public interface OptionRepository extends CrudRepository<Option, Long> {
}
