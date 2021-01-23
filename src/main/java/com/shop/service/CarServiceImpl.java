package com.shop.service;

import com.shop.exception.BadRequestException;
import com.shop.model.machine.BodyType;
import com.shop.model.machine.Car;
import com.shop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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
    public List<Car> allCars(Specification<Car> specification) {
        return carRepository.findAll(specification);
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

    @Override
    public Specification<Car> filterByMake(String make) {
        return ((root, criteriaQuery, criteriaBuilder) -> make == null ? null : criteriaBuilder.like(root.get("make"), "%" + make + "%"));
    }

    @Override
    public Specification<Car> filterByModel(String model) {
        return ((root, criteriaQuery, criteriaBuilder) -> model == null ? null : criteriaBuilder.like(root.get("model"), "%" + model + "%"));
    }

    @Override
    public Specification<Car> filterByBodyType(BodyType bodyType) {
        return ((root, criteriaQuery, criteriaBuilder) -> bodyType == null ? null : criteriaBuilder.equal(root.get("body_type"), bodyType));
    }
}
