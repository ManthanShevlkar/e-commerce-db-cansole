package main_;
import java.util.Scanner;

public class ProductList {
	public static void main(String[] arg) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("******** Product ********\n");
		
		System.out.println("#### Product Name \n");
		
		System.out.println("\tEnter product Name :\n");
		String productName = scan.next();
		
		System.out.println("\tEnter product Quantity :\n"); 
		String Quantity = scan.next();
		
		System.out.println("\tEnter product price :");
		String price =scan.next();
		
	if(productName.equals("Dell Leptop")) {
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
