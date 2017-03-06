package com.pojo.employee;

public class Employee implements Comparable<Employee> {
	
	private int age;
	private String name;
	private String city;
	
	public Employee(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(final Employee emp) {
		if (this.age > emp.getAge())
			return -1;
		else if (this.age < emp.getAge())
			return 1;
		else 
		    return 0;
	}
}
