package Model.Check_correct_user_input.Check_telephone_number;

public class Check_telephone_number_input {
	
	public static boolean is_phone_number(String s) {
		return s.replace(" ","").matches("^\\d{11}$");
	}
}
