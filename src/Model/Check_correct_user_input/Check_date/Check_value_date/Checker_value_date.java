package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_format_date.Check_format_date;
import Model.Check_correct_user_input.Check_date.Check_format_date.Exception_of_error_enter_date.Error_date_format;
import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Console_terminal.Printer;

import java.util.NoSuchElementException;

/**
 * Экземпляр данного класса преследует цель проверить актуальнеость значения, в строковой переменной указанной даты "dd.mm.yyyy".
 */
public class Checker_value_date {
	/**
	 * Данный метод запускает проверку на относительное соответствия действительности указанной даты
	 * в строковой переменной
	 * @param user - передаваемый юзер в массиве его параметров (6 строковых парамтеров).
	 * @throws NullPointerException - исключение в результате пустого массива параметров юзера
	 * @throws NoSuchElementException - исключение возбужденное в результате пустого значения, в котором ожидалась дата.
	 * @throws Error_date_value - исключение возбужденное в результате неудачной проверки на относительную актуальность
	 * значений "переменной даты".
	 * @throws Error_date_format - исключение, возбужденное в результате неудачной проверки формата записи даты в строке.
	 */
	public void run_check(String[] user) throws  NullPointerException, NoSuchElementException, Error_date_value, Error_date_format {
		if (user == null) {
			throw new NullPointerException(Printer.null_enter);
		}
		if (user[3] == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + Printer.not_date);
		}
		if (!Check_format_date.is_date(user[3])) {
			throw new Error_date_format(Printer.error_date + "\n" + Printer.error_date_info);
		}
		new Check_value_years().is_true_year(user[3].split("\\."));
		new Check_value_month().check_value_days(user[3].split("\\."));
		new Check_value_day().check_value_days(user[3].split("\\."));
	}
}
