package org.geymer.carsmasher.dao;


import java.util.List;

import org.geymer.carsmasher.entity.Car;
import org.geymer.carsmasher.entity.Tire;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TireDAO {
	@Autowired
	SessionFactory sessionFactory;
	public Integer add(Tire tire) {
		return (Integer)sessionFactory.getCurrentSession().save(tire);
	}
	public List<Tire> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(Tire.class).list();
	}
	public Tire get(Integer id) {
		return (Tire)sessionFactory.getCurrentSession().get(Tire.class, id);
	}
	public void edit(Tire tire) {
		sessionFactory.getCurrentSession().update(tire);
	}
	public void delete(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Tire Tire=(Tire)session.get(Tire.class, id);
		if(Tire!=null)session.delete(Tire);
	}
}
