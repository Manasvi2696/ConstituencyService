package org.abc.constituency.rest.controller;

import java.util.List;

import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;
import org.abc.constituency.service.ConstituencyService;
import org.abc.evs.dto.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/constituency")
public class ConstituencyRestController {

	@Autowired
	private ConstituencyService service;
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping
	public List<Constituency> getAll(){
		return service.findAll();
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping("/{id}")
	public Constituency getById(@PathVariable int id) throws ConstituencyNotFoundException {
		return service.findById(id);
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping(params = "name")
	public Constituency getByName(@RequestParam String name) throws ConstituencyNotFoundException {
		return service.findByName(name);
	}
	
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(ConstituencyNotFoundException.class)
	public ProblemDetail handleConstituencyNotFoundException(ConstituencyNotFoundException e) {
		ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		detail.setTitle("Constitunecy not found");
		return detail;
	}
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping
	public Constituency createConstituency(@RequestBody Constituency constituency) {
		return service.createConstituency(constituency);
	}
	
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void deleteConstituency(@PathVariable int id) throws ConstituencyNotFoundException {
		service.deleteConstituency(id);
	}
	
}
