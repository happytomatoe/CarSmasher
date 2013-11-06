package org.geymer.carsmasher.service;

import java.util.List;

import org.geymer.carsmasher.dao.CarDAO;
import org.geymer.carsmasher.entity.Car;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarManager {
	@Autowired
	CarDAO carDAO;

	public Integer add(Car car) {
		return carDAO.add(car);
	}

	public List<Car> getAll() {
		return carDAO.getAll();
	}

	public Car get(Integer id) {
		return carDAO.get(id);
	}

	public void edit(Car car) {
		carDAO.edit(car);
	}

	public void delete(Integer id) {
		carDAO.delete(id);
	}

}
