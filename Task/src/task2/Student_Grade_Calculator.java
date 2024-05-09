package task2;

import java.util.*;

public class Student_Grade_Calculator {
	
	public static void main(String[] args) {
		
		//STUDENT GRADE CALCULATOR
		
		int total_Marks = 0;
		double avg_per = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Take the number of subject from user
		System.out.println("Enter number of subject:");
		int sub = sc.nextInt();
		
		if(sub <= 0) {
			System.out.println("Please enter a valid number of subject," + "\n Please try again...");
			return;
		}
		
		//Take the marks from user & calculate the Total marks in subjects
		for(int a=1;a<=sub;a++) {
			System.out.println("Enter the marks obtained in subject "+ a +":");
			int marks = sc.nextInt();
			total_Marks += marks;
		}
		
		//Calculate the Average percentage 
		avg_per = (double)total_Marks /sub ;
		
		//Display the Total marks, Average percentage and Grade
		System.out.println("Total marks: " + total_Marks);
		System.out.println("Average percentage: " + avg_per+"%");
		
		
		if(90 <= avg_per)
			System.out.println("Grade: A+");
		else if(80 <= avg_per)
			System.out.println("Grade: A");
		else if(70 <= avg_per)
			System.out.println("Grade: B");
		else if(60 <= avg_per)
			System.out.println("Grade: C");
		else 
			System.out.println("Grade: D");
		
	}
}
