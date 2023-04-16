package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;

import java.time.Year;
import java.time.YearMonth;
import java.util.NoSuchElementException;

public class Check_value_month {
	public void check_value_days(String[] date) throws NullPointerException,NoSuchElementException,Error_date_value {
		if (date == null) {
			throw new NullPointerException("Дата отсутствует");
		}
		if (date[1] == null) {
			throw new NoSuchElementException("Поле месяц не имеет ни каких значений");
		}
		if (Integer.parseInt(date[1] ) < 1 || Integer.parseInt(date[1]) > 12) {
			throw new Error_date_value("Не известный месяц по Григорианскому календдарю");
		}
		int current_month = YearMonth.now().getMonthValue();
		int current_year = Year.now().getValue();
		if (Integer.parseInt(date[2]) == current_year) {
			if (Integer.parseInt(date[1]) > current_month) {
				throw new Error_date_value("Вы указали дату из будущего, человек еще не родился.");
			}
		}
		
	}
}
