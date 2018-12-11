import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static final String PATH = "C://test2";
	public static final String FILENAME = "result.txt";
	public static final String FILE_PATH = PATH + FILENAME;
	public static void main(String[] args) throws IOException {
		
		
		File file = new File(FILE_PATH);
		
		if(!file.exists()) {
			System.out.println("파일이 없습니다");		
			
			file.createNewFile();
			
		}
		
/*		FileWriter fw = new FileWriter(path + fileName,true);
		
		fw.write("test..........");
		
		fw.flush();
		
		fw.close();*/

	}
}
