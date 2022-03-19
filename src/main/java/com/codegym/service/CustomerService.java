package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Thang", "nguyenthang29tdl@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Cuong", "nguyencuong29tdl@gmail.com", "Ha Noi"));
        customers.add(new Customer(3, "Viet", "nguyenviet29tdl@gmail.com", "Ha Noi"));
        customers.add(new Customer(4, "Binh", "nguyenthang29tdl@gmail.com", "Ha Noi"));
        customers.add(new Customer(5, "Quoc", "nguyenthang29tdl@gmail.com", "Ha Noi"));

    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId()==id){
                index = i;
                return customers.get(index);
            }
        }
        return null;
    }

    @Override
    public void createNewCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void updateById(int id, Customer customer) {
        customers.set(id,customer);
    }

    @Override
    public void deleteById(Customer customer) {
        customers.remove(customer);
    }
}
