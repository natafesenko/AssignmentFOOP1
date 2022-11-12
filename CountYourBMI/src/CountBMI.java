import java.util.Scanner;
import java.util.InputMismatchException; 

public class CountBMI {


	// declare variables
	double weight;
	double height;
	double bmi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	

		

		
		
		
	
	public static void welcomeMessage(String[] args) {
		
		// Welcome message
				System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗███████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ██████╗ ███╗   ███╗██╗");
				System.out.println("██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔════╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔══██╗████╗ ████║██║");
				System.out.println("██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   █████╗       ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██████╔╝██╔████╔██║██║");
				System.out.println("██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██╔══╝        ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██╔══██╗██║╚██╔╝██║██║");
				System.out.println("╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ███████╗       ██║   ╚██████╔╝╚██████╔╝██║  ██║    ██████╔╝██║ ╚═╝ ██║██║");
				System.out.println(" ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝       ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚═╝");
		
	}
	
	public static void UsersInput {
		
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
		
	}
				
				
				
				
				// Count BMI in Imperial BMI Formula
				// BMI = weight (lb) * 703 / (height (in))2	
				bmi = (weight/(height*height)*703);
				
				// Casting int to double
				int intBmi = (int) bmi;
				
				System.out.println("Your BMI is " + intBmi);
				
				if (intBmi < 15 ) {
					System.out.println("You have a Very severely underweight");
				}
				else if (intBmi <= 16) {
					System.out.println("You have a Severely underweight");
				}
				else if (intBmi <= 18.5) {
					System.out.println("You have a Underweight");
				}
				else if (intBmi <= 25) {
					System.out.println("You have a Normal (healthy weight)");
				}
				else if (intBmi >= 30) {
					System.out.println("You have a Overweight");
				}
				else if (intBmi >= 35) {
					System.out.println("You have a Moderately obese");
				}
				else if (intBmi >= 40) {
					System.out.println("You have a Severely obese");
				}
				else if (intBmi > 40 ) {
					System.out.println("You have a Very severely obese");
				}

			}

		
				
				

}
