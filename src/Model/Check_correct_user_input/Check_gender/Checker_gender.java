package Model.Check_correct_user_input.Check_gender;

import Model.Check_correct_user_input.Check_gender.Exception_of_error_enter_gender.Error_gender_input;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

public class Checker_gender {
	public void run_check(String[] user) throws Error_gender_input,NullPointerException,NoSuchElementException{
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[5] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует пол");
		}
		if (!Check_gender_input.is_gender(user[5])) {
			throw new Error_gender_input(Printer.error_gender + "\n" + Printer.error_gender_info);
		}
	}
}
