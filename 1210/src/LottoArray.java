public class LottoArray {
	private int[] arr;

	public LottoArray() {
		this.arr = new int[6];
	}

	public int[] array(int[] arr) {
		for(int i = 0; i < arr.length; i++) {	
			arr[i] =  (int) ((Math.random() * 45) +1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복 발생");
					i--;
				}
			}
		}
		return arr;	
	}
	
	public int[] arrayBubbleSort(int[] arr) {
		int temp;
		for(int i = arr.length; i>0; i--) {
			for(int j=0; j < i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
