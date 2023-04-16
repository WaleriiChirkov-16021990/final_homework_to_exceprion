package Model.Abstract;

public abstract class Human implements Callable,Bornable {
	private String last_name;
	private String first_name;
	private String patronymic;
	private char gender;
	
	
	public Human(String[] full_name) {
		this.last_name = full_name[0];
		this.first_name = full_name[1];
		this.patronymic = full_name[2];
	}
	
	public Human(String last_name, String first_name, String patronymic) {
		this.last_name = last_name;
		this.first_name = first_name;
		this.patronymic = patronymic;
	}
	
	public Human() {
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public Character getGender() {
		return gender;
	}
	
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	
}
