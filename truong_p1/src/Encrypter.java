/*
 * All the data is transmitted as four-digit integers. 
 * Your application should read a four-digit integer entered by the user 
 * and encrypt it as follows: 
 * Replace each digit with the result of adding 7 to the digit 
 * and getting the remainder after dividing the new value by 10. 
 * Then swap the first digit with the third, 
 * and swap the second digit with the fourth. 
 * Then print the encrypted integer. 
 * Your application should also allow the user to enter an 
 * encrypted four-digit integer and then decrypt it 
 * (by reversing the encryption scheme) to form the original number.
 * <Array> Array
 */
//import java.util.Scanner;
public class Encrypter {
	
	public static String encrypt()
	{
		/*String userString;
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();*/
		String userString = Application.getUserString();
		int userStringInt = Integer.parseInt(userString);
		int[] userIntArray = new int[userString.length()];
		int[] userIntArray2 = new int[userString.length()];

		//Break up the integer into single digits
		//This does cause them to be backwards
		for (int i = 0; i < userString.length(); i++)
		{
			userIntArray[i] = userStringInt % 10;
			userStringInt = userStringInt / 10;
		}
		//Assign the original integer in a new array
		//so they aren't in reverse order
		userIntArray2[3] = userIntArray[0];
		userIntArray2[2] = userIntArray[1];
		userIntArray2[1] = userIntArray[2];
		userIntArray2[0] = userIntArray[3];
		//Encrypting the integer (math)
		for (int i = 0; i < userIntArray2.length; i++)
		{
			int digit = userIntArray2[i];
			int math = (digit + 7)%10;
			userIntArray2[i] = math;
		}	
		//Assign array into int variables so swap the digits
		int x0 = userIntArray2[0];
		int x1 = userIntArray2[1];
		int x2 = userIntArray2[2];
		int x3 = userIntArray2[3];
		String encrypted = ("Your encrypted integer is: " + x2 + x3 + x0 + x1);
		//System.out.println("Your encrypted integer is: " + x2 + x3 + x0 + x1);
		int[] encrypt = new int[4];
		encrypt[0] = x2;
		encrypt[1] = x3;
		encrypt[2] = x1;
		encrypt[3] = x0;
		//return (Array) encrypt;
		return encrypted;
	}
}