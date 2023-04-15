package View.Console_terminal;

public class Printer {
	public static final String first_menu = "\nВведите данные пользователя по следующему шаблону (разделитель пробел)/" +
												"\nФамилия Имя Отчество датарождения номертелефона пол\n" ;
	public static final String done = "\nУспешный ввод";
	public static final String error_name = "\nОшибка ввода имени";
	public static final String error_date = "\nОшибка ввода даты (неизвестная дата)";
	public static final String error_gender = "\nОшибка (неизвестный пол)";
	public static final String error_telephone = "\nОшибка (не верный формат телефона)";
	
	public static void to_print(String message) {
		System.out.println(message);
	}
	
}
