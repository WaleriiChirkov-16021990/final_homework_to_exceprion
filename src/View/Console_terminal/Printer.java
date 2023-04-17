package View.Console_terminal;

/**
 * Данный класс отвечает за получение актуальной информации пользователю,
 * при взаимодействии с приложением через консоль.
 */
public class Printer {
	
	public static final String exit = "\n1.Ввод данных нового пользователя \n2.Выход";
	public static final String first_menu = "\nВведите данные пользователя по следующему шаблону (разделитель пробел)/" +
												"\nФамилия Имя Отчество датарождения номертелефона пол\n" ;
	public static final String done = "\nУспешный ввод";
	public static final String error_size_litle = "\nВы указали меньше параметров, чем было необходимо";
	public static final String error_size_big = "\nВы указали лишние параметры";
	public static final String error_size_info = "\nТребуется 6 параметров";
	public static final String error_name = "\nОшибка ввода имени";
	public static final String error_name_lastname = "\nОшибка ввода фамилии";
	public static final String error_name_patronymic = "\nОшибка ввода отчества";
	public static final String error_name_info = "\nфамилия, имя, отчество - строки начинаются с Большой Буквы";
	public static final String error_date = "\nОшибка ввода даты (неизвестная дата)";
	public static final String error_date_info = "дата_рождения - строка формата dd.mm.yyyy";
	public static final String error_gender = "\nОшибка (неизвестный пол)";
	public static final String error_gender_info = "\nпол - символ латиницей f или m.";
	public static final String error_telephone = "\nОшибка (не верный формат телефона)";
	public static final String error_telephone_info = "\nномер_телефона - целое беззнаковое число без форматирования 11 чисел";
	public static final String next_help = "\nСледуйте указаниям";
	public static final String null_enter = "\nВы не ввели данные пользователя";
	public static final String error_input = "\nВы ввели мало данных или забыли про пробелы!";
	public static final String error_add_in_exist_file = "\n Ошибка добавления записи в существующий файл: ";
	public static final String error_create_file = "\n Ошибка при создании файла: ";
	public static final String path_to_local_file = "src/Model/Local_file/";
	public static final String to_exit = "2";
	public static final String scanner_is_crash = "Сканер не действителен!";
	public static final String  not_date = "Отсутствует дата";
	public static final String  not_gender_data = "Отсутствует переменная указывающая на половую принадлежность пользователя.";
	public static final String  year_is_null = "Поле год не имеет ни каких значений";
	public static final String  day_is_null = "Поле день не имеет ни каких значений";
	public static final String  day_is_false = "Такого дня нет в этом месяце! ";
	public static final String  month_is_null = "Поле месяц не имеет ни каких значений";
	public static final String  month_is_false = "Не известный месяц по Григорианскому календдарю";
	public static final String  month_is_false_info = "Вы указали дату из будущего, человек еще не родился.";
	public static final String  error_age = "Указан не корректный год \nГод рождения не может быть более 140 летней давности, и не может быть позднее текущего года";
	
	
	/**
	 * to_print - метод отображения текстовых сообщений, в читаемом представлении через консоль
	 * @param message - передаваемое сообщение для дальнейшего отображения в консоли
	 */
	public static void to_print(String message) {
		System.out.println(message);
	}
	
}
