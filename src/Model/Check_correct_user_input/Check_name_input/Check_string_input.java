package Model.Check_correct_user_input.Check_name_input;

public class Check_string_input {
	public static boolean is_string_not_numbers(String s) {
		return s.matches("^[А-ЯA-Z]{1}[а-яa-z]{1,40}$");
	}
}
