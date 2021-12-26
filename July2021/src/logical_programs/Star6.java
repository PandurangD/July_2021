//     *
//    * *
//   * * *
//  * * * *
// * * * * * 
//* * * * * * 

// row=1-6;space=5-0;star=1-6

package logical_programs;

public class Star6 {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++)
		{
			for(int space=5;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
