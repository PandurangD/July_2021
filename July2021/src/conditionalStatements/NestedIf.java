// Voter right (18+), Marriage ( Male= 21+, Female= 18+)
package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
		int age=15;
		String gender="Male";
		if(age>=18)
		{System.out.println("Person is legal voter");
		   if(gender=="Female")
		   {
			   System.out.println("His marriage is illegal");
		   }
		   
		   else
		   {
			   System.out.println("Her marriage is legal");
		   }
		}
		else
		{
			System.out.println("Person is kid/child");
			System.out.println("Not permitted for marriage");
		}
	}

}
