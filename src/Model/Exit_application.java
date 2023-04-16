package Model;

import Model.User_input_console_1.Inputer_for_console;
import View.Console_terminal.Printer;

import java.util.Scanner;

public class Exit_application {
	public boolean select_user(Scanner scanner) {
		Printer.to_print(Printer.exit);
		String string = new Inputer_for_console(scanner).u_input();
		if (string.replace(" ", "").equals("2")) {
			return false;
		}
		return true;
	}
}
