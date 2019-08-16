package myproject.demo.service;

import myproject.demo.model.CarCustomer;
import myproject.demo.repository.CarCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCustomerServiceImpl implements CarCustomerService {

    private final CarCustomerRepository carCustomerRepository;

    public CarCustomerServiceImpl(CarCustomerRepository carCustomerRepository) {
        this.carCustomerRepository = carCustomerRepository;
    }


    @Override
    public CarCustomer findCustomerById(Long id) {
        return carCustomerRepository.findById(id).get();
    }

    @Override
    public List<CarCustomer> findAllCustomers() {
        return carCustomerRepository.findAll();
    }

    @Override
    public CarCustomer saveCarCustomer(CarCustomer carCustomer) {
        return carCustomerRepository.save(carCustomer);
    }
}
