package org.geymer.carsmasher.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.geymer.carsmasher.entity.Tire;
import org.geymer.carsmasher.service.TireManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/tires")
public class TireController {
	@Autowired
	TireManager tireManager;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("tires",tireManager.getAll());
		return "tires";
	}
	
	@RequestMapping(value="/add/{carId}",method=RequestMethod.GET)
	public String add(@PathVariable("carId")Integer carId,Model model){
		model.addAttribute("tire",new Tire());
		model.addAttribute("carId",carId);
		return "addTire";
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("tire") Tire tire,HttpServletRequest request){
		tireManager.add(tire);
		return "redirect:/tires";	
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable("id") Integer carId,Model model){
		model.addAttribute("car",tireManager.get(carId));
		return "editCar";
		
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.POST)
	public String edit(@ModelAttribute("tire") Tire tire){
		tireManager.edit(tire);
		return "redirect:/tires";
		
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable("id") Integer carId){
		tireManager.delete(carId);
		System.out.println("Delete tire "+carId);
		return "redirect:/tires";
	}
}
