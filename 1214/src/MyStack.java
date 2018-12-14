import java.util.Arrays;

public class MyStack {
	private Object[] stackArr;
	private int pointer = 0;
	private int count = 0;

	public MyStack() {
		stackArr = new Object[5]; //기본 크기 5로 설정
	}

	public boolean empty() { // 스택이 비었는지 확인
		for(int i=0; i < stackArr.length; i++) {
			if(stackArr[i] == null) {
				pointer = i;
				return true;
			}
		}
		return false;
	}

	public boolean full() { //스택이 풀인지 확인
		return (count == stackArr.length)? true : false;
	}

	public void push(Object i) {

		if(empty() == true) {
			stackArr[pointer] = i;
			count++;
		}else if(full()==false) {
			System.out.println("더이상 넣지 못합니다.");
			return;
		}
	}

	public Object pop() {
		stackArr[count-1] = null;
		count--;
		
		System.out.println("현재 스택 상태 : " + Arrays.toString(stackArr));
		
		return stackArr;

	}

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		String i = "test";
		ms.push(i);
		ms.push(3);
		System.out.println("스택 push 결과 : " + Arrays.toString(ms.stackArr));
		ms.pop();
		
		ms.push(1111);
		
		System.out.println("현재 스택 상태 : " + Arrays.toString(ms.stackArr));

	}
}