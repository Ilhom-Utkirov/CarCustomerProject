package myproject.demo.repository;

import myproject.demo.model.CarCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCustomerRepository extends JpaRepository<CarCustomer,Long> {

}
