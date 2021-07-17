package com.epitas;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FileReader {

	

	public static void main(String[] args) {
		String fileName;
		List<String> lines = Collections.emptyList(); 
		String[] finalLines; 
		String [] skills = {"Java","HTML","Flutter","Python","JavaScript"};
		try 
		{ 
			File file = new File ("F:/JavaExamples/sharath.txt");
			Path path = Paths.get(URI.create("F:/JavaExamples/sharath.txt"));
			lines = Files.readAllLines(path, StandardCharsets.UTF_8); 
			fileName = file.getName();
			System.out.println(fileName + " File name");
			} 
		catch (IOException e) 
		{ 
			e.printStackTrace();
			} 
		
		System.out.println(lines.size() + "Size");
		for(String line: lines) {
			line = line.replaceAll("[^a-zA-Z0-9]", " ");  
			finalLines = line.split(" ");
			System.out.println(finalLines.length);
			for(String words : finalLines) {
				System.out.println(words);
			}
			
		}
	}
}
