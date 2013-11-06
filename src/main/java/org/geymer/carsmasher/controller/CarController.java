package org.geymer.carsmasher.controller;

import java.util.Locale;

import org.geymer.carsmasher.entity.Car;
import org.geymer.carsmasher.service.CarManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/cars")
public class CarController {
	@Autowired
	CarManager carManager;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping( method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(carManager.getAll());
		model.addAttribute("cars",carManager.getAll());
		return "cars";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("car",new Car());
		return "addCar";
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("car") Car car){
		carManager.add(car);
		return "redirect:/cars";
		
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable("id") Integer carId,Model model){
		model.addAttribute("car",carManager.get(carId));
		return "editCar";
		
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.POST)
	public String edit(@ModelAttribute("car") Car car){
		carManager.edit(car);
		return "redirect:/cars";
		
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable("id") Integer carId){
		carManager.delete(carId);
		System.out.println("Delete car "+carId);
		return "redirect:/cars";
		
	}
	
	
	
}
