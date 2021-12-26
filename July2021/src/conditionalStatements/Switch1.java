package conditionalStatements;
// I want to know day today
//1-Sunday, 2-Monday, 3-Tuesday, 4-Wednesday, 5-Thursday, 6-Friday, 
public class Switch1 {

	public static void main(String[] args) {
		int number=5;
		switch (number)
		{
		case 1:
			System.out.println("Today is Sunday");
			break;
			
		case 2:
			System.out.println("Today is Monday");
			break;
			
		case 3:
			System.out.println("Today is Tuesday");
			break;
			
		case 4:
			System.out.println("Today is Wednesday");
			break;
			
		case 5:
		System.out.println("Today is Thursday");
		break;
		
		case 6:
		System.out.println("Today is Friday");
		break;
		
		default:
			System.out.println("Today is Saturday");
			break;
			
		}
	}

}
