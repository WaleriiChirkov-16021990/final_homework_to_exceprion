package Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date;

public class Error_date_value extends RuntimeException{
	
	
	/**
	 * Constructs a new runtime exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public Error_date_value(String message) {
		super(message);
		
	}
}
