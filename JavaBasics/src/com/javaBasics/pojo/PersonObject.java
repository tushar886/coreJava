package com.javaBasics.pojo;

public class PersonObject {

	private static Person pClassLevelRef = null;
	
	public static void main(String[] args) {

		final Person p1 = new Person("Tushar", 28);
		final Person p2 = new Person("Tushar", 28);
		
		pClassLevelRef = p1;
		
		System.out.println(p1.getName() == p2.getName());
		
		updatePersonNameAttribute(p1);
		
		System.out.println("New Person p1 name after attribute update is as: " + p1.getName());
		
		updatePersonObject(p1);
		
		System.out.println("New Person p1 name after object update is as: " + p1.getName());
		
	}

	private static void updatePersonObject(Person p1) {
		p1 = new Person("Roger", 34);
	}

	private static void updatePersonNameAttribute(final Person p1) {
		
		System.out.println("Class level Person Ref and local Person ref equality :" + (pClassLevelRef == p1));
		p1.setName("Alex");
	}

}
