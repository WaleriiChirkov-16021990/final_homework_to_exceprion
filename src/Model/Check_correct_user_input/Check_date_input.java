package Model.Check_correct_user_input;

public class Check_date_input {
	
	public static boolean is_date(String s) {
		return s.replace(" ", "").matches("^\\d{2}.\\d{2}.\\d{4}$");
	}
}
