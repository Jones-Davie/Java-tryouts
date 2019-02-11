import java.util.*;

public class kiloConversion {

	public static void main (String[] args) {
		
		double answer;
		double amount;
		boolean quit = false;
		
		Scanner input = new Scanner (System.in);
		
		
		do {
		
			System.out.println("[1] Convert pounds to kilo's");
			System.out.println("[2] Convert kilo's to pounds");
			System.out.println("[3] Quit");
			
			int choice = input.nextInt();
			
			while (choice != 1 && choice !=2 && choice != 3) {
				System.out.println("Please choose [1], [2], or [3]");
				choice = input.nextInt();
			}
			
			switch (choice) {
				
			case 1: 
				System.out.println("Enter the amount of kilo's to be converted to pounds");
				amount = input.nextDouble();
				System.out.println(amount + " kilo's is " + convertPound(amount) + " pounds");
				System.out.println();
				 
				break;
			case 2:
				System.out.println("Enter the amount of kilo's to be converted to pounds");
				amount = input.nextDouble();
				System.out.println(amount + " punds is " + convertKilo(amount) + " kilos");
				System.out.println();
				break;
			case 3:
				quit = true;
				break;
			
			} // close switch
		
		} while (quit == false);
		
	} // close static void main
	
	
	//calculate kilo to pound
	static double convertPound(double amountIn) {
		final double poundValue = 2.2;
		double amountOut; 
		
		amountOut = amountIn * poundValue;
		
		return amountOut;
		
	}
	
	
	//calculate pound to kilo
	static double convertKilo (double amountIn) {
		final double poundValue = 2.2;
		double amountOut; 
		
		amountOut = amountIn / poundValue;
		
		return amountOut;
		
	}
	
	
	
} // close class
