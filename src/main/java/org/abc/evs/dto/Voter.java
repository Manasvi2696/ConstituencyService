package org.abc.evs.dto;


public class Voter {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int constituencyId;
	private String constituencyName;
	
	public Voter() {
		
	}
	
	public Voter(int id, String name, int age, String gender, int constituencyId, String constituencyName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.constituencyId = constituencyId;
		this.constituencyName = constituencyName;
	}
	public int getConstituencyId() {
		return constituencyId;
	}
	public void setConstituencyId(int constituencyId) {
		this.constituencyId = constituencyId;
	}
	public int getId() {
		return id;
	}
	public String getConstituencyName() {
		return constituencyName;
	}

	public void setConstituencyName(String constituencyName) {
		this.constituencyName = constituencyName;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", constituencyId="
				+ constituencyId + "]";
	}
		
}
