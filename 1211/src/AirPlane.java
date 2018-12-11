
public class AirPlane {
	private String name;
	private int no;
	private static int count = 0;
	
	public AirPlane(String name, int no){
		this.name = name;
		this.no = no;
		count++;
	}
	
	void print() {
		System.out.println("이름: " + this.name);
		System.out.println("번호: " + this.no);
		
	}
	
	void printCount() {
		System.out.println("총 갯수: " + this.count);
	}
	
	
	public static void main(String[] args) {
		AirPlane a = new AirPlane("1번비행기", 7);
		a.print();
		a.printCount();
		
		AirPlane b= new AirPlane("2번비행기", 10);
		b.print();
		a.printCount();
	}
}
