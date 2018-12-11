import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	private Scanner keyboard;
	
	public BubbleSort() {
		keyboard = new Scanner(System.in);
	}

	public void sort() {

		int size = Integer.parseInt(this.keyboard.next());
		int[] arr = null;
		
		//입력한 값이 1~10 정수라면 해당 값의 크기로 배열 생성
		if(size>=1 && size<=10) {
			arr = new int[size];
		}
		System.out.println("배열의 크기: " + arr.length);
		
		//배열에 값 넣기
		for(int i=0; i < arr.length; i++) {
			System.out.println("배열에 넣을 숫자를 입력해주세요");
			int temp= Integer.parseInt(this.keyboard.next());
			if(temp >10) {
				System.out.println("10이하의 수로 입력해주세요");
				i--;
				continue;
			}
			arr[i] = temp;
			for(int j=0; j < i; j++ ) {
				if(arr[i] == arr[j]) {
					System.out.println("중복입니다. 다시 입력해주세요");
					i--;
					continue;
				}
			}
		}
		

		//버블 정렬
		for(int i=arr.length; i > 0; i--) {
			int temp = 0;
			for(int j=0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//최종 결과값 출력
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("배열의 크기를 입력해주세요");
		
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.sort();

	}
}
