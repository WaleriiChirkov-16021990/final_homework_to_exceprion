package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Console_terminal.Printer;

import java.time.Year;
import java.util.NoSuchElementException;

/**
 * Класс для проверки актуальности указанного года в полученной дате - строковой переменной "dd.mm.yyyy" .
 * Допускается дата рождения до 140 лет ранее текущего года.
 */
public class Check_value_years {
	private static final int max_age = 140;
	/**
	 *
	 * @param date - массив значений даты arr[0] - день, arr[1] - месяц, arr[2] -  год.
	 * @throws Error_date_value - исключение в результате пустого массива параметров юзера
	 * @throws NullPointerException - исключение возбужденное в результате пустого значения, в котором ожидалась дата.
	 * @throws NoSuchElementException - исключение возбужденное в результате неудачной проверки на относительную актуальность
	 * 	 * 	 * значений "переменной даты", в данном случае года.
	 */
	public void is_true_year(String[] date) throws Error_date_value,NullPointerException,NoSuchElementException {
		if (date == null) {
			throw new NullPointerException(Printer.not_date);
		}
		if (date[2] == null) {
			throw new NoSuchElementException(Printer.year_is_null);
		}
		int current_year = Year.now().getValue();
		if (Integer.parseInt(date[2]) < current_year-max_age || Integer.parseInt(date[2]) > current_year){
			throw new Error_date_value(Printer.error_age);
		}
	}
}
