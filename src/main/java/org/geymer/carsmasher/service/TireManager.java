package org.geymer.carsmasher.service;

import java.util.List;

import org.geymer.carsmasher.dao.TireDAO;
import org.geymer.carsmasher.entity.Tire;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class TireManager {
	@Autowired
	TireDAO tireDAO;
	public Integer add(Tire tire) {
	return tireDAO.add(tire);
	}
	public List<Tire> getAll() {
		return tireDAO.getAll();
	}
	public Tire get(Integer id) {
		return tireDAO.get(id);
	}
	public void edit(Tire tire) {
		tireDAO.edit(tire);
	}
	public void delete(Integer id) {
	tireDAO.delete(id);
	}
}
