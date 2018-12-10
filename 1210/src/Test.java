import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String path = "C:/testFile";
		String fileName = "result.txt";
		
		File file = new File(path);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		FileWriter fw = new FileWriter(path + fileName,true);
		
		fw.write("test..........");
		
		fw.flush();
		
		fw.close();

	}
}
