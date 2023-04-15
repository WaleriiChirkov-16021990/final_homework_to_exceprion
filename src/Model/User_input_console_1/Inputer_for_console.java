package Model.User_input_console_1;

import java.util.Scanner;

public class Inputer_for_console {
	
	public String u_input() {
		try(Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}
}
