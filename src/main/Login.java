package main;

import java.util.Scanner;

public class Login {
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******** Wlecome to E-commerce ******** ");
		
		System.out.println("***** Login :");
		
		System.out.println("\tEnter User Name :");
		String UserName = scan.next();
		
		System.out.println("\tEnter User Password :");
		String Password = scan.next();
		
		if(UserName.equals("Manthan")) {
			if(Password.equals("Email@123")) {
				System.out.println("Login Success ");
				return;
		}
		
	  
		}
		  System.out.println("Login faild");
	}
}
