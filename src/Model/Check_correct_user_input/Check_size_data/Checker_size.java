package Model.Check_correct_user_input.Check_size_data;

import Model.Check_correct_user_input.Check_size_data.Exception_of_error_size_array.Error_size_array;
import View.Console_terminal.Printer;

/**
 * Класс проверяющий длину массива входных данных о пользователе
 */
public class Checker_size {
	/**
	 * Метод проверки объёма входных данных пользователя
	 * @param user - массив данных пользователя
	 * @throws Error_size_array - исключение при не корректном обёме данных о пользователе (в данной задаче ожидается 6 параметров)
	 * @throws NullPointerException - исключение при получение постого массива
	 */
	public void run_check(String[] user) throws Error_size_array,NullPointerException {
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (new Check_size_array().check_size(user) == -2) {
			throw new Error_size_array("Error code : -2 \n" + Printer.error_size_litle + "\n" + Printer.error_size_info);
		} else if (new Check_size_array().check_size(user) == -1) {
			throw new Error_size_array("Error code : -1 \n" + Printer.error_size_big + "\n" + Printer.error_size_info);
		}
	}
}
