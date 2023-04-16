package Model.Check_correct_user_input.Check_date;

import Model.Check_correct_user_input.Check_date.Check_format_date.Check_date_input;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

public class Checker_date {
	public void run_check(String[] user) throws  NullPointerException, NoSuchElementException {
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[3] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует дата");
		}
		if (!Check_date_input.is_date(user[3])) {
//			throw new Error_date_format(Printer.error_date + "\n" + Printer.error_date_info);
		}
	}
}
