package com.satyam._2jpamultidb.repo.pd;

import com.satyam._2jpamultidb.model.customer.Customer;
import com.satyam._2jpamultidb.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Integer> {
}

