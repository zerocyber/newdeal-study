import java.util.ArrayList;
import java.util.List;

public class BinaryDistance {

	int soulution(int num) {
		List<Integer> list = new ArrayList<>();

		int temp = num;



		int result = list.size();
		System.out.println("result : " + result);

		return result;
	}

	public static void main(String[] args) {
/*
		BinaryDistance bd = new BinaryDistance();

		System.out.println("리스트의 크기: " + bd.soulution(10));*/
		
		int num = 10;
		int temp = num;
		
		while(temp !=0) {
			System.out.println("------");
			temp =num / 2;
			num = num % 2;
			System.out.printf("a : %d  ,  temp : %d\n", num, temp);
		}
	}
}
