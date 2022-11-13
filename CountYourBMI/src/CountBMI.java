import java.util.Scanner;
import java.util.InputMismatchException; 

public class CountBMI {
	// declare variables
	static double weight;
	static double height;
	static double bmi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeMessage();
		Scanner in = new Scanner(System.in);

		
		weight = UserInput(in, "What your Weight? (lb)");
		height = UserInput(in, "What your Height? (in)");
		bmi = CountBmi(weight, height);
		CastingBmi(bmi);
		compareBMI(bmi);
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
	
	public static Double UserInput(Scanner in, String question) {
		
		// Scanner in = new Scanner(System.in);
	    // work with variable height
	    double output;
	    while (true) {
	      try {
	        System.out.println(question);
	        // initial variable height
	        output = in.nextDouble();
	        System.out.println("Thanks");
	        break;
	        // processing the error
	      } catch (InputMismatchException ex) {
	        System.out.println("Error in your input");
	        // resets this scanner
	        in.reset();
	      }
	    }
	    if (Double.doubleToRawLongBits(output) <= 0) {
	      System.err.println("you must provide a correct input(double precision float)");
	    }
	    
	    return output;
	}
	
	
	
	public static double CountBmi(double weight, double height) {
		// Count BMI in Imperial BMI Formula
		// BMI = weight (lb) * 703 / (height (in))2	
		return bmi = (weight/(height*height)*703);
	}
				
	public static void CastingBmi(double bmi) {
	    // Casting int to double
	    int question = in.nextInt();
	    System.out.println("Round your BMI? If answer yes, you should write 1, if no - 0");
	    if (question == 1) {
		      int intBmi = (int) bmi;
		      System.out.println("Your BMI is " + intBmi);
		      return;
	    }
	    if(question == 0) {
	      System.out.println("Your BMI is " + bmi);
	    }
	    return;
	}
	    

	public static void compareBMI (double bmi) {
	
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
