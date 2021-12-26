// I want to buy a smart phone in my budget
// Budget: 60000, 35000, 10000, 5000, 1000
package conditionalStatements;

public class Else_If {

	public static void main(String[] args) {
		int budget=50001;
		
		if(budget>50000)
		{
			System.out.println(" I can buy Iphone");
		}
		else if(budget>30000)
		{
			System.out.println(" I Can buy Oneplus");
		}
		else if(budget>7000)
		{
			System.out.println(" I can buy average smartphones");
		}
		else if(budget>5000)
		{
			System.out.println(" I can buy feature phone");
		}
		else
		{
			System.out.println(" No mobile phone is available in this range");
		}
	}

}
