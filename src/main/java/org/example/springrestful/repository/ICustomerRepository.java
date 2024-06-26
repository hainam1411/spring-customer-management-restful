package org.example.springrestful.repository;

import org.example.springrestful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository  extends PagingAndSortingRepository<Customer, Long> {
}
