import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryDistance {

  public int soulution(int num) {
    List<Integer> list = new ArrayList<>();

    int temp = 0;

    while( num > 0) {
      System.out.println("----"+num+"----"); 
      temp = num % 2;
      list.add(temp);
      System.out.println("나머지: " + temp);
      num = num /2;
      System.out.println("몫: " + num);
    }

    System.out.printf("num : %d , temp : %d\n", num, temp);

    int result = list.size();
    System.out.println("리스트 안의 갯수 : " + result);
    System.out.println("list : " + list.toString());

    Collections.reverse(list); //순서 뒤집기

    System.out.println("list : " + list.toString());


    return result;
  }

  public static void main(String[] args) {
    BinaryDistance bd = new BinaryDistance();

    bd.soulution(25);
  }
}
