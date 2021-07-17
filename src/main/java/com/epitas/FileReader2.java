package com.epitas;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReader2 {

	public static void main(String[] args) {
		String fileName;
		List<String> lines = Collections.emptyList(); 
		String[] fileWords; 
		String [] skills = {"Java","HTML","Flutter","Python","JavaScript"};
		try 
		{ 
			File file = new File ("F:/JavaExamples/sharath.txt");
			lines = Files.readAllLines(Paths.get("F:/JavaExamples/FileExample.txt"), StandardCharsets.UTF_8); 
			fileName = file.getName();
			System.out.println(fileName + " File name");
			
			for(String line : lines) {
				fileWords = line.split(" ");
				System.out.println(fileWords + " File words");
			}
			} 
		catch (IOException e) 
		{ 
			e.printStackTrace();
			} 
}
}
