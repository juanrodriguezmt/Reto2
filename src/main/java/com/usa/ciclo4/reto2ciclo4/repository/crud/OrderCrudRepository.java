package com.usa.ciclo4.reto2ciclo4.repository.crud;

import com.usa.ciclo4.reto2ciclo4.model.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author desarrolloextremo
 */
public interface OrderCrudRepository extends CrudRepository<Order, Integer> {

    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
}
