package fr.training.spring.shop.infrastructure.order;

import fr.training.spring.shop.domain.order.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, String> {

    @Query("select o from OrderEntity o where o.customer.id = :id")
    List<OrderEntity> getOrdersForCustomer(@Param("id") String id);
}
