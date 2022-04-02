import java.util.Scanner;

public class myQ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would like to see, Press 1 for: Search bar, 2 for: Notifications, and 3 for: updates about news feed");
		boolean success = true;
		while(success)
		{
			int question = input.nextInt();
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
		
	}
	
	public static void newsFeed() {

		
	}
}
