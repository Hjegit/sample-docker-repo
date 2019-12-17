package fr.training.spring.shop.infrastructure.customer;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class CustomerJpaRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testFindOne() {
        CustomerEntity customerEntity = customerRepository.findById("123e4567-e89b-42d3-a456-556642440000").get();
        assertNotNull(customerEntity);
        assertEquals("NAME1", customerEntity.getName());
    }

    @Test
    public void testCreateAndFind() {
        CustomerEntity customer = new CustomerEntity("nass", "123456");
        customerRepository.save(customer);
        CustomerEntity customerCreated = customerRepository.findById(customer.getId()).get();
        assertNotNull(customerCreated);
        assertEquals("nass", customerCreated.getName());
    }

}
