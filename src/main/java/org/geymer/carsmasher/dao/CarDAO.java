package org.geymer.carsmasher.dao;

import java.util.List;

import org.geymer.carsmasher.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CarDAO {
	@Autowired
	SessionFactory sessionFactory;

	public Integer add(Car car) {
		return (Integer) sessionFactory.getCurrentSession().save(car);
	}
	
	
	public List<Car> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(Car.class).list();
	}
	public Car get(Integer id) {
		return (Car)sessionFactory.getCurrentSession().get(Car.class, id);
	}
	public void edit(Car car) {
		sessionFactory.getCurrentSession().update(car);
	}
	public void delete(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Car car=(Car)session.get(Car.class, id);
		if(car!=null)session.delete(car);
	}
	
	
	
}
