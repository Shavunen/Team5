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
		Scanner input2 = new Scanner(System.in);
		boolean quit = true;
		while(quit)
		{
			System.out.println("What would you like to search? type quit to exit");
			String search = input2.nextLine().toLowerCase().trim();
		if(search.equals("room") || search.equals("reserve") || search.equals("study") || search.equals("study room") || search.equals("library room")) {
			System.out.println("You can reserve the study room by going to the website: https://quevents.quinnipiac.edu/emswebapp/");	
			System.out.println("TIP: Don't be afraid of kicking someone out, if you have the room reserved");
		}
		else if(search.equals("self") || search.equals("service") || search.equals("financial aid") || search.equals("registering classes") || search.equals("registration")) {
			System.out.println("You can access the Self Serivce website by going to: https://selfservice.quinnipiac.edu/Student/");	
			System.out.println("TIP: it is not reliable for course registration");
		}
		else if(search.equals("test") || search.equals("lockdown") || search.equals("browser") || search.equals("lockdown browser") || search.equals("lock")) {
			System.out.println("You can download lockdown browser by going to: https://myq.quinnipiac.edu/IT%20%20Libraries/Information%20Technology/Academic%20Technology/Pages/AT_Site_Redesign/RespondusLDB.html");
			System.out.println("TIP: We all know that you are going to find a way to cheat, SO CHEAT!!");
		}
		else if(search.equals("board") || search.equals("blackboard") || search.equals("courses") || search.equals("grades") || search.equals("lock")) {
			System.out.println("You can access black board by going to the website: https://quinnipiac.blackboard.com/");
			System.out.println("TIP: They say that the new version is better.");
		}
		else if(search.equals("reset") || search.equals("password") || search.equals("reset password") || search.equals("can't log in") || search.equals("log in problems")) {
			System.out.println("You can reset your password at: https://passwordreset.microsoftonline.com/?whr=quinnipiac.edu");
			System.out.println("TIP: it doesn't alsways work");
		}
		else if(search.equals("printing") || search.equals("printer") || search.equals("print") || search.equals("color printer") || search.equals("color pritning")) {
			System.out.println("You can download the printer by going to this website: https://myq.quinnipiac.edu/IT%20%20Libraries/Information%20Technology/Academic%20Technology/Pages/AT_Site_Redesign/Printing.html");
			System.out.println("TIP: you need QCash to print");
		}
		else if(search.equals("add QCash") || search.equals("QCash") || search.equals("Cash") || search.equals("Money") || search.equals("add money")) {
			System.out.println("you can add add QCash by going to the website: https://www.qu.edu/one-stop-student-administrative-services/qcard/");
			System.out.println("TIP: nothing is free on this campus");
		}
		else if(search.equals("shuttle") || search.equals("bus") || search.equals("transport") || search.equals("shuttle service") || search.equals("transportation")) {
			System.out.println("you can find the shuttle service by going to the website: https://myq.quinnipiac.edu/Student%20Life/Student%20Shuttle%20Schedules/Pages/default.aspx?sdupgwelredir=1&bucketwebredir=1");
			System.out.println("TIP: shuttles are awesome");
		}
		else if(search.equals("notification")) {
			quit = false;
			notification();
		}
		else if(search.equals("news")) {
			quit = false;
			newsFeed();
		}
		else if(search.equals("quit")) {
			System.out.println("Have a good day!");
			quit = false;
		}
		else {
			System.out.println("Error! try again");
		}
		}
	}
	
	public static void notification() {
	}
	
	public static void newsFeed() {

		
	}
}
