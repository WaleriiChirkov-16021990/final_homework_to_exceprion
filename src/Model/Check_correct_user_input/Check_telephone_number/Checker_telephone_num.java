package Model.Check_correct_user_input.Check_telephone_number;

import Model.Check_correct_user_input.Check_telephone_number.Exception_of_error_enter_telephone_number.Error_telephone_number_input;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

public class Checker_telephone_num {
	public void run_check(String[] user) throws Error_telephone_number_input,NullPointerException,NoSuchElementException {
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[4] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует телефонный номер");
		}
		if (!Check_telephone_number_input.is_phone_number(user[4])) {
			throw new Error_telephone_number_input(Printer.error_telephone + "\n" + Printer.error_telephone_info);
		}
	}
}
