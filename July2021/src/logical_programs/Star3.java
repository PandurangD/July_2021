// *
// **
// ***
// ****
// *****
// ******
// row=6, max star=6

package logical_programs;

public class Star3 {

	public static void main(String[] args) {
		for (int row=1;row<=6;row++)
		{
			for(int star=1;star<=row;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
