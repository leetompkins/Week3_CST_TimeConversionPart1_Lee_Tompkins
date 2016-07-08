/* A program that prompts the user to enter in an hour in the 24 hour format
 * and display it as the 12 hour format
 * Week3 Time Conversion Part 1 
 * Author Lee Tompkins 
 * File TimeConversionP1.java
 * Date Jul 8 2016
 */

import java.util.Scanner;
public class TimeConversionP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in an hour in the 24hr time format to convert it to the 12hr time format, Example 0735 = 7:35am");
		String time24 = input.nextLine(); // store userInput as variable
		if (time24.length() < 4) {	// if time is input as 745 instead of 0745, add 0 to position 0
			System.out.print("Enter 0 for times before 1000"); // prompt user to correct input
			time24 = input.nextLine(); // store corrected user input 
		}
		FormatTime.formatTime(time24); // invoke formatTime method
	}

}

class FormatTime {
	public static void formatTime(String time) {
		// create char variables by indexing
		char e = time.charAt(0);
		char f = time.charAt(1);
		char g = time.charAt(2);
		char h = time.charAt(3);
		// convert char to int variables
		int a = Character.getNumericValue(e);
		int b = Character.getNumericValue(f);
		int c = Character.getNumericValue(g);
		int d = Character.getNumericValue(h);
		// switch for values of a
		switch(a) {
			case 2: {
				if (b >= 2) {	// choose correct time based on b value
					System.out.print("The time is " + (a - 1) + (b - 2) + ":" + c + d + "pm");
					break;
				} else if (b == 1) {
					b = 9;
					System.out.print("The time is " + (a - 1) + b + ":" + c + d + "pm");
					break;
				} else if (b == 0) {
					b = 8;
					System.out.print("The time is " + (a - 1) + b + ":" + c + d + "pm");
					break;
				} 
			} 
			case 1: {
				if (b > 2) {	// choose correct time based on b value
					System.out.println("The time is " + b + ":" + c + d + "pm");
					break;
				} else if (b == 2){
					System.out.println("The time is " + a + b + ":" + c + d + "pm");
					break;
				} else if (b == 1) {
					b = 9; 
					System.out.println("The time is " + a + b + ":" + c + d + "am");
					break;
				} else if (b == 1) {
					b = 8;
					System.out.println("The time is " + a + b + ":" + c + d + "am");
					break;
				}
			}
			case 0: { // display time, must be am if a = 0 
				System.out.println("The time is " + b + ":" + c + d + "am");
				
			}
		}
	}
}
