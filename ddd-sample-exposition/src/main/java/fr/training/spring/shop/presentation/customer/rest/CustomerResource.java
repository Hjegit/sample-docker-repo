package fr.training.spring.shop.presentation.customer.rest;

import fr.training.spring.shop.application.customer.CustomerDTO;
import fr.training.spring.shop.application.customer.CustomerManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class CustomerResource {

    @Autowired
    private CustomerManagement customerManagement;

    @PostMapping("/customers")
    public void addOrder(@Valid @RequestBody CustomerDTO customerDTO) {
        customerManagement.create(customerDTO);
    }

    @GetMapping("/customers/{customerID}")
    public CustomerDTO getCustomer(@PathVariable String customerID) {
        return customerManagement.findOne(customerID);
    }
}
