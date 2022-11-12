import java.util.Scanner;
import java.util.InputMismatchException; 

public class CountBMI {


	// declare variables
	double weight;
	double height;
	double bmi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}	
	
	public static void welcomeMessage() {
		
		// Welcome message
				System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗███████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ██████╗ ███╗   ███╗██╗");
				System.out.println("██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔════╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔══██╗████╗ ████║██║");
				System.out.println("██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   █████╗       ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██████╔╝██╔████╔██║██║");
				System.out.println("██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██╔══╝        ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██╔══██╗██║╚██╔╝██║██║");
				System.out.println("╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ███████╗       ██║   ╚██████╔╝╚██████╔╝██║  ██║    ██████╔╝██║ ╚═╝ ██║██║");
				System.out.println(" ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝       ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚═╝");
		
	}
	
	public static void UsersInputWeight(double weight) {
		
		// creates a new Scanner instance which points to the input stream passed as argument
		Scanner in = new Scanner(System.in);
		
        if (Double.doubleToRawLongBits(weight) <= 0) {
            System.err.println("you must weight something!");
          }
				
		// work with variable weight
		while(true) {
			try {
				System.out.println("What your Weight? (lb)");
				// initial variable weight
				weight = in.nextDouble();
				System.out.println("Thanks");
				break;
				// processing the error
			}catch(InputMismatchException ex) {
				System.out.println("Error in your input");
				//resets this scanner
				in.reset();
				return;
			}
				
		}			
	}
	
	public static void UsersInput(double height) {
		
		Scanner in = new Scanner(System.in);
		
       if (Double.doubleToRawLongBits(height) <= 0) {
            System.err.println("you must have height!");
          }
		 //work with variable height
		while(true) {
			try {
				System.out.println("What your Height? (in)");
				// initial variable height
				height = in.nextDouble();
			System.out.println("Thanks");
				break;
			// processing the error
			}catch(InputMismatchException ex) {
				System.out.println("Error in your input");
				//resets this scanner
				in.reset();
			}
		}
		
	}
	
	public static void CountBmi(double bmi, double weight, double height) {
		// Count BMI in Imperial BMI Formula
		// BMI = weight (lb) * 703 / (height (in))2	
		bmi = (weight/(height*height)*703);
		
	}
				
	public static void CastingBmi(double bmi) {
		
		// Casting int to double
		Scanner in = new Scanner(System.in);
		int question = in.nextInt();
		System.out.println("Round your BMI? If answer yes, you should write 1, if no - 0");
		if (question == 1) { 
			int intBmi = (int) bmi;
			System.out.println("Your BMI is " + intBmi);
		}
		else if(question == 0) {
			System.out.println("Your BMI is " + bmi);
		}
			
		
	}
	
	public static void compareBMI (double bmi, int intBmi) {
		
		System.out.println("Your BMI is " + intBmi);
		
		if (bmi < 15 ) {
			System.out.println("You have a Very severely underweight");
		}
		else if (bmi <= 16) {
			System.out.println("You have a Severely underweight");
		}
		else if (bmi <= 18.5) {
			System.out.println("You have a Underweight");
		}
		else if (bmi <= 25) {
			System.out.println("You have a Normal (healthy weight)");
		}
		else if (bmi >= 30) {
			System.out.println("You have a Overweight");
		}
		else if (bmi >= 35) {
			System.out.println("You have a Moderately obese");
		}
		else if (bmi >= 40) {
			System.out.println("You have a Severely obese");
		}
		else if (bmi > 40 ) {
			System.out.println("You have a Very severely obese");
		}
		
		
	}
	
				

}
