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
		
		if (i_bmi < 15 ) {
			System.out.println("Very severely underweight");
		}
		else if (i_bmi <= 16) {
			System.out.println("Severely underweight");
		}
		else if (i_bmi <= 18.5) {
			System.out.println("Underweight");
		}
		else if (i_bmi <= 25) {
			System.out.println("Normal (healthy weight)");
		}
		else if (i_bmi >= 30) {
			System.out.println("Overweight");
		}
		else if (i_bmi >= 35) {
			System.out.println("Moderately obese");
		}
		else if (i_bmi >= 40) {
			System.out.println("Severely obese");
		}
		else if (i_bmi > 40 ) {
			System.out.println("Very severely obese" );
		}

	}

}
