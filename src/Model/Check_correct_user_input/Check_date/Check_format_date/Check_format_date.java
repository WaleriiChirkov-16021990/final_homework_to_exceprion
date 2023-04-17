package Model.Check_correct_user_input.Check_date.Check_format_date;

/**
 * Экземпляр данного класса создается только для последующей проверки строковой переменной
 * на строгое соответствие указанному формату записи "dd.mm.yyyy"
 */
public class Check_format_date {
	/**
	 * is_date проверяет с помощью регулярного выражения, соответствует ли полученная строка указанному шаблону или нет.
	 * Перед проверкой удаляются все пробелы.
	 * @param s - строка для проверки
	 * @return true or false (Возвращает истину или ложь)
	 */
	public static boolean is_date(String s) {
		return s.replace(" ", "").matches("^\\d{2}.\\d{2}.\\d{4}$");
	}
}
