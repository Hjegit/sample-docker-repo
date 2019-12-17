package fr.training.spring.shop.infrastructure.customer;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

}
