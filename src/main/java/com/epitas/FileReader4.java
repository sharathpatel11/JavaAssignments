package com.epitas;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileReader4 {
	 public static void main(String[] args) throws IOException {

         File file = new File("F:/JavaExamples/sharath.txt");
         String employeeName1 = file.getName();
         String employeeName = employeeName1.replaceFirst("[.][^.]+$", "");
         
         Scanner input = new Scanner(file);
         List<String> words = new ArrayList<>();
         List<String> skills = new ArrayList<>();
         skills.add("Java");
         skills.add("HTML");
         skills.add("Flutter");
         skills.add("");
         skills.add("Python");
         
         skills.add("JavaScript");
         
         for(String s : skills) {
        	 System.out.println(s);
         }
         String word = "";
       
         int count = 0;
         while (input.hasNext()) {
           word = input.next();
           words.add(word);
           words.retainAll(skills);
         }
        
         
         
         HashMap<String, List<String>> employeeSkills = new HashMap<>();
         List<String> skillSet = new ArrayList<>();
         
         
         skillSet.addAll(words);
         
         employeeSkills.put(employeeName, skillSet);
         System.out.println("Enter Employee Name");
         Scanner sc = new Scanner(System.in);
         String skill = sc.next();
         System.out.println(employeeSkills.get(skill));
         List<String> employeeNames = new ArrayList<>();
         employeeNames.add(employeeName);

         HashMap<String, List<String>> skillList = new HashMap<>();

         skillList.put(words.get(0), employeeNames);
          System.out.println("Enter Skill Name");
          Scanner sc1 = new Scanner(System.in);
          String skillName = sc1.next();
          System.out.println(skillList.get(skillName));
       }
     }
