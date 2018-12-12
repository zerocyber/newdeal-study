public class Jumsu {
	public static void main(String[] args) {
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79

		for(int i=0; i< score.length; i++) {
			max = (max > score[i]) ? max : score[i];
			min = (min < score[i]) ? min : score[i];
		}
		System.out.println("max value : " + max);
		System.out.println("min value : " + min);
	}


	/*		//내림차순 정렬
	for(int i=0; i < score.length; i++) {
		int temp;
		for(int j=0; j < i; j++) {
			if( score[i] > score[j]) {
				temp = score[i];
				score[i] = score[j];
				score[j] = temp;
			}
		}
	}*/
}

