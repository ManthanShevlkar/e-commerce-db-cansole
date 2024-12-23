package main_;
import java.util.Scanner;

public class userManagement {
	public static void main(String[] arg) {
		
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("######### Welcome to E-commerce #######\n");
			
			System.out.println("*****UserManagement :\n");
			
			System.out.println("\tEnter User Name :");
			String userName = scan.next();
			
			System.out.println("\tEnter User Email :");
			String Email = scan.next();
			
			System.out.println("\tEnter User Delivered pin :");
			String pin = scan.next();
			
			if(userName.equals("Manthan")) {
				if(Email.equals("Email@123")) {
					if(pin.equals("3000")) {
						System.out.println("User Information Correct");
						return;
					}
					
				}
				     System.out.println("User Information Wrong");
			}
	}
	

}
