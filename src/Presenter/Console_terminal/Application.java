package Presenter.Console_terminal;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import Model.Check_correct_user_input.Check_date.Check_value_date.Checker_value_date;
import Model.Check_correct_user_input.Check_date.Check_format_date.Exception_of_error_enter_date.Error_date_format;
import Model.Check_correct_user_input.Check_gender.Checker_gender;
import Model.Check_correct_user_input.Check_name_input.Checker_full_name;
import Model.Check_correct_user_input.Check_name_input.Exception_of_error_enter_name.Error_name_format;
import Model.Check_correct_user_input.Check_size_data.Checker_size;
import Model.Check_correct_user_input.Check_size_data.Exception_of_error_size_array.Error_size_array;
import Model.Check_correct_user_input.Check_telephone_number.Checker_telephone_num;
import Model.Check_correct_user_input.Check_telephone_number.Exception_of_error_enter_telephone_number.Error_telephone_number_input;
import Model.Exit_application;
import Model.User;
import Model.User_input_console_1.Inputer_for_console;
import Model.Write_to_local_file.Write_to_local_file;
import View.Console_terminal.Printer;

import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Класс, экземпляр которого, реализует требуемое в описание приложение
 */
public class Application {
	private String[] user;
	private String string;
	
	
	/**
	 * Метод, запускающий реализацию приложения, в котором
	 * обрабатываются все возникающие в процессе исключения
	 */
	public void run() {
		boolean runing = true;
		try (Scanner scanner = new Scanner(System.in)) {
			Printer.to_print(Printer.next_help);
			while (runing) {
				runing = new Exit_application().select_user(scanner);
				if (!runing) break;
				Printer.to_print(Printer.first_menu);
				string = new Inputer_for_console(scanner).u_input();
				user = string.split(" ");
				new Checker_size().run_check(user);
				new Checker_value_date().run_check(user);
				new Checker_full_name().run_check(user);
				new Checker_gender().run_check(user);
				new Checker_telephone_num().run_check(user);
				Printer.to_print(Printer.done);
				User user1 = new User(user);
				new Write_to_local_file().writex(user1);
			}
		} catch (Error_size_array e) {
			throw new Error_size_array(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
		} catch (Error_date_format date_format) {
			throw new Error_date_format(date_format.getMessage() + "\n" + Arrays.toString(date_format.getStackTrace()));
		} catch (Error_name_format name_format) {
			throw new Error_name_format(name_format.getMessage() + "\n" + Arrays.toString(name_format.getStackTrace()));
		} catch (Error_telephone_number_input number_input) {
			throw new Error_telephone_number_input(number_input.getMessage() + "\n" + Arrays.toString(number_input.getStackTrace()));
		} catch (NoSuchElementException suchElementException) {
			throw new IllegalArgumentException(Printer.error_input + "\n" + Arrays.toString(suchElementException.getStackTrace()));
		} catch (NullPointerException nullPointerException) {
			throw new NullPointerException(nullPointerException.getMessage() + "\n" + Arrays.toString(nullPointerException.getStackTrace()));
		} catch (Error_date_value error_date_value) {
			throw new Error_date_value(error_date_value.getMessage() + "\n" + Arrays.toString(error_date_value.getStackTrace()), error_date_value.getCause());
		} catch (IOException ioException) {
			throw new RuntimeException(Arrays.toString(ioException.getStackTrace()));
		} catch (RuntimeException runtimeException) {
			throw new RuntimeException(runtimeException.getMessage(), runtimeException.getCause());
		}
	}
	
}
