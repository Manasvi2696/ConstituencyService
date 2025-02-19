package org.abc.constituency.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.abc.constituency.dao.ConstituencyDao;
import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;
import org.abc.constituency.service.ConstituencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstituencyServiceImpl implements ConstituencyService{
	
	@Autowired
	private ConstituencyDao dao;
	
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public List<Constituency> findAll() {
		return dao.findAll();
	}

	@Override
	public Constituency findById(int id) throws ConstituencyNotFoundException {
		 Optional<Constituency> o = dao.findById(id);
		 if(o.isPresent())
			 return o.get();
		 throw new ConstituencyNotFoundException(id);
	}

	@Override
	public Constituency createConstituency(Constituency constituency) {
		return dao.save(constituency);
	}

	@Override
	public void deleteConstituency(int id) throws ConstituencyNotFoundException{
		findById(id);
		dao.deleteById(id);
	}

	@Override
	public Constituency findByName(String name) throws ConstituencyNotFoundException {
		return dao.findByName(name);
	}

}

