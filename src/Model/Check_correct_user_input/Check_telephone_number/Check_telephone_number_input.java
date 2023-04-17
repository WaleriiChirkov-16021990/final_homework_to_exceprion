package Model.Check_correct_user_input.Check_telephone_number;

/**
 * Класс проверяет строчную переменную на предмет содержания в ней только цифр
 */
public class Check_telephone_number_input {
	/**
	 * Данный метод проверяет, состоит ли данная строка из 11 цифр, и нет ли в ней посторонних символов используя
	 * регулярное выражение
	 * @param s - проверяемая строка
	 * @return истина или ложь
	 */
	public static boolean is_phone_number(String s) {
		return s.replace(" ","").matches("^\\d{11}$");
	}
}
