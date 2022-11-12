import java.util.Scanner;
import java.util.InputMismatchException; 

public class CountBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare variables
		double weight;
		double height;
		double bmi;
		
		// Welcome message
		System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗███████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ██████╗ ███╗   ███╗██╗");
		System.out.println("██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔════╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔══██╗████╗ ████║██║");
		System.out.println("██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   █████╗       ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██████╔╝██╔████╔██║██║");
		System.out.println("██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██╔══╝        ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██╔══██╗██║╚██╔╝██║██║");
		System.out.println("╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ███████╗       ██║   ╚██████╔╝╚██████╔╝██║  ██║    ██████╔╝██║ ╚═╝ ██║██║");
		System.out.println(" ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝       ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚═╝");
		
		// creates a new Scanner instance which points to the input stream passed as argument
		Scanner in = new Scanner(System.in);
		
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
		
		// work with variable height
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
		
		// Count BMI in Imperial BMI Formula
		// BMI = weight (lb) * 703 / (height (in))2	
		bmi = (weight*703/(height*height));
		
		// Casting int to double
		int i_bmi = (int) bmi;
		
		System.out.println("Your BMI is " + i_bmi);
		
		if (i_bmi < 15 ) {
			System.out.println("You have a Very severely underweight");
		}
		else if (i_bmi <= 16) {
			System.out.println("You have a Severely underweight");
		}
		else if (i_bmi <= 18.5) {
			System.out.println("You have a Underweight");
		}
		else if (i_bmi <= 25) {
			System.out.println("You have a Normal (healthy weight)");
		}
		else if (i_bmi >= 30) {
			System.out.println("You have a Overweight");
		}
		else if (i_bmi >= 35) {
			System.out.println("You have a Moderately obese");
		}
		else if (i_bmi >= 40) {
			System.out.println("You have a Severely obese");
		}
		else if (i_bmi > 40 ) {
			System.out.println("You have a Very severely obese");
		}

	}

}
