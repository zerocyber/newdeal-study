import java.util.Scanner;

public class HighLowGame {
	Scanner sc;
	int input;

	public HighLowGame() {
		sc = new Scanner(System.in);
		input = 0;
		game();
	}
	
	void game() {
		int a = (int) (Math.random() * 100);

		while( true ) {
			System.out.println("수를 결정했습니다. 맞춰보세요(0~99)");
			input = Integer.parseInt(sc.next());

			if( a > input) {
				System.out.println("더 높게");
				continue;
			}
			else if( a < input) {
				System.out.println("더 낮게");
				continue;
			}else {
				System.out.println("정답입니다. RESTART? (Y,N)");
				String answer = sc.next();
				if(answer.equalsIgnoreCase("y")) {
					a = (int) (Math.random() * 100);
					continue;
				}else {
					break;
				}
			}
		}	

	}

	public static void main(String[] args) {		
		HighLowGame hlgame = new HighLowGame();
	}
}
