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
			
			if( input < 100 && input >=0) {
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
			}else {
				System.out.println("범위를 벗어났습니다, 0~99의 숫자중 하나를 입력해주세요.");
			}

		}	

	}

	public static void main(String[] args) {		
		HighLowGame hlgame = new HighLowGame();
	}
}
