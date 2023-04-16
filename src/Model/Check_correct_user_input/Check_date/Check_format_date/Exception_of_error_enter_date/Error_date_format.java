package Model.Check_correct_user_input.Check_date.Check_format_date.Exception_of_error_enter_date;

public class Error_date_format extends RuntimeException{
	
	/**
	 * Constructs a new runtime exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public Error_date_format(String message) {
		super(message);
	}
}
