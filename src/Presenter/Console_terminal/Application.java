package Presenter.Console_terminal;

import Model.User_input_console_1.Inputer_for_console;
import View.Console_terminal.Printer;

import java.util.Scanner;

public class Application {
	private String[] user;
	private String string;
	
	
	
	
	public void run() {
		try (Scanner scanner = new Scanner(System.in)) {
			Printer.to_print("Следуйте указаниям\n");
			while (true) {
				Printer.to_print(Printer.exit);
				string = new Inputer_for_console(scanner).u_input();
				if (string.replace(" ", "").equals("2")) break;
				Printer.to_print(Printer.first_menu);
				string = new Inputer_for_console(scanner).u_input();
				user = string.split(" ");
				System.out.println(user.length);
				if (user.length < 6) {
					throw new IllegalArgumentException("Вы указали меньше параметров, чем было необходимо");
				} else if (user.length > 6) {
					throw new IllegalArgumentException("Вы указали лишние параметры");
				}
				
			}
		} catch (IllegalArgumentException e) {
			Printer.to_print("Количество параметров не соответствует требованию (6)");
			System.out.println(e.getStackTrace());
		}
	}
	
}
