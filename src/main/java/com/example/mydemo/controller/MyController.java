package com.example.mydemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.mydemo.to.Employee;

@RestController
public class MyController {
	
	@RequestMapping("/test")
	public String getMessage() {
		
		return "Welcome";
	}
	
	@RequestMapping("/backToupload")
	public String getMessage1() {
		
		return "Thank you";
	}
	
	
	@RequestMapping("/employee")
	public ModelAndView getEmployee() {
		
		ModelAndView model = new ModelAndView("uploadStatus");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ram","234",45677.99));
		empList.add(new Employee("Sekar","234",77745677.99));
		empList.add(new Employee("Singaram","234",77745677.99));
		empList.add(new Employee("Ram1","234",45677.99));
		
		model.addObject("employees", empList);
		model.addObject("message", "Employee List");
		
		return model;
		
		
		
	}
	

}
