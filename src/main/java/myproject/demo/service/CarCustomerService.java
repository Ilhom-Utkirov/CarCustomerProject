package myproject.demo.service;

import myproject.demo.model.CarCustomer;

import java.util.List;

public interface CarCustomerService {
    CarCustomer findCustomerById(Long id);
    List<CarCustomer> findAllCustomers();
    CarCustomer saveCarCustomer(CarCustomer carCustomer);
}
