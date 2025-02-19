package org.abc.constituency.view.impl;

import java.util.List;
import java.util.Optional;

import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ConstituencyViewImpl {

	
	public void printAll(List<Constituency> constituencies){
		System.out.println("List of All Constituency : ");
		for(Constituency constituency : constituencies) {
			System.out.println(constituency);
		}
	}
	
	public void print(Constituency constituency){
		System.out.println("details of "+constituency.getName()+" are :");
		System.out.println(constituency);
	}

	public void print(ConstituencyNotFoundException e) {
		// TODO Auto-generated method stub
		System.err.println(e.getMessage());
	}

}
