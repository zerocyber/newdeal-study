import java.util.Scanner;

public class StairGame {
	
	public void playGame(Scanner sc) {
		int user = 0;
		int com = 0;
		String[] arr = {"가위" , "바위" , "보"};
		
		System.out.println("계단 갯수 입력");
		int stair = sc.nextInt();
		while(user < stair && com < stair) {
			System.out.println("가위/바위/보 중 하나를 입력해주세요");
			String userInput = sc.next(); //유저 입력값
			String comInput = arr[(int)(Math.random() * 3)]; //컴퓨터 입력값
			System.out.println("userInput : " + userInput);
			System.out.printf("당신 - %s          COM - %s\n", userInput, comInput);
			if(userInput.equals("가위")) {
				switch (comInput) {
				case "가위": 
					System.out.println("비겼습니다");
					break;
				case "바위": 
					System.out.println("졌습니다");
					com += 3;
					break;
				case "보": 
					System.out.println("이겼습니다");
					user += 2;
					break;
				default:
					System.out.println("다시 입력해주세요");
					break;
				}
			}
			
			if(userInput.equals("바위")) {
				switch (comInput) {
				case "가위": 
					System.out.println("이겼습니다");
					user += 3;
					break;
				case "바위": 
					System.out.println("비겼습니다");
					break;
				case "보": 
					System.out.println("졌습니다");
					com += 5;
					break;
				default:
					System.out.println("다시 입력해주세요");
					break;
				}
			}
			
			if(userInput.equals("보")) {
				switch (comInput) {
				case "가위": 
					System.out.println("졌습니다");
					com += 2;
					break;
				case "바위": 
					System.out.println("이겼습니다");
					user += 5;
					break;
				case "보": 
					System.out.println("비겼습니다");
					break;
				default:
					System.out.println("다시 입력해주세요");
					break;
				}
			}	
			System.out.printf("현재 상황 - 당신(%d) , 컴퓨터(%d)\n", user, com);
		}
		if(user > com) {
			System.out.println("당신이 게임에서 이겼습니다");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		System.out.println("게임 끝, 다시 하시겠습니까? (Y/N)");
		if(sc.nextLine().equals("y")) {
			user =0;
			com = 0;
			playGame(sc);
		}else {
			System.out.println("Good Bye~");
			return;
		}
	}
	
	public static void main(String[] args) {

		StairGame sg = new StairGame();
		Scanner sc = new Scanner(System.in);
		
		sg.playGame(sc);
		
	}
}
