package Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date;

/**
 *  Данный класс описывает исключение, которое возбуждают при неудачной проверке
 *  значений , указанных в строчной переменной даты
 */
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
	
	/**
	 * Constructs a new runtime exception with the specified detail message and
	 * cause.  <p>Note that the detail message associated with
	 * {@code cause} is <i>not</i> automatically incorporated in
	 * this runtime exception's detail message.
	 *
	 * @param message the detail message (which is saved for later retrieval
	 *                by the {@link #getMessage()} method).
	 * @param cause   the cause (which is saved for later retrieval by the
	 *                {@link #getCause()} method).  (A {@code null} value is
	 *                permitted, and indicates that the cause is nonexistent or
	 *                unknown.)
	 * @since 1.4
	 */
	public Error_date_value(String message, Throwable cause) {
		super(message, cause);
	}
}
