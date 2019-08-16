package myproject.demo.controller;


import myproject.demo.model.CarCustomer;
import myproject.demo.service.CarCustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CarCustomerController.BASE_URL)
public class CarCustomerController {
    public static final String BASE_URL = "/api";

    private final CarCustomerService carCustomerService;
    public CarCustomerController(CarCustomerService carCustomerService) {
        this.carCustomerService = carCustomerService;
    }

    //localhost:8080/id
    @GetMapping("/{id}")
    public CarCustomer getCustomerById(@PathVariable Long id){
        return carCustomerService.findCustomerById(id);
    }


    @GetMapping
    public List<CarCustomer> getAllCarCustomers(){
        return carCustomerService.findAllCustomers();
    }



    //@request body for json format body
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarCustomer saveCarCustomer(@RequestBody CarCustomer carCustomer){
        return carCustomerService.saveCarCustomer(carCustomer);
    }


}
