package com.epitas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Store {
public static void main(String[] args) {
		
	HashMap<String, List<String>> employeeSkills = new HashMap<>();
	
	employeeSkills.put("Java", Arrays.asList(new String[] {"Yogesh", "Sharath", "Asha","Ritesh"}));
	employeeSkills.put("HTML", Arrays.asList(new String[] {"Yogesh", "Sharath", "Asha", "Rithvik"}));
	employeeSkills.put("Flutter", Arrays.asList(new String[] {"Manikandan", "Yogesh", "Rithvik"}));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Skill:");
	String skill = sc.next();
	System.out.println(employeeSkills.get(skill));
	//System.out.println(employeeSkills.get(skill));
	
}
}