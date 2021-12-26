//Exam Result

package conditionalStatements;

public class Else_If1 {

	public static void main(String[] args) {
		int marks=45;
		int criteria=40;
		
		if(marks>100)
		{
			System.out.println(" Invalid Entry");
		}
		else if(marks>=75)
		{
			System.out.println(" Distinction");
		}
		else if(marks>=60)
		{
			System.out.println(" First Class");
		}
		else if(marks>=40)
		{
			System.out.println(" Pass Class");
		}
		else
		{
			System.out.println(" Fail");
		}
	}
	

}
