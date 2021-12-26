//To check the year as a leap year or not

package conditionalStatements;

public class Leap_Year {
	public static void main(String[] args) {
		int year=2025;
		
		if(year % 400 ==0)
		{
			System.out.println("Leap Year");
		}
		else if(year % 4 ==0)
		{
			System.out.println("Leap Year"); 
		}
		else
		{
			System.out.println("No Leap Year");
		}
	}
}
