package org.abc.constituency.dto;


public class Constituency {

	private int id;
	private String name;
	public Constituency() {
		
	}
	public Constituency(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Constituency [id=" + id + ", name=" + name + "]";
	}
	
	
}
