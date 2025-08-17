package com.spring_data_jpa_mapping.controller;

import com.spring_data_jpa_mapping.dto.OrderRequest;
import com.spring_data_jpa_mapping.dto.OrderResponse;
import com.spring_data_jpa_mapping.entity.Customer;
import com.spring_data_jpa_mapping.repository.CustomerRepository;
import com.spring_data_jpa_mapping.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    // ✅ Place Order
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());  // no casting needed
    }

    // ✅ Find all Orders
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();   // directly use JpaRepository method
    }

    // ✅ Join Information
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}
