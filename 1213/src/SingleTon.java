/*public class SingleTon {
	private static SingleTon instance;
	
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		if(instance == null) {			
			instance = new SingleTon();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon test = SingleTon.getInstance();
	}
}
*/


//성능이 제일 좋은 예제
public class SingleTon{
	private SingleTon() {} // new를 통한 객체생성 막기
	
	//중첩 클래스(Inner Class)를 활용
	private static class SingleTonHolder {
		public static final SingleTon INSTANCE = new SingleTon();
	}
	
	public static SingleTon getSingTonInstance() {
		return SingleTonHolder.INSTANCE;
	}
	
	public static void main(String[] args) {
		SingleTon a1 = SingleTon.getSingTonInstance();
		SingleTon a2 = SingleTon.getSingTonInstance();
		
		//a1, a2가 같은 주소값을 출력한다
		//최신 VM은 클래스를 초기화를 위한 필드 접근은 동기화한다.
		System.out.println(a1);
		System.out.println(a2);
		
	}
}