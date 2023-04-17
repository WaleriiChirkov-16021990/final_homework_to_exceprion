package Model.Check_correct_user_input.Check_gender;

import View.Console_terminal.Printer;

/**
 * Класс для проверки правильности ввода пола пользователя
 */
public class Check_gender_input {
	/**
	 * Метод проверяет правильность ввода пользователем пола .
	 * @param s строчное представление пола
	 * @return истина или ложь
	 */
	public static boolean is_gender(String s) throws RuntimeException{
		if (s == null) throw new RuntimeException(Printer.not_gender_data);
		if (s.replace(" ", "").equals("f") || s.replace(" ","").equals("m"))  return true;
		return false;
	}
}
