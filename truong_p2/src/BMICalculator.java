import java.util.Scanner;
/*
 * Create a BMI calculator that reads the user’s weight and height 
 * (providing an option for the user to select which formula to use), 
 * and then calculates and displays the user’s body mass index. 
 * Also, display the BMI categories and their values from the 
 * National Heart Lung and Blood Institute: 
 * so the user can evaluate his/her BMI.
 * 
 * NOTE: You can enter in "m" "i" "M" "I" "Metric" or "Imperial"
 * to choose the unitType
 */
public class BMICalculator {
	private String userData;
	private double weight;
	private double height;
	private double bmiNumber;
	private String bmiCategoryList;
	
	private boolean metric = false;
	private boolean imperial = false;
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}

	public void readUserData()
	{
		System.out.println("Please enter in your full name: ");
		Scanner in = new Scanner(System.in);
		userData = in.nextLine();
		readUnitType(userData);
		//goto readUnitType & readMeasurementData
	}
	
	private String readUnitType(String unitType)
	{
		System.out.println(userData + ": Would you like to use the Metric "
				+ "or Imperial unit?: ");
		Scanner in0 = new Scanner(System.in);
		unitType = in0.nextLine();
		readMeasurementData(unitType);
		return unitType;
	}
	
	private String readMeasurementData(String unitType)
	{
		//choose between metric or imperial
		if (unitType.equals("Metric") || unitType.equals("M") 
				|| unitType.equals("m"))
		{
			metric = true;
			readMetricData(weight, height);
		}
		
		else if (unitType.equals("Imperial") || unitType.equals("I") 
				|| unitType.equals("i"))
		{
			imperial = true;
			readImperialData(weight, height);
		}
		else 
		{
			System.out.println("Please enter a valid choice");
			readUnitType(unitType);
		}
		return unitType;
	}
	
	private void readMetricData(double weight, double height)
	{
		//read in the users metric data
		System.out.println(userData + ": Please enter in your weight in "
				+ "kilograms (ex: 50.00): ");
		Scanner in1 = new Scanner(System.in);
		weight = in1.nextDouble();
		if (weight < 0)
		{
			System.exit(0);
		}
		System.out.println(userData + ": Please enter in your height in "
				+ "meters (ex: 1.55): ");
		Scanner in2 = new Scanner(System.in);
		height = in2.nextDouble();
		if (height < 0)
		{
			System.exit(0);
		}
		this.weight = weight;
		this.height = height;
	}
	
	private void readImperialData(double weight, double height)
	{
		//read in the users imperial data
		System.out.println(userData + ": Please enter in your weight in "
				+ "pounds (ex: 110.00): ");
		Scanner in3 = new Scanner(System.in);
		weight = in3.nextDouble();
		if (weight < 0)
		{
			System.exit(0);
		}
		System.out.println(userData + ": Please enter in your height in "
				+ "inches (ex: 61.00): ");
		Scanner in4 = new Scanner(System.in);
		height = in4.nextDouble();
		if (height < 0)
		{
			System.exit(0);
		}
		this.weight = weight;
		this.height = height;
	}
	
	public void calculateBmi()
	{
		//calculateBmi and Bmicategory
		if (metric == true)
		{
			//Metric
			//BMI = (kilograms / heightinMeters^2)
			bmiNumber = (weight / (height * height));
			calculateBmiCategory(bmiNumber);
		}
		else if (imperial == true)
		{
			//Imperial
			//BMI = ((703 * pounds) / (heightinInches^2))
			bmiNumber = ((703 * weight) / (height * height));
			calculateBmiCategory(bmiNumber);
		}
	}
	
	private void calculateBmiCategory(double bmiNumber)
	{
		//calculates the user's BMI and Bmicategory
		if (bmiNumber < 18.5)
		{
			bmiCategoryList = "Your BMI number is: "
					+ bmiNumber + ": You are Underweight.";
		}
		else if (bmiNumber >= 18.5 && bmiNumber <= 24.9)
		{
			bmiCategoryList = "Your BMI number is: "
					+ bmiNumber + ": You are Normal Weight.";
		}
		else if (bmiNumber >= 25 && bmiNumber <= 29.9)
		{
			bmiCategoryList = "Your BMI number is: "
					+ bmiNumber + ": You are Overweight.";
		}
		else if (bmiNumber > 30)
		{
			bmiCategoryList = "Your BMI number is: "
					+ bmiNumber + ": You are Obese.";
		}
	}
	
	public void displayBmi()
	{
		System.out.println(bmiCategoryList);
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	private void setWeight(double weight)
	{
		this.weight = weight;
		if (this.weight < 0)
		{
			System.exit(0);
		}
	}
	
	public double getHeight()
	{
		return height;
	}
	
	private void setHeight(double height)
	{
		this.height = height;
		if (this.height < 0)
		{
			System.exit(0);
		}
	}
	
	public double getBmi(double bmiNumber)
	{
		return bmiNumber;
	}
	
	public void getBmiCategory(String bmiCategoryList)
	{
		this.bmiCategoryList = bmiCategoryList;
	}
	
}
