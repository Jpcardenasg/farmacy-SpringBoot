package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.CustomerService;
import com.campuslands.farmacy.domain.models.Customer;
import com.campuslands.farmacy.infrastructure.out.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(String id, Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            return customerRepository.save(customer);
        } else {
            throw new RuntimeException("Customer not found with id: " + id);
        }
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> fetchCustomersList() {
        return customerRepository.findAll();
    }

}
