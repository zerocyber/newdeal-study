import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) throws IOException {

		LottoArray lottoArray = new LottoArray();
		int[] lotto = null;
		
		lotto = lottoArray.array(lotto);
		
		lottoArray.arrayBubbleSort(lotto);

		System.out.println(Arrays.toString(lotto));
		
		FileWriter fw = new FileWriter("result.txt",true);
		
		fw.write(Arrays.toString(lotto));
		
		fw.flush();
		
		fw.close();
		
	}
}
