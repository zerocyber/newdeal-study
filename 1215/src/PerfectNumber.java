import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
	List<Integer> list;
	
	public PerfectNumber() {
		list = new ArrayList<>();
	}
	
	public void confirmPerfectNum(int inputNum) {
		
		for(int i=1; i< inputNum; i++) {
			if(i %2 == 0) {	//완전수는 짝수만 존재
				int temp = 0;
				List<Integer> mlist = new ArrayList<>();
				//약수 담기
				for(int j =1; j < i; j++) {
					if(i % j == 0) {
						mlist.add(j);
					}
				}
				for(int j=0; j < mlist.size(); j++) {
					temp += mlist.get(j);
				}
				
				//약수의 합 = 자기자신 -> list에 담는다.
				if(temp == i) {
					list.add(i);
				}			
			}
			
		}
		System.out.println(list.toString());
		
	}

	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		
		System.out.println("자연수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		pn.confirmPerfectNum(num);

	
	}
}
