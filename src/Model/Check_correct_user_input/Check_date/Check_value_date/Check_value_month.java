package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Console_terminal.Printer;

import java.time.Year;
import java.time.YearMonth;
import java.util.NoSuchElementException;

/**
 * Данный класс проверяет на относительное соответствие действительности значения месяца в
 * строковой переменной даты
 */
public class Check_value_month {
	
	/**
	 *
	 * @param date - массив значений даты arr[0] - день, arr[1] - месяц, arr[2] -  год.
	 * @throws NullPointerException - исключение в результате пустого массива параметров юзера
	 * @throws NoSuchElementException - исключение возбужденное в результате пустого значения, в котором ожидалась дата.
	 * @throws Error_date_value - исключение возбужденное в результате неудачной проверки на относительную актуальность
	 * 	 * 	 * значений "переменной даты", в данном случае месяца.
	 */
	public void check_value_days(String[] date) throws NullPointerException,NoSuchElementException,Error_date_value {
		if (date == null) {
			throw new NullPointerException(Printer.not_date);
		}
		if (date[1] == null) {
			throw new NoSuchElementException(Printer.month_is_null);
		}
		if (Integer.parseInt(date[1] ) < 1 || Integer.parseInt(date[1]) > 12) {
			throw new Error_date_value(Printer.month_is_false);
		}
		int current_month = YearMonth.now().getMonthValue();
		int current_year = Year.now().getValue();
		if (Integer.parseInt(date[2]) == current_year) {
			if (Integer.parseInt(date[1]) > current_month) {
				throw new Error_date_value(Printer.month_is_false_info);
			}
		}
		
	}
}
