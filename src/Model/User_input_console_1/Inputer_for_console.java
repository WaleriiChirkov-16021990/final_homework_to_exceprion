package Model.User_input_console_1;

import java.util.Scanner;

public class Inputer_for_console {
	private Scanner scanner;
	
	public Inputer_for_console(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public String u_input() {
		return scanner.nextLine();
	}
}
