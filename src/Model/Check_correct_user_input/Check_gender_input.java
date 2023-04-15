package Model.Check_correct_user_input;

public class Check_gender_input {
	public static boolean is_gender(String s){
		if (s.replace(" ", "").equals("f") || s.replace(" ","").equals("m"))  return true;
		return false;
	}
}
