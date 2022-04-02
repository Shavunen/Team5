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
		String[] topics = {"BlackBoard", "SelfService", "MyHousing", "MyParking", "Email"};
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to view notifications for?");
		String options = "";
		for(int i = 0; i < topics.length; i++) options += topics[i] + ", ";

		options += "All";
		System.out.println(options);

		String[] notifications = {"You are failing 3 classes.", "Your class registration is tomorrow at 7AM.  You do not meet the prerequisites for one class", "Housing selection is next weekend.", "You've received a ticket for parking in a lot you're not allowed to park in",
		"Submission Received!  You have a meeting to attend via Zoom today."};
		String answer = in.nextLine();

		String notif;
		switch(answer.toLowerCase()) {
			case "blackboard":
				notif = topics[0] + ": " + notifications[0];
				System.out.println(notif);
				break;
			case "selfservice":
				notif = topics[1] + ": " + notifications[1];
				System.out.println(notif);
				break;
			case "myhousing":
				notif = topics[2] + ": " + notifications[2];
				System.out.println(notif);
				break;
			case "myparking":
				notif = topics[3] + ": " + notifications[3];
				System.out.println(notif);
				break;
			case "email":
				notif = topics[4] + ": " + notifications[4];
				System.out.println(notif);
				break;
			case "all":
				for (int i = 0; i < topics.length; i++)
				{
					notif = topics[i] + ": " + notifications[i];
					System.out.println(notif);
				}
				break;
			default:
				System.out.println("Invalid response.  Try again");
				notification();

		}

	}
	
	public static void newsFeed() {

		
	}
}
