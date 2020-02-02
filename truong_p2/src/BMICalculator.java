import java.util.Scanner;
/*
 * Create a BMI calculator that reads the user’s weight and height 
 * (providing an option for the user to select which formula to use), 
 * and then calculates and displays the user’s body mass index. 
 * Also, display the BMI categories and their values from the 
 * National Heart Lung and Blood Institute: 
 * so the user can evaluate his/her BMI.
 */
public class BMICalculator {
	private double Bminumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}

	public void readUserData()
	{
		System.out.println("Would you like to use the Metric "
				+ "or Imperial unit? :");
		String userString;
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();
	}
	
	private String readUnitType()
	{
		
		return String;
	}
	
	private void readMeasurementData()
	{
		//choose between metric or imperial
	}
	
	private void readMetricData()
	{
		
	}
	
	private void readImperialData()
	{
		
	}
	
	public void calculateBmi()
	{
		
	}
	
	private void calculateBmiCategory()
	{
		
	}
	
	public void displayBmi()
	{
		
	}
	
	public void getWeight()
	{
		
	}
	
	private void setWeight()
	{
		
	}
	
	public void getHeight()
	{
		
	}
	
	private void setHeight()
	{
		
	}
	
	public double getBmi(double Bminumber)
	{
		return Bminumber;
	}
	
	public void getBmiCategory()
	{
		if (Bminumber < 18.5)
		{
			System.out.println("You are Underweight.");
		}
		else if (Bminumber >= 18.5 && Bminumber <= 24.9)
		{
			System.out.println("You are Normal Weight.");
		}
		else if (Bminumber >= 25 && Bminumber <= 29.9)
		{
			System.out.println("You are Overweight.");
		}
		else if (Bminumber > 30)
		{
			System.out.println("You are Obese.");
		}
	}
	
}
