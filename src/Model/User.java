package Model;

import Model.Abstract.Human;

/**
 * Класс описывает юзера, который создастся после успешного ввода всех параметров.
 */
public class User extends Human {
	private String date;
	private String telephone_number;
	private String gender;
	
	/**
	 * Конструктор
	 * @param full_name Массив строк, это полноценный массив из 6 параметров юзера,
	 *                  хранящий в себе 6 параметров требуемого типа, формата и значения.
	 */
	public User(String[] full_name) {
		super(full_name);
		this.date = full_name[3];
		this.telephone_number = full_name[4];
		this.gender = full_name[5];
	}
	
	/**
	 * Конструктор
	 * @param last_name - Фамилия
	 * @param first_name - Имя
	 * @param patronymic - Отчество
	 * @param date - Дата рождения
	 * @param telephone_number - Номер мобильного телефона
	 * @param gender - половая принадлежность.
	 */
	public User(String last_name, String first_name, String patronymic, String date, String telephone_number, String gender) {
		super(last_name, first_name, patronymic);
		this.date = date;
		this.telephone_number = telephone_number;
		this.gender = gender;
	}
	
	@Override
	public void add_date(String date) {
		this.date = date;
	}
	
	@Override
	public String get_date() {
		return this.date;
	}
	
	@Override
	public void add_number(String number) {
		this.telephone_number = number;
	}
	
	/**
	 *  Данный метод преобразует параметры юзера в строку, для дальнейшей передачи информации,
	 *  или например тут я использую его для записи в файл.
	 * @return Строка параметров человека перечисленных через пробел.
	 */
	@Override
	public String toString() {
		return getLast_name() + " " +
				getFirst_name() + " " +
				getPatronymic() + " " +
				date + " " +
				telephone_number + " " +
				gender;
	}
}
