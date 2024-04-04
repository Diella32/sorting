package Test;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

import sortingPD.SortedList;

public class sortingTest<E> {
	
	public void quickSort() {
	String fileUsed = "hashdata.csv";
	int numberOfCollisions = 0; 
	String line = null;
	String dataType; 
	Student student;  
	String[] stringUsed; 
	SortedList<Student> studentList = new SortedList<Student>() ; 
	int id = 0; 
	

try {
	 File myObj = new File("C:\\Users\\diell\\Downloads\\hashdata.csv");
     Scanner myReader = new Scanner(myObj);
     while (myReader.hasNextLine()) {
    	 line = myReader.nextLine();
         String[] data = line.split(",");
         id = Integer.parseInt(data[0]);
         String name = data[1];
         student = new Student(id, name);
         studentList.add(student);
         

     }
     myReader.close();
     
     System.out.println(studentList);
     for (Student s : studentList) {
    	 System.out.println(s);
     }
     
     studentList.quickSort(studentList); 
   
}

catch(FileNotFoundException ex) 
	 {
	   System.out.println( "Unable to open file '" +  fileUsed + "'");                
	 }
catch(IOException ex) 
	 {
	    System.out.println (  "Error reading file '" + fileUsed + "'");   	
	 }
}	

	
	public void mergeSort() {
		String fileUsed = "hashdata.csv";
		int numberOfCollisions = 0; 
		String line = null;
		String dataType; 
		Student student;  
		String[] stringUsed; 
		SortedList studentList = new SortedList(73) ; 
		int id = 0; 
		

	try {
		 File myObj = new File("C:\\Users\\diell\\Downloads\\hashdata.csv");
	     Scanner myReader = new Scanner(myObj);
	     while (myReader.hasNextLine()) {
	    	 line = myReader.nextLine();
	         String[] data = line.split(",");
	         id = Integer.parseInt(data[0]);
	         String name = data[1];
	         student = new Student(id, name);
	         studentList.add(student);
	         

	     }
	     myReader.close();
	     studentList.mergeSort(); 
	   
	}

	catch(FileNotFoundException ex) 
		 {
		   System.out.println( "Unable to open file '" +  fileUsed + "'");                
		 }
	catch(IOException ex) 
		 {
		    System.out.println (  "Error reading file '" + fileUsed + "'");   	
		 }
	}	


	public void selectionSort(String[] args) {
		String fileUsed = "hashdata.csv";
		int numberOfCollisions = 0; 
		String line = null;
		String dataType; 
		Student student;  
		String[] stringUsed; 
		SortedList studentList = new SortedList(73) ; 
		int id = 0; 
		

	try {
		 File myObj = new File("C:\\Users\\diell\\Downloads\\hashdata.csv");
	     Scanner myReader = new Scanner(myObj);
	     while (myReader.hasNextLine()) {
	    	 line = myReader.nextLine();
	         String[] data = line.split(",");
	         id = Integer.parseInt(data[0]);
	         String name = data[1];
	         student = new Student(id, name);
	         studentList.add(student);
	         

	     }
	     myReader.close();
	     studentList.selectionSort(studentList); 
	   
	}

	catch(FileNotFoundException ex) 
		 {
		   System.out.println( "Unable to open file '" +  fileUsed + "'");                
		 }
	catch(IOException ex) 
		 {
		    System.out.println (  "Error reading file '" + fileUsed + "'");   	
		 }
	}	


	public void InsertionSort(String[] args) {
		String fileUsed = "hashdata.csv";
		int numberOfCollisions = 0; 
		String line = null;
		String dataType; 
		Student student;  
		String[] stringUsed; 
		SortedList studentList = new SortedList(73) ; 
		int id = 0; 
		

	try {
		 File myObj = new File("C:\\Users\\diell\\Downloads\\hashdata.csv");
	     Scanner myReader = new Scanner(myObj);
	     while (myReader.hasNextLine()) {
	    	 line = myReader.nextLine();
	         String[] data = line.split(",");
	         id = Integer.parseInt(data[0]);
	         String name = data[1];
	         student = new Student(id, name);
	         studentList.add(student);
	         

	     }
	     myReader.close();
	     studentList.InsertionSort(studentList); 
	   
	}

	catch(FileNotFoundException ex) 
		 {
		   System.out.println( "Unable to open file '" +  fileUsed + "'");                
		 }
	catch(IOException ex) 
		 {
		    System.out.println (  "Error reading file '" + fileUsed + "'");   	
		 }
	}

 
}

 
