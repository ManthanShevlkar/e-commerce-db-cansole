package main; 

import java.util.Scanner;

public class CollegeAddmition {
	
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***** Welcome Java Class ****\n");
		
		System.out.println("List of student : ...\n");
		
		System.out.print("\tEnter first Student :");
		String Student = scan.next();
		
		System.out.print("\tEnter second Student :");
		String Student2 = scan.next();
		
		System.out.print("\tEnter thired Student : ");
		String Student3 = scan.next();
		
		if(Student.equals("Manthan")) {
			if(Student2.equals("Ritesh")) {
				if(Student3.equals("jay")) {
					System.out.println("no..of student list correct..");
					return;
				}
			}
			System.out.println("no list incorrect...");
		}
		
		
		
	}

}

