package tn.ensit.spring.car.services;

import tn.ensit.spring.car.entities.Car;

import java.util.List;

public interface ICarService {
    Boolean contains(List<Integer> list, Integer number);
    Integer sizeOf(List<Integer> list);
    Car getByModel(String model);
    Car getById(Long id);
}
