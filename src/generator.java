import java.util.Scanner;

public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hello " + name + " Enter a whole number between 1 and 100. :");
		int userNum = scan.nextInt();
		
		if (userNum > 0  && userNum <= 100) {
			
		}
		if (userNum % 2 != 0 && userNum <=25) { 
			System.out.println("Your number " + userNum + " is a odd number and less than 25, " + name);
			
		} 
		else if (userNum % 2 != 0 && userNum > 60) {
			System.out.println("Your number " + name + " is an odd number and is greater then 60, " + name);
			
		} 
		else if (userNum % 2 == 0 && userNum <= 25) {
		System.out.println("Your number " + userNum + " is an even number and is less than 25, " + name);
		
	}else if (userNum % 2 == 0 && userNum >= 60) {
		System.out.println("Your number " + userNum + " is an even number and is greater than 60, " + name);
		
	} 
		System.out.println("Thank you for your time.");
	   
	    
			
		
		
		
		
		scan.close();
	}


	}


