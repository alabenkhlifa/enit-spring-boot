package tn.ensit.spring.car.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.ensit.spring.car.entities.Car;
import tn.ensit.spring.car.services.ICarService;

@RestController
public class CarResource {

    @Autowired
    private ICarService service;

    @GetMapping("/car/{model}")
    public Car getByModel(@PathVariable String model) {
        return service.getByModel(model);
    }

    @GetMapping("/car")
    public Car getById(@RequestParam("id") Long id) {
        return service.getById(id);
    }

}
