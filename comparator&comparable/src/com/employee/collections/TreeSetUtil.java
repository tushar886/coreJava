package com.employee.collections;

import java.util.Set;
import java.util.TreeSet;

import com.pojo.employee.Employee;

public class TreeSetUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(33, "Rakesh", "Bengaluru");
		Employee emp2 = new Employee(30, "Suresh", "Rajkot");
		Employee emp3 = new Employee(35, "Mahesh", "Jhansi");
		
		Set<Employee> treeSet = new TreeSet<Employee>();
		
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		
		System.out.println("Tree Set size is as " + treeSet.size());
		int i = 0;
		for (Employee emp : treeSet) {
			i++;
			System.out.println("Seq: " + i + " " + emp.toString());
		}
	}
}
