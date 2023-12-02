package org.bsl.ees.employeeexpenseservice.pojo;

public class expenseService {

	private String name;
	private int age;
	public expenseService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public expenseService()
	{
		
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

	
}
