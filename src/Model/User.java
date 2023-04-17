package Model;

import Model.Abstract.Human;

public class User extends Human {
	private String date;
	private String telephone_number;
	private String gender;
	
	public User(String[] full_name) {
		super(full_name);
		this.date = full_name[3];
		this.telephone_number = full_name[4];
		this.gender = full_name[5];
	}
	
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
