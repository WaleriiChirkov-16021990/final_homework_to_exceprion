package Model.Check_correct_user_input.Check_name_input;

/**
 * Класс проверки одного слова на конкретные значения(символы в нём)
 */
public class Check_string_input {
	/**
	 * Метод проверки имени на постороние символы , пробели и заглавие первой буквы
	 * @param s строка (1 слово)
	 * @return истина или ложь
	 */
	public static boolean is_string_not_numbers(String s) {
		return s.matches("^[А-ЯA-Z]{1}[а-яa-z]{1,40}$");
	}
}
