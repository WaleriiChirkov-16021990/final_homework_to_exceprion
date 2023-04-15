package View.Console_terminal;

public class Printer {
	
	public static final String exit = "\n1.Ввод данных нового пользователя \n2.Выход";
	public static final String first_menu = "\nВведите данные пользователя по следующему шаблону (разделитель пробел)/" +
												"\nФамилия Имя Отчество датарождения номертелефона пол\n" ;
	public static final String done = "\nУспешный ввод";
	public static final String error_name = "\nОшибка ввода имени";
	public static final String error_name_info = "\nфамилия, имя, отчество - строки";
	public static final String error_date = "\nОшибка ввода даты (неизвестная дата)";
	public static final String error_date_info = "дата_рождения - строка формата dd.mm.yyyy";
	public static final String error_gender = "\nОшибка (неизвестный пол)";
	public static final String error_gender_info = "\nпол - символ латиницей f или m.";
	public static final String error_telephone = "\nОшибка (не верный формат телефона)";
	public static final String error_telephone_info = "\nномер_телефона - целое беззнаковое число без форматирования";
	
	public static void to_print(String message) {
		System.out.println(message);
	}
	
}
