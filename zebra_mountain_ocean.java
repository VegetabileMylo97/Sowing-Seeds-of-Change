import java.util.*;

public class EcoEducation {

	public static void main(String[] args) {
		
		// create a variable to hold the user's selected activity
		int activity;
		
		// introduce the program
		System.out.println("Welcome to the Eco-Education program!");
		
		// create a scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		// create a loop to keep the program running
		while (true) {
			// prompt the user to select an activity
			System.out.println("Please select an activity:");
			System.out.println("1) Nature walk");
			System.out.println("2) Gardening");
			System.out.println("3) Composting");
			System.out.println("4) Recycling");
			System.out.println("5) Energy conservation");
			System.out.println("6) Quit program");
			
			// get the user's input
			activity = scanner.nextInt();
			
			// check the user's input to determine which activity to run
			if (activity == 1) {
				runNatureWalk();
			} else if (activity == 2) {
				runGardening();
			} else if (activity == 3) {
				runComposting();
			} else if (activity == 4) {
				runRecycling();
			} else if (activity == 5) {
				runEnergyConservation();
			} else if (activity == 6) {
				// terminate the loop to exit the program
				break;
			} else {
				// inform the user of an invalid option if they enter an integer that isn't 1-6
				System.out.println("Invalid option. Please select an option between 1 and 6.");
			}
		}
		
		// inform the user that the program has ended
		System.out.println("You have quit the Eco-Education program. Goodbye!");
		
		// close the scanner
		scanner.close();
	}
	
	// method to execute the Nature Walk activity
	public static void runNatureWalk() {
		System.out.println("You have selected the Nature Walk activity!");
		System.out.println("Let's go for a walk and observe the surrounding nature!");
	}
	
	// method to execute the Gardening activity
	public static void runGardening() {
		System.out.println("You have selected the Gardening activity!");
		System.out.println("Let's learn about organic gardening and how it contributes to sustainability!");
	}
	
	// method to execute the Composting activity
	public static void runComposting() {
		System.out.println("You have selected the Composting activity!");
		System.out.println("Let's learn about composting and how it can help the environment!");
	}
	
	// method to execute the Recycling activity
	public static void runRecycling() {
		System.out.println("You have selected the Recycling activity!");
		System.out.println("Let's learn about recycling and how it can reduce pollution!");
	}
	
	// method to execute the Energy Conservation activity
	public static void runEnergyConservation() {
		System.out.println("You have selected the Energy Conservation activity!");
		System.out.println("Let's learn about conserving energy and how it can reduce our carbon footprint!");
	}

}