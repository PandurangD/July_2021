//Greater Number

package conditionalStatements;

public class Greater_Number {

	public static void main(String[] args) {
		int a=100;
		int b=100;
		int c=100;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is a greater number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ " is a graeater number");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+ " is a greater number");
		}
		else
		{
			System.out.println("All numbers are equal");
		}
	}
	
	

}
