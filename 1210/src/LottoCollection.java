import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class LottoCollection {

	public static void main(String[] args) throws IOException {
		Set<Integer> lotto = new TreeSet<>();
		for(int i=0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random() * 45)+1);
		}
		System.out.println(lotto.toString());
	
		FileWriter fw = new FileWriter("result.txt",true);
		
		fw.write(lotto.toString());
		
		fw.flush();
		
		fw.close();

	}
}
