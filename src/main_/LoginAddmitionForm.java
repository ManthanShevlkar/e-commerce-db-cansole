package main_;
import java.util.Scanner;

public class LoginAddmitionForm {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**** Welcome Addmition portel ******\n");
		
		System.out.println("***** Login Form :\n");
		
		System.out.println("\tEnter College Name :") ;
		String CollegeName = scan.next();
		
		System.out.println("\tEnter Student Name :\n\n");
		String StudentName = scan.next();
		
		System.out.println("\tEnter CET Allotment Letter :\n\n");
		String AllotmentLetter = scan.next();
		
		System.out.println("\tEnter Marks Cutoff :");
		String Cutoff = scan.next();
		
		if(CollegeName.equals("Deogiri college")) {
			if(StudentName.equals("Manthan")) {
				if(AllotmentLetter.equals("XYZ")) {
					if(Cutoff.equals("92")) {
						System.out.println("Cutoff is  Match___");
						return;
					}
				}
				System.out.println("Cutoff is not Match____");
			}
			
		}
	}

}
