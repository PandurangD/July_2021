// HDFC bank login

package conditionalStatements;

public class NestedIf1 {

	public static void main(String[] args) {
		String username="panduang";
		String password="Dagad@123";
		
		if(username=="pandurang")
		{
			System.out.println("Username is Correct");
			if(password=="Dagade@123")
			{
				System.out.println("Password is correct");
				System.out.println("Login Succesful");
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("Username is Incorrect");
		}
		

	}

}
