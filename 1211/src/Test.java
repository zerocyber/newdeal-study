import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i < 3; i++) {
			System.out.println("숫자를 입력해주세요.");
			int temp = Integer.parseInt(scanner.next());
			if( temp >10) {
				System.out.println("10이하의 수로 입력해주세요");
				i--;
				continue;
			}

		}
	}
}
