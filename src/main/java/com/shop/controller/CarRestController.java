package com.shop.controller;

import com.shop.model.machine.BodyType;
import com.shop.model.machine.Car;
import com.shop.model.machine.FuelType;
import com.shop.model.machine.TransmissionType;
import com.shop.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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
    public List<Car> getAllCars(@RequestParam(value = "make", required = false) String make,
                                @RequestParam(value = "model", required = false) String model,
                                @RequestParam(value = "body_type", required = false) BodyType bodyType,
                                @RequestParam(value = "transmission_type", required = false) TransmissionType transmissionType,
                                @RequestParam(value = "fuel_type", required = false) FuelType fuelType,
                                @RequestParam(value = "price", required = false) Double price,
                                @RequestParam(value = "kilometres", required = false) Double kilometres) {

        return carService.allCars(Specification.where(carService.filterByMake(make).and(carService.filterByModel(model)).
                and(carService.filterByBodyType(bodyType))));
    }

    @GetMapping("/cars/count")
    @ResponseStatus(HttpStatus.OK)
    public Integer getCountCars(@RequestParam(value = "make", required = false) String make,
                                @RequestParam(value = "model", required = false) String model,
                                @RequestParam(value = "body_type", required = false) BodyType bodyType,
                                @RequestParam(value = "transmission_type", required = false) TransmissionType transmissionType,
                                @RequestParam(value = "fuel_type", required = false) FuelType fuelType,
                                @RequestParam(value = "price", required = false) Double price,
                                @RequestParam(value = "kilometres", required = false) Double kilometres) {

        return carService.allCars(Specification.where(carService.filterByMake(make).and(carService.filterByModel(model)).
                and(carService.filterByBodyType(bodyType)))).size();
    }

    @PostMapping("cars")
    @ResponseStatus(HttpStatus.OK)
    public Car addNewCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @GetMapping("cars/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @PutMapping ("/cars/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCar(@PathVariable Long id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
