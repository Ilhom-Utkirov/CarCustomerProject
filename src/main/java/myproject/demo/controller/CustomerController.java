package myproject.demo.controller;

import myproject.demo.model.CarCustomer;
import myproject.demo.service.CarCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/find-customer")
public class CustomerController {
    //to show more bautifully in localhost
    @Autowired
    private CarCustomerService carCustomerService;


    @GetMapping("/all")
    public String getAllCarCustomers2(Model model){
        List<CarCustomer> carCustomers = carCustomerService.findAllCustomers();
        model.addAttribute("customers",carCustomers);
        return "show";
    }



    @GetMapping("/byId")
    public String getCustomerById2(@RequestParam(name="id") Long id, Model model){
        //CarCustomer carCustomers = carCustomerService.findCustomerById(id);
        CarCustomer carCustomer = carCustomerService.findCustomerById(id);
        model.addAttribute("customer",carCustomer);
        return "showId";
    }

}
