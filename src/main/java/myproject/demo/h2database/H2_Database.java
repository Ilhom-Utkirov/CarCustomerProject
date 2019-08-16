package myproject.demo.h2database;

import myproject.demo.model.CarCustomer;
import myproject.demo.repository.CarCustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2_Database implements CommandLineRunner {

    private final CarCustomerRepository carCustomerRepository;

    public H2_Database(CarCustomerRepository carCustomerRepository) {
        this.carCustomerRepository = carCustomerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Data");

        CarCustomer c1 = new CarCustomer();
        c1.setFirstname("JOhn");
        c1.setSurname("Smith");
        carCustomerRepository.save(c1);

        CarCustomer c2 = new CarCustomer();
        c2.setFirstname("Michaela");
        c2.setSurname("Adams");
        carCustomerRepository.save(c2);

        CarCustomer c3 = new CarCustomer();
        c3.setFirstname("Johny");
        c3.setSurname("English");
        carCustomerRepository.save(c3);

        CarCustomer c4 = new CarCustomer();
        c4.setFirstname("Bob");
        c4.setSurname("Dylan");
        carCustomerRepository.save(c4);

        System.out.println("Loaded Customers = " + carCustomerRepository.count());
    }
}
