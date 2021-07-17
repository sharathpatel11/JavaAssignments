package com.epitas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class FileReaderUsingStream {

	public static void main(String [] args) {
		try {
			InputStream file = new FileInputStream("F:/JavaExamples/FileExample.txt");
		Stream<String> linesStream = new BufferedReader(new InputStreamReader(file)).lines();
	
		linesStream.forEach(System.out::println);
		}
		catch (IOException e) {
            e.printStackTrace();
        }
	    
	}
}
