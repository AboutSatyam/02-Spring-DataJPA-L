package com.satyam._2jpamultidb.repo.cx;

import com.satyam._2jpamultidb.model.customer.Customer;
import com.satyam._2jpamultidb.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {
}
