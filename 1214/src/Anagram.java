import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String s1, String s2){

		//공백을 전부 다 제거한다
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		// 두 문자열의 길이를 미리 체크
		if ( s1.length() != s2.length() ) {
			return false;
		}

		// 두 단어다 소문자로 변환 후 char 형식으로 변환해주는 toCharArray() 메서드 활용
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		// Arrays.sort() 메서드를 활용한 알파벳 정렬 (알파벳순으로 정렬)
		Arrays.sort(c1);
		Arrays.sort(c2);

		// char[] --> String 으로 변환
		String sc1 = new String(c1);
		String sc2 = new String(c2);

		// 문자열 비교
		return sc1.equals(sc2);
	}

	public static void main(String[] args) {

		Anagram anagram = new Anagram();

		String first;
		String second;

		Scanner input = new Scanner(System.in);

		// 문장을 받을 수도 있기에 nextLine() 활용
		System.out.print("첫번째 단어/문장 입력:");
		first = input.nextLine();

		System.out.print("두번째 단어/문장 입력:");
		second = input.nextLine();

		System.out.println("Anagram ? "+anagram.isAnagram(first,second));
	}
}

