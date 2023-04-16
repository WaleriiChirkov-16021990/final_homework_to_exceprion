package Model.Check_correct_user_input.Check_size_data;

public class Check_size_array {
	private final int size = 6;
	
	public int check_size(String[] array) {
		if (array.length == size) {
			return array.length;
		} else if (array.length < size) {
			return -2;
		} else {
			return -1;
		}
	}
}
