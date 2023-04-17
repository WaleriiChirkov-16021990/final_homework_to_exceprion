package Model.Write_to_local_file.Writing_user;

import Model.Abstract.Human;
import Model.User;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Write_new_lastname_file {
	private final String local_file = "src/Model/Local_file/";
	
	public void writex(Human user) throws IOException {
		List<String> stringList = new ArrayList<>(Collections.singletonList(user.toString()));
		Path file = Paths.get(this.local_file + user.getLast_name());
		Files.write(file,stringList, StandardCharsets.UTF_8);
	}
}
