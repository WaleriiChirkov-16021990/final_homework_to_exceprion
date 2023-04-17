package Model.Check_correct_user_input.Check_date;

import Model.Check_correct_user_input.Check_date.Check_format_date.Check_date_input;
import Model.Check_correct_user_input.Check_date.Check_format_date.Exception_of_error_enter_date.Error_date_format;
import Model.Check_correct_user_input.Check_date.Check_value_date.Check_value_day;
import Model.Check_correct_user_input.Check_date.Check_value_date.Check_value_month;
import Model.Check_correct_user_input.Check_date.Check_value_date.Check_value_years;
import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

public class Checker_date {
	public void run_check(String[] user) throws  NullPointerException, NoSuchElementException, Error_date_value, Error_date_format {
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[3] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + "Отсутствует дата");
		}
		if (!Check_date_input.is_date(user[3])) {
			throw new Error_date_format(Printer.error_date + "\n" + Printer.error_date_info);
		}
		new Check_value_years().is_true_year(user[3].split("\\."));
		new Check_value_month().check_value_days(user[3].split("\\."));
		new Check_value_day().check_value_days(user[3].split("\\."));
	}
}
