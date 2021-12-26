//Static Method From Same Class

package methods;

public class StaticMethodFromSameClass1 {

	public static void main(String[] args) {
	 System.out.println("Main Method Starts");
	 
	 methoda();
	 Staticmethodfromanotherclass.methodb();
	 
	 
	 
	 System.out.println("Main Method Ends");

	}
	
	public static void methoda()
	{
	System.out.println("Print static method from same class");
	}
	
	

}
