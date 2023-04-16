package Model.Check_correct_user_input.Check_name_input;

import Model.Check_correct_user_input.Check_name_input.Exception_of_error_enter_name.Error_name_format;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

public class Checker_full_name {
	public void run_check(String[] user) throws Error_name_format,NullPointerException,NoSuchElementException{
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[0] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует фамилия");
		}
		if (user[1] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует имя");
		}
		if (user[2] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует отчество");
		}
		if (!Check_string_input.is_string_not_numbers(user[0])) {
			throw new Error_name_format(Printer.error_name_lastname + "\n" + Printer.error_name_info);
		} else if (!Check_string_input.is_string_not_numbers(user[1])) {
			throw new Error_name_format(Printer.error_name + "\n" + Printer.error_name_info);
		} else if (!Check_string_input.is_string_not_numbers(user[2])) {
			throw new Error_name_format(Printer.error_name_patronymic + "\n" + Printer.error_name_info);
		}
	}
}
