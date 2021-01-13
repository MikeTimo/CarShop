package com.shop.controller;

import com.shop.model.Car;
import com.shop.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CarRestController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getAllCars() {
        return carService.allCars();
    }

    @GetMapping("/cars/count")
    @ResponseStatus(HttpStatus.OK)
    public Integer getCountCars() {
        return carService.allCars().size();
    }

    @PostMapping("cars")
    @ResponseStatus(HttpStatus.OK)
    public Car addNewCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @GetMapping("cars/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car getCAr(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @DeleteMapping("/cars/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
