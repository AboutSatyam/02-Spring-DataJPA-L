package com.satyam._2jpamultidb.rest;

import com.satyam._2jpamultidb.model.customer.Customer;
import com.satyam._2jpamultidb.model.product.Product;
import com.satyam._2jpamultidb.repo.cx.ICustomerRepo;
import com.satyam._2jpamultidb.repo.pd.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MultiDBController {
    @Autowired
    private ICustomerRepo repo1;

    @Autowired
    private IProductRepo repo2;

    @GetMapping("/getallcx")
    public List<Customer> getAllCx() {
        return repo1.findAll();
    }

    @GetMapping("/getallpd")
    public List<Product> getAllPd() {
        return repo2.findAll();
    }
}
