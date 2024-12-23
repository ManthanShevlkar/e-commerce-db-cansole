package main;

	
import java.util.Scanner;

public class Product {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******** Welcome to E-commerce ********\n");
		
		System.out.println("#### ProductManagement\n");
		
		System.out.println("\tEnter product Name :");
		String productName = scan.next();
		
		System.out.println("\tEnter product Quantity :"); 
		String Quantity = scan.next();
		
		System.out.println("\tEnter product price :");
		String price =scan.next();
		
	if(productName.equals("Dell")) {
		if(Quantity.equals("100")) {
			
			if(price.equals("120000")) {
				System.out.println("Product order successfull....");
				return;
			}
		}
		System.out.println("Product order unsuccessfull");
	}
		

}
}