//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
// row=1-5;space=4-0;star=1-5
// row=1-4,space=1-4,star=4-1
package logical_programs;

public class Star5 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++)
		{
			for(int space=4;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int row=1;row<=4;row++)
		{
			for(int space=1;space<=row;space++)
			{
				System.out.print(" ");
			}
			for(int star=4;star>=row;star--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

}
