package com.epitas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FileReader3 {
    public static void main(String[] args) throws IOException {
        String fileName = "";
        String employeeName = "";
        File folder = new File("F:/JavaExamples/Text files");
        
        File[] listOfFiles = folder.listFiles();
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("HTML");
        skills.add("Flutter");
        skills.add("Python");
        skills.add("JavaScript");
        skills.add("MySQL");
        skills.add("AI");
        skills.add("PHP");
        skills.add("AWS");

        String word = "";
        HashMap<String, Set<String>> employeeSkills = new HashMap<>();
        HashMap<String, Set<String>> skillList = new HashMap<>();

        HashMap<String, Set<String>> employeeSkills1 = new HashMap<>();

        for (File file : listOfFiles) {
            Set<String> words = new HashSet();
            if (file.isFile()) {
                fileName = file.getName();
                if (!fileName.toLowerCase().endsWith(".txt")) continue;
//                employeeName = fileName.replaceFirst("[.][^.]+$", "");
                employeeName = fileName.substring(0,fileName.length()-4);
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    word = input.next();
                    words.add(word);
                }
                words.retainAll(skills);
            }
            // System.out.println(employeeName + " employeeName");
            //  System.out.println(words + " words");

            employeeSkills1.put(employeeName, words);
        }
        for (String skill : skills) {
            skillList.put(skill, new HashSet<>());
        }
        for (Map.Entry<String, Set<String>> empSkillEntry : employeeSkills1.entrySet()) {
            Set<String> skills1 = empSkillEntry.getValue();
            String emp1 = empSkillEntry.getKey();
            for (String skill : skills1) {
                skillList.get(skill).add(emp1);
            }
        }
        System.out.println("Enter Employee Name/Skill");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if(skills.contains(userInput)) {
        	System.out.println(skillList.get(userInput));
        }else {
        	System.out.println(employeeSkills1.get(userInput));
        }
        
        
		/*
		 * for(String skillLists : skills) { if(skillLists.contains(userInput)) {
		 * System.out.println(skillList.get(userInput)); }else {
		 * System.out.println(employeeSkills1.get(userInput)); } }
		 */
        
    }
}