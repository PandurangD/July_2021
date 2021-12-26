package logical_programs;


public class Star7 {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++)
		{
			for(int space=5;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=6;star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
