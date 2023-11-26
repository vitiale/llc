package com.lirianosclening.llc.Controllers;

import com.lirianosclening.llc.Models.Customer;
import com.lirianosclening.llc.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id){
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public void updateCustomerById(@PathVariable("id") Long id, @RequestBody Customer request){
        customerService.updateCustomerById(id, request);
    }

    @PostMapping("/create")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }

}
