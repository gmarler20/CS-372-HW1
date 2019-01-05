import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.*;
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = 1;
		month = 1;
		year = 0000;
	}
	
	public Date(int d, int m, int y) {
		try {
		
		
		if (m == 2 && d > 28 || d < 1 || m < 1) {				// If the user enters a day greater than 28 for February, throw an exception.
			throw new Exception ("Invalid Date.");
		}
		if (m == 1 && d > 31 || m == 3 && d > 31 || m == 5 && d > 31 || m == 7 && d > 31 || m == 8 && d > 31 || // If  the user enters a day greater than 31 for the following months, throw an exception.
				m == 10 && d > 31 || m == 12 && d > 31 ||  d < 1 || m < 1) {
			throw new Exception ("Invalid Date.");
		}
		if (m == 4 && d > 30 || m == 6 && d > 30 || m == 9 && d > 30 || m == 11 && d > 30 || d < 1 || m < 1 ) {	// If the user enters a day greater than 30 for the following months, throw an exception.
			throw new Exception ("Invalid Date.");
		}
		else {								// If all passes, create the constructor. 
			day = d;
			month = m;
			year = y;
		}
		
	}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
		}
}
	
	void setDay (int d) {
		day = d;
	}
	
	int getDay() {
		return day;
	}
	
	void setMonth(int m) {
		month = m;
	}
	
	int getMonth() {
		return month;
	}
	
	void setYear(int y) {
		year = y;
	}
	
	int getYear() {
		return year;
	}
	
	/*
	 This function calculates the difference in days between two date objects.
	 The function first starts off by calculating the objects year - 1 * 365 and stores
	 those in num1 and num2. Then, to simulate the days that have passed in the current year of the object,
	 the DaysElapsed function is called to calculate the number of days that have passed in the object's current year.
	 Following this, num 1 and num 2 are subtracted to give us the difference in dats between the two objects. 
	 */
	static void DateDifference(Date a, Date b) {
		int num1 = (a.getYear() - 1) * 365;
		int num2 = (b.getYear() - 1) * 365;
		num1 = num1 + DaysElapsed(a);
		num2 = num2 + DaysElapsed(b);
		
		
		int difference = num1 - num2;
		
		System.out.println("The difference in days between the date objects is " + difference);
	}

	

	/* This is not the most efficient way to complete this, however it is the best I could come up with.
	   This function calculates the days elapsed in the current calendar year and is called in the static
	   void DateDifference function. It first checks the month of the current object. After this, it will return an 
	   integer with the number of days that have already been passed this year. This number was calculated by me by adding as I went through
	   a calendar. Then, the number of days that have already been passed in the previous months are added to the objects current day. 
	   If you go up to the DateDifference function, it will explain how this number is then used. 
	*/
	
	static int DaysElapsed(Date d) {		
		if(d.getMonth() == 1)
		{
			return 0 + d.getDay();
		}
		if (d.getMonth() == 2) {
			return 31 + d.getDay();
		}
		if (d.getMonth() == 3) {
			return 59 + d.getDay();
		}
		if (d.getMonth() == 4) {
			return 90 + d.getDay();
		}
		if (d.getMonth() == 5) {
			return 120 + d.getDay();
		}
		if (d.getMonth() == 6) {
			return 151 + d.getDay();
		}
		if (d.getMonth() == 7) {
			return 181 + d.getDay();
		}
		if (d.getMonth() == 8) {
			return 212 + d.getDay();
		}
		if (d.getMonth() == 9) {
			return 243 + d.getDay();
		}
		if (d.getMonth() == 10) {
			return 273 + d.getDay();
		}
		if (d.getMonth() == 11) {
			return 304 + d.getDay();
		}
		if (d.getMonth() == 12) {
			return 334 + d.getDay();
		}
	
		else 
		{	return 0;
		
		}
	}
	
	public static Date Today() {
		
		LocalDate today = LocalDate.now();
		Date TodaysDate = new Date(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
		return TodaysDate;
	
	}
	

}