public class Solution {
  public String solution(int n) {
      String[] num = {"4","1","2"};
      String answer = "";

      while(n > 0){
          answer = num[n % 3] + answer;
          System.out.printf("넣은 수: %d, answer: %s\n", n,answer);
          n = (n - 1) / 3;
          System.out.println("현재 n : " + n);
      }
      return answer;
  }
  
  public static void main(String[] args) {
	Solution s = new Solution();
	
	s.solution(5);
}
}