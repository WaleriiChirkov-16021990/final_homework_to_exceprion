package Model;

import Model.Abstract.Human;

public class User extends Human {
	private String date;
	private String telephone_number;
	
	public User(String[] full_name) {
		super(full_name);
	}
	
	public User(String last_name, String first_name, String patronymic, String date, String telephone_number) {
		super(last_name, first_name, patronymic);
		this.date = date;
		this.telephone_number = telephone_number;
	}
	
	@Override
	public void add_date() {
	
	}
	
	@Override
	public String get_date() {
		return null;
	}
	
	@Override
	public void add_number() {
	
	}
}
