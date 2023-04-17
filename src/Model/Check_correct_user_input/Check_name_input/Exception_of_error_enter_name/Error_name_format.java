package Model.Check_correct_user_input.Check_name_input.Exception_of_error_enter_name;

/**
 * Класс исключения, на случай если в имени появятся посторонние символы, либо кто то укажет имя без должного уважения (с маленькой буквы)
 */
public class Error_name_format extends RuntimeException{
	
	/**
	 * Constructs a new runtime exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public Error_name_format(String message) {
		super(message);
	}
}
