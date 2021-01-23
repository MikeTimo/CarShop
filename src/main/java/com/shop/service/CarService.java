package com.shop.service;

import com.shop.model.machine.BodyType;
import com.shop.model.machine.Car;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface CarService {
    public List<Car> allCars(Specification<Car> specification);

    public Car saveCar(Car car);

    public Car getCar(Long id);

    public void deleteCar(Long id);

    public void updateCar(Long id, Car car);

    Specification<Car> filterByMake(String make);

    Specification<Car> filterByModel(String model);

    Specification<Car> filterByBodyType(BodyType bodyType);
}
