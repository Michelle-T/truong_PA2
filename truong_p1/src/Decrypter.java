//import java.util.Scanner;

public class Decrypter {

	public static String decrypt()
	{
		/*String userString;
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();*/
		String userString = Application.getUserString2();
		int userStringInt = Integer.parseInt(userString);
		int[] userIntArray = new int[userString.length()];
		int[] userIntArray2 = new int[userString.length()];

		//Break up the integer into single digits
		for (int i = 0; i < userString.length(); i++)
		{
			userIntArray[i] = userStringInt % 10;
			userStringInt = userStringInt / 10;
		}
		//Order is in weird format so rearranged and swapped
		userIntArray2[1] = userIntArray[0];
		userIntArray2[0] = userIntArray[1];
		userIntArray2[3] = userIntArray[2];
		userIntArray2[2] = userIntArray[3];
		
		//Decrpt the integer(math)
		for (int i = 0; i < userIntArray2.length; i++)
		{
			int digit = userIntArray2[i];
			int math = (((digit + 10) - 7) % 10);
			userIntArray2[i] = math;
		}	
		
		//Assign array values into int values to print
		int x0 = userIntArray2[0];
		int x1 = userIntArray2[1];
		int x2 = userIntArray2[2];
		int x3 = userIntArray2[3];
		String decrypted = ("Your decrypted integer is: " + x0 + x1 + x2 + x3);
		//System.out.println("Your decrypted integer is: " + x0 + x1 + x2 + x3);
		int[] decrypt = new int[4];
		decrypt[0] = x0;
		decrypt[1] = x1;
		decrypt[2] = x2;
		decrypt[3] = x3;
		return decrypted;
	}

}
