package org.abc.constituency.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Constituency")
public class Constituency {

	@Id
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
