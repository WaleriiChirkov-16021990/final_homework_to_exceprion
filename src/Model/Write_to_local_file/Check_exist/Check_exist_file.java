package Model.Write_to_local_file.Check_exist;
import java.io.File;

public class Check_exist_file {
	
	public boolean is_exist_file(String path) {
		File file = new File(path);
		if (file.exists() && !file.isDirectory()) {
			return true;
		}
		return false;
	}
}
