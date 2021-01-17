package com.shop.service;

import com.shop.model.machine.Car;

import java.util.List;

public interface CarService {
    public List<Car> allCars();

    public Car saveCar(Car car);

    public Car getCar(Long id);

    public void deleteCar(Long id);

    public void updateCar(Long id, Car car);
}
