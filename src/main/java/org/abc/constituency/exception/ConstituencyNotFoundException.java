package org.abc.constituency.exception;

public class ConstituencyNotFoundException extends Exception{
	
	public ConstituencyNotFoundException(int id) {
		super("Constituency with id :"+id+" Not found.");
	}

}
