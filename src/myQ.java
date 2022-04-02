import java.util.Scanner;

public class myQ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would like to see, Press 1 for: Search bar, 2 for: Notifications, and 3 for: updates about news feed");
		boolean success = true;
		while(success)
		{
			String answer = input.nextLine();
			int question = 0;
			try {
				question = Integer.parseInt(answer);
			}
			catch (Exception e) {}
			if(question == 1) {
				searchBar();
				success = false;
			}
			else if(question == 2) {
				notification();
				success = false;
			}
			else if(question == 3) {
				newsFeed();
				success = false;
			}
			else {
				System.out.println("Invalid try again!");
			}
		}
	}

	public static void searchBar() {

	}
	
	public static void notification() {
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to view notifications for?");

		String answer = in.nextLine();

		switch(answer.toLowerCase()) {
			case "blackboard":
				//TODO: Implement
				break;
			case "selfservice":
				//TODO: Implement
				break;
			case "myhousing":
				//TODO: Implement
				break;
			case "myparking":
				//TODO: Implement
				break;
			case "email":
				//TODO: Implement
				break;
			default:
				System.out.println("Invalid response.  Try again");
				notification();

		}

	}
	
	public static void newsFeed() {

		
	}
}
