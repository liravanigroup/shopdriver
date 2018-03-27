package com.idrawings.shopdriver.infrastructure;

import com.idrawings.shopdriver.domain.Image;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by White Stream on 02.06.2017.
 */
public interface ImageRepository extends CrudRepository<Image, Long> {
}
