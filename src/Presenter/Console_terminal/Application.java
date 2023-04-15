package Presenter.Console_terminal;

import Model.User_input_console_1.Inputer_for_console;
import View.Console_terminal.Printer;

public class Application {
	private String string;
	
	
	public void run() {
		Printer.to_print("Следуйте указаниям\n");
		while (true) {
			Printer.to_print(Printer.first_menu);
			string = new Inputer_for_console().u_input();
		}
	}

}
