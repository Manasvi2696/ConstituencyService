package org.abc.constituency.service;

import java.util.List;
import java.util.Optional;

import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;

public interface ConstituencyService {

	public List<Constituency> findAll();
	
	public Constituency findById(int id) throws ConstituencyNotFoundException;
	
	public Constituency findByName(String name) throws ConstituencyNotFoundException;
	
	public Constituency createConstituency(Constituency constituency);
	
	public void deleteConstituency(int id)throws ConstituencyNotFoundException;
	
}
