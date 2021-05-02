package chap2.p55;
	//강제 타입변환
	// 강제 타입 변환에서 주의 할 점은 사용자로 부터 입력바ㅏㄷ은 값을 변환할 때 값의 손실이 발생하면 안된다.
public class CastingExample {
	public static void main(String [] args) {
		int intValue=44032;
		char charValue= (char) intValue;
		System.out.println(charValue);
		
		long longValue=500;
		intValue= (int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue= (int)doubleValue;
		System.out.println(intValue);
			
		
	}

}
