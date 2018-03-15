import java.util.*;

public class Program {
	public static void main(String args[]) {
		
		Random random = new Random(); 	//random number generator
		Scanner reader = new Scanner(System.in); 
		System.out.println("Let's play rock, paper, scissors! Please enter your input.");
		String input = reader.next().toLowerCase(); 
	
		//check for correct input
		while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
			System.out.println("Please enter a valid input between rock, paper, and scissors.");
			input = reader.next().toLowerCase();
		}
	
		int computerValue = random.nextInt(3); //set 0 = rock, 1 = paper, 2 = scissors
		
		//print winner based on input and computer generation
		if (input.equals("rock")){
			if (computerValue == 0) {
				System.out.println("You played rock. The computer played rock. You tied!");
			} else if (computerValue == 1) {
				System.out.println("You played rock. The computer played paper. The computer won!");
			} else {
				System.out.println("You played rock. The computer played scissors. You won!");
			}
		} else if (input.equals("paper")) {
			if (computerValue == 0) {
				System.out.println("You played paper. The computer played rock. You won!");
			} else if (computerValue == 1) {
				System.out.println("You played paper. The computer played paper. You tied!");
			} else {
				System.out.println("You played paper. The computer played scissors. The computer won!");
			}
		} else {
			if (computerValue == 0) {
				System.out.println("You played scissors. The computer played rock. The computer won!");
			} else if (computerValue == 1) {
				System.out.println("You played scissors. The computer played paper. You won!");
			} else {
				System.out.println("You played scissors. The computer played scissors. You tied!");
			}
		} 
		reader.close();
	}

}
