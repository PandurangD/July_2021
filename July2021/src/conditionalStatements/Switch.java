package conditionalStatements;
//ATM - balance check, cash withdrawal, pin change, mini statement, fund transfer, cancel
public class Switch {

	public static void main(String[] args) {
		String option = "FT";
		switch (option)
		{
		case "BC":
			System.out.println("Balance Check");
			break;
		case "CW":
			System.out.println("Cash Withdrawal");
			break;
		case "PC":
			System.out.println("Pin Change");
			break;
		case "MS":
		System.out.println("Mini Statement");
		break;
		case "FT":
		System.out.println("Fund Transfer");
		break;
		default:
			System.out.println("Cancel/Invalid");
			break;
		}

	}

}
