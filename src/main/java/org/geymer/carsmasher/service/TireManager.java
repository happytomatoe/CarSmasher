package org.geymer.carsmasher.service;

import java.util.List;

import org.geymer.carsmasher.dao.TireRepository;
import org.geymer.carsmasher.entity.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service

@Transactional
public class TireManager {
	@Autowired
	TireRepository tireRepository;
	public List<Tire> findAll(){
		return tireRepository.findAll();
	}
	public void delete(Integer arg0){
		tireRepository.delete(arg0);
	}
	public Tire findOne(Integer arg0){
		return tireRepository.findOne(arg0);
	}
	public <S extends Tire> S save(S arg0){
		return tireRepository.save(arg0);
	}

}
