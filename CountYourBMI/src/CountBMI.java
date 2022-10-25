import java.util.Scanner;

public class CountBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight;
		double height;
		double bmi;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What your Weight? (lb)");
		weight = in.nextDouble();
		
		System.out.println("What your Height? (in)");
		height = in.nextDouble();
		
		// Count BMI in Imperial BMI Formula
		// BMI = weight (lb) * 703 / (height (in))2
				
		bmi = (weight*703/(height*height));
		
		int i_bmi = (int) bmi;
	 
		System.out.println("Your BMI is " + i_bmi);
		
		switch(i_bmi) {
		  case 1:
		  	if (bmi < 15);
			  System.out.println("Very severely underweight");
			break;
		  case 2:
			  if (bmi <= 16);
			  System.out.println("Severely underweight");
			break;
		  case 3:
			  if (bmi <= 18.5);
			  System.out.println("Underweight");
			break;
		  case 5:
			  if (bmi <= 25);
			  System.out.println("Normal (healthy weight)");
			break;
		  case 6:
			  if (bmi <= 30);
			  System.out.println("Overweight)");
			break;
		  case 7:
			  if (bmi <= 35);
			  System.out.println("Moderately obese");
			break;
		  case 8:
			  if (bmi <= 40);
			  System.out.println("Severely obese");
			break;
		  case 9:
			  if (bmi < 40);
			  System.out.println("Very severely obese");
			break;
		  default:

		}

	}

}
