import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryDistance {

	public int soulution(int num) {
		List<Integer> list = new ArrayList<>();

		int temp = num;

		int result = list.size();
		System.out.println("result : " + result);
		
		Collections.reverse(list); //순서 뒤집기
		
		System.out.println("list : " + list.toString());
		
		
		return result;
	}

	public static void main(String[] args) {
/*
		BinaryDistance bd = new BinaryDistance();

		System.out.println("리스트의 크기: " + bd.soulution(10));*/
		
		int num = 10; //나눌 대상
		int temp = 1; //나눈 나머지

		while( temp == 0) {
			System.out.println(".....");
			temp = num % 2;
			num = num /2;
			
		}
		
		
		System.out.printf("num : %d , temp : %d\n", num, temp);
	}
}
