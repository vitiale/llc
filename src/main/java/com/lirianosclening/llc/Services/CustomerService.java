package com.lirianosclening.llc.Services;

import com.lirianosclening.llc.Models.Customer;
import com.lirianosclening.llc.Repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;

    public List<Customer> getAllCustomer(){
        return iCustomerRepository.findAll();
    }

    public Customer getCustomerById(Long id){
        return iCustomerRepository.findById(id).orElse(null);
    }

    public void updateCustomerById(Long id, Customer request){

    }

    public void deleteCustomerById(Long id){
        iCustomerRepository.deleteById(id);
    }

    public void saveCustomer(Customer customer){
        iCustomerRepository.save(customer);
    }
}
