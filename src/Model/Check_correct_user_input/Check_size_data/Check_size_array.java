package Model.Check_correct_user_input.Check_size_data;

/**
 * Класс для проверки длины массива
 */
public class Check_size_array {
	private final int size = 6;
	
	/**
	 * Метод проверки обьёма данных в массиве пользователя
	 * @param array - массив с параметрами пользователя
	 * @return коды ошибок -1 - данных больше чем планировалось
	 *  -2 - данных меньше чем планировалось
	 *   любое число >= 1 = длина массива , в данном случае это всегда 6, по заданию
	 */
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
