package methods;

public class StaticMethodFromSameClass {

	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		method1();
		StaticMethodFromDiffClass.method3();
		method2();
		StaticMethodFromDiffClass.method4();

System.out.println("Main Method Ends");
	}
	public static void method1()
	{
		System.out.println("Running static method1 from Same Class");
	}
public static void method2()
{
	System.out.println("Running Static method2 from Same class");
}

}
