package Model;

import Model.User_input_console_1.Inputer_for_console;
import View.Console_terminal.Printer;

import java.util.Scanner;

/**
 * Класс дает возможность прекратить работу приложжения в штатном режиме,
 * если что то пошло не так, и по собственному желанию.
 */
public class Exit_application {
	private static int counter_input = 5;
	
	/**
	 * Данный метод принимает внешний инициализированный сканер, далее обрабатывает ввод юзера в консоль,
	 * информируя его о последствиях данного ввода,
	 * и на основе этого пропускает его на дальнейший ввод данных или завершает работу приложения.
	 * @param scanner - инициализированный сканер
	 * @return истина или ложь
	 */
	public boolean select_user(Scanner scanner) throws RuntimeException {
		if (scanner == null) {
			throw new RuntimeException(Printer.not_scanner);
		}
		String string=null;
		while (counter_input > 0) {
			Printer.to_print(Printer.exit);
			string = new Inputer_for_console(scanner).u_input();
			if (string.equals(Printer.to_exit) || string.equals(Printer.to_enter_user)) {
				break;
			} else {
				Printer.to_print(Printer.to_enter_user_error);
			}
			counter_input--;
			Printer.to_print(Printer.to_exit_count + counter_input);
			if (counter_input == 0) {
				Printer.to_print(Printer.getTo_exit_);
				return false;
			}
			Printer.to_print(Printer.repeate_to_enter);
		}
		if (string.replace(" ", "").equals(Printer.to_exit)) {
			return false;
		}
		return true;
	}
}
