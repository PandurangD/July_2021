// To check that number is prime or not

package conditionalStatements;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=3;
		
		if(num==0 || num==1)
		{
			System.out.println( num+ " is not a prime number");
		}
		else if(num==2)
		{
			System.out.println(num+ " is a prime number");
		}
		else if(num % 1==3 && num%3==0)
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
	}

}
