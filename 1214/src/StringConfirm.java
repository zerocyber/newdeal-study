import java.util.Scanner;

public class StringConfirm {

	static boolean numCheck(String num) {
		
		boolean result = num.length() == 14 ? true : false;
		System.out.println(result == true? "14 OK" : "다시입력");
		return result;
	}
	
	static boolean num() {
		
		return true;
	}
	
	static void isMan() {
		
	}


	public static void main(String[] args) {
	       String ssn = "";
	        do {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("주민번호 입력:");
	            String front = sc.nextLine();
	            String rear = sc.nextLine();
	            ssn = front + "-" + rear;
	 
	        } while (!numCheck(ssn) || !numCheck(ssn));
	        // 둘다 true 인경우  > false || false 탈출
	        // !true || !true => false || false 탈출
	        /*JuminDisplay(ssn);*/

			
			



		/*		String num = front + "-" + rear;

		System.out.println("입력값: " + num);

		String[] splitNum = num.split("-");

		System.out.println(Arrays.toString(splitNum));

		char[] rearNums = splitNum[1].toCharArray();

		System.out.println(Arrays.toString(rearNums));

		int firstRealNum = Character.getNumericValue(rearNums[0]);

		if( firstRealNum>4 || firstRealNum <0 ) {
			System.out.println("다시 입력해주세요");
		}

		if(firstRealNum ==1 || firstRealNum ==3) {
			System.out.println("남자입니다");
		}else if(firstRealNum ==2 || firstRealNum ==4) {
			System.out.println("여자입니다");
		}

		if(num.length() !=14) {
			System.out.println("다시 입력해주세요");
		}else {
			System.out.println("입력완료");
		}*/


	}
}
