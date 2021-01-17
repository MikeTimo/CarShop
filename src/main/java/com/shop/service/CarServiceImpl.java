package com.shop.service;

import com.shop.exception.BadRequestException;
import com.shop.model.machine.Car;
import com.shop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private CarRepository carRepository;

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> allCars() {
        return carRepository.findAll();
    }

    @Override
    public void deleteCar(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
        } else {
            throw new BadRequestException("Неверный ID");
        }
    }

    @Override
    public void updateCar(Long id, Car car) {
        if (carRepository.existsById(id)) {
            carRepository.save(car);
        } else {
            throw new BadRequestException("Неверный ID");
        }
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCar(Long id) {
        if (carRepository.existsById(id)) {
            return carRepository.findById(id).get();
        } else {
            throw new BadRequestException("Неверный ID");
        }
    }
}
