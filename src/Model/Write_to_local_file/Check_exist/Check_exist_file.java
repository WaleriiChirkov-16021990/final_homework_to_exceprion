package Model.Write_to_local_file.Check_exist;
import View.Console_terminal.Printer;

import java.io.File;
import java.io.IOException;

public class Check_exist_file {
	private final String local_file = Printer.path_to_local_file;
	public boolean is_exist_file(String path) {
		File file = new File(local_file + path);
		if (file.exists() && !file.isDirectory()) {
			return true;
		}
		return false;
	}
}
