/*
 * The main method reads a 4 digit integer from the user
The main method encrypts the user's value using Encrypter.encrypt
The main method prints the encrypted value to standard output
The main method decrypts the user's value using Decrypter.decrypt
The main method prints the decrypted value to standard output
 */

import java.util.Scanner;

public class Application {

	private static String userString;
	private static String userString2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter in a four digit integer: ");
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();
		Encrypter.encrypt();
		System.out.println(Encrypter.encrypt());
		System.out.print("Please enter in an encrypted four digit integer: ");
		Scanner in0 = new Scanner(System.in);
		userString2 = in0.nextLine();
		Decrypter.decrypt();
		System.out.println(Decrypter.decrypt());
	}

	public static String getUserString()
	{
		return userString;
	}
	
	public static String getUserString2()
	{
		return userString2;
	}
}
