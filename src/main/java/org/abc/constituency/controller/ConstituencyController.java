package org.abc.constituency.controller;

import java.util.List;
import java.util.Optional;

import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;
import org.abc.constituency.service.impl.ConstituencyServiceImpl;
import org.abc.constituency.view.impl.ConstituencyViewImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstituencyController {

	@Autowired
	private ConstituencyServiceImpl service;
	@Autowired
	private ConstituencyViewImpl view;
	
	public void searchAll(){
		List<Constituency> constituency = service.findAll();
		view.printAll(constituency);
	}
	
	public void searchById(int id) throws ConstituencyNotFoundException{
		Constituency c = service.findById(id);
		view.print(c);
	}
	
	public void registerNewConstituency(Constituency constituency) {
		Constituency c = service.createConstituency(constituency);
		view.print(constituency);
		
	}

	public void deleteConstituency(int id) throws ConstituencyNotFoundException {
		service.deleteConstituency(id);
	}
	
	//@ExceptionHandler(ConstituencyNotFoundException.class)
	//this need web dependency
	public void handleConstituencyNotFoundException(ConstituencyNotFoundException e) {
		view.print(e);
	}
}
