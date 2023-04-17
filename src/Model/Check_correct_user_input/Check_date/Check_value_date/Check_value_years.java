package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;

import java.time.Year;
import java.util.NoSuchElementException;

public class Check_value_years {
	public void is_true_year(String[] date) throws Error_date_value,NullPointerException,NoSuchElementException {
		if (date == null) {
			throw new NullPointerException("Дата отсутствует");
		}
		if (date[2] == null) {
			throw new NoSuchElementException("Поле год не имеет ни каких значений");
		}
		int current_year = Year.now().getValue();
		if (Integer.parseInt(date[2]) < current_year-140 || Integer.parseInt(date[2]) > current_year){
			throw new Error_date_value("Указан не корректный год \nГод рождения не может быть ранее 140 давности, и не может быть позднее текущего года");
		}
	}
}
