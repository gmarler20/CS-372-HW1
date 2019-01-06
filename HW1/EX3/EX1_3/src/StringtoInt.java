package src;

import java.util.Scanner;

public class StringtoInt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String var1;
		System.out.println("Enter a number");
		var1 = scnr.nextLine();
		int convert = 0;						// Will be used to help convert the string to an int. 
		
		boolean check = true;					// Assistance from Iain Black on this portion. I could not figure out how to get the loop to exit if the user entered a number followed by text, and this fixed it. 
		
		for(int i = 0; i < var1.length(); i++) {
			//PT -- if (var1.charAt(i) >= '0' && var1.charAt(i) <= '9')
			if (var1.charAt(i) >= 48 && var1.charAt(i) <= 57)		// If the character is equal to equivalent to 0-9 in ascii
			{
				convert = convert + var1.charAt(i) - 48;			// Add the character at the specific position from var1 to convert, but subtract 48 so it is converted from ASCII
			}
			else {
				check = false;										// If the character was not equal to 0-9 in ascii, it is not a number.
			}
			if(i < var1.length() - 1) {								// Multiply convert by 10 until the last part of the loop as we do not want an extra 0 on the conversion
				convert = convert * 10;								// Note: Levi Russell helped me out with the logic of figuring out that I needed to multiply by 10 in order to get the numbers to shift over for the conversion. 
			}
			
		}
		if(check == false) {							
			System.out.println("User did not enter a number");
		}
		
		System.out.println("The string has been converted to an int: " + convert);
		}
	
	
}


