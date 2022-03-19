package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {


   @Autowired
   private ICustomerService customerService;



    @GetMapping
    private ModelAndView showListCustomer(){
        List<Customer> customers = this.customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
    @GetMapping("/create")
    private ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    private ModelAndView showEditForm(@PathVariable int id){
        Customer customer = this.customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    private ModelAndView showDeleteForm(@PathVariable int id){
        Customer customer = this.customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
    @GetMapping("/view/{id}")
    private ModelAndView customerDetail(@PathVariable int id){
        Customer customer = this.customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
    @PostMapping("/create")
    private ModelAndView createNewCustomer(int id, String name, String email, String address){
        Customer customer = new Customer(id,name,email,address);
        this.customerService.createNewCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }
    @PostMapping("/edit/{id}")
    private ModelAndView EditCustomer(int id, String name, String email, String address){
        Customer customer = new Customer(id,name,email,address);
        this.customerService.updateById(id,customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }
    @PostMapping("/delete/{id}")
    private ModelAndView DeleteCustomer(@PathVariable int id){
        Customer customer = this.customerService.findById(id);
        this.customerService.deleteById(customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }

}
