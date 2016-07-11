/* A program that prompts the user to enter in an hour in the 24 hour format
 * and display it as the 12 hour format
 * Week3 Time Conversion Part 1 
 * Author Lee Tompkins 
 * File TimeConversionP1.java
 * Date Jul 10 2016
 */

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeConversionP1 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in an hr in 24 time format to convert it to 12hr format");
		String time24 = input.next(); // store user input 
		int x = Integer.parseInt(time24);
		    final SimpleDateFormat sdf = new SimpleDateFormat("H"); // create new SimpleDateFormat of H
		    final Date dateObj = sdf.parse(time24); // parse user input into constructed SimpleDateFormat
		    if (x >= 12) {
		    	System.out.println(new SimpleDateFormat("K").format(dateObj) + "pm"); // Display 12hr time 
		    } else {
		    	System.out.println(new SimpleDateFormat("K").format(dateObj) + "am");
		    }
		 } 
}