package Model.Check_correct_user_input.Check_telephone_number.Exception_of_error_enter_telephone_number;

public class Error_telephone_number_input extends RuntimeException{
	/**
	 * Constructs a new runtime exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public Error_telephone_number_input(String message) {
		super(message);
	}
}
