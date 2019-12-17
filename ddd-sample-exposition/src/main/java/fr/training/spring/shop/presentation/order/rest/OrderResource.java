package fr.training.spring.shop.presentation.order.rest;

import fr.training.spring.shop.application.order.OrderDTO;
import fr.training.spring.shop.application.order.OrderManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderResource {

    @Autowired
    private OrderManagement orderManagement;

    @PostMapping("/orders")
    public void addOrder(@Valid @RequestBody OrderDTO orderDTO) {
        orderManagement.addOrder(orderDTO);
    }

    @GetMapping("/orders/{customerID}")
    public List<OrderDTO> getOrders(@PathVariable String customerID) {
        return orderManagement.getOrdersForCustomer(customerID);
    }

}
