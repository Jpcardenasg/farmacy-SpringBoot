package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Customer;
public interface CustomerService {

    Customer saveCustomer(Customer customer);
    Customer updateCustomer(String id, Customer customer);
    void deleteCustomer(String id);
    Customer getCustomerById(String id);
    List<Customer> fetchCustomersList();

}