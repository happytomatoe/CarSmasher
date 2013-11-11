package org.geymer.carsmasher.service;

import java.util.List;

import org.geymer.carsmasher.dao.CarRespository;
import org.geymer.carsmasher.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Repository
@Transactional
public class CarManager {
	@Autowired
	CarRespository carRepository;
	public List<Car> findAll(){
		return carRepository.findAll();
	}
	public void delete(Integer arg0){
		carRepository.delete(arg0);
	}
	public Car findOne(Integer arg0){
		return carRepository.findOne(arg0);
	}
	public <S extends Car> S save(S arg0){
		return carRepository.save(arg0);
	}
}
