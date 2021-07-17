package com.epitas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeSkills {
	
	
	public static void main(String[] args) {
		HashMap<String, List<String>> employeeSkills = new HashMap<>();
		employeeSkills.put("Java", Arrays.asList(new String[] {"Yogesh", "Sharath", "Asharani", "Ritesh"}));
		employeeSkills.put("HTML", Arrays.asList(new String[] {"Yogesh", "Sharath", "Rithvik"}));
		employeeSkills.put("Flutter", Arrays.asList(new String[] {"Manikandan", "Yogesh", "Rithvik"}));
		employeeSkills.put("CV101", Arrays.asList(new String[] {"Adithya", "Mohan"}));
		System.out.println("Enter Skill:");
		Scanner sc = new Scanner(System.in);
		String skill = sc.next();
		System.out.println(employeeSkills.get(skill));
	}

}
