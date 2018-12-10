import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		
		LottoArray lottoArray = new LottoArray();
		int[] lotto = null;
		lotto = lottoArray.array(lotto);
		lottoArray.arrayBubbleSort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
		File file = new File("C:\\Test.txt");
		
		if(file.exists()) {
			FileOutputStream outputStream = new FileOutputStream(file);
			
		}
	}
}
