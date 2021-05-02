package chap5참조타입.값목록으로배열생성;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores= {83,90,87};
		int sum=0;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];
		}
		double avg= (double) sum/scores.length;
		System.out.println(avg);
	}

}
