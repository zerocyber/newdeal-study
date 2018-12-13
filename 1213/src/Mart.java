import java.util.Arrays;

public class Mart {
	public static void main(String[] args) {
		KtTv kt = new KtTv();	
		Audio audio = new Audio();
		NoteBook noteBook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.purchase(kt);		
		buyer.purchase(audio);
		buyer.purchase(noteBook);
		
		//계산대에 가서 계산
		buyer.summary();
	}
}


//구매자
class Buyer {
	int money, point;
	int buyCount = 0;
	Product[] cart = new Product[10];
	
	public Buyer() {
		money = 1000;
		point = 0;
	}
	
	public Buyer(int money, int point) {	
		this.money = money;
		this.point = point;

	}
	
	//제품 구매 함수에 제품 객체를 파라미터로
	void purchase(Product product) {
		if(this.money < product.price) {
			System.out.println("돈이 부족합니다ㅠ");
			return;
		}
		
		if(buyCount >10) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		
		cart[buyCount] = product;
		buyCount++; //카트에 제품을 담고 카운트 +1
		
		System.out.println("구매 제품 이름: " + product);
		System.out.println("현재 카트에 있는 물건: " + Arrays.toString(cart));
	}
	
	void summary() {
		System.out.println("계산합니다~");
		for(int i=0; i< buyCount; i++) {
			this.money -= cart[i].price;
			this.point += cart[i].bonuspoint;
		}
		System.out.printf("남은 돈: %d, 보유 포인트: %d\n", this.money,this.point);
	}
	
}


class Product{
	int price;
	int bonuspoint;

	public Product() {

	}
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}


class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}


