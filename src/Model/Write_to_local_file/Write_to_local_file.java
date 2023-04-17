package Model.Write_to_local_file;

import Model.Abstract.Human;
import Model.Write_to_local_file.Check_exist.Check_exist_file;
import Model.Write_to_local_file.Writing_user.Add_current_name_in_exist_file;
import Model.Write_to_local_file.Writing_user.Write_new_lastname_file;

import java.io.IOException;

public class Write_to_local_file {
	public void writex(Human user) throws IOException {
		if (new Check_exist_file().is_exist_file(user.getLast_name())) {
			new Add_current_name_in_exist_file().writex(user);
		} else {
			new Write_new_lastname_file().writex(user);
		}
	}
}
