package Model.Check_correct_user_input;

public class Check_string_input {
	public static boolean is_string_not_numbers(String s) {
		return s.matches("^[А-Я]{1}[а-я]{1,40}$");
	}
}
