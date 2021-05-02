package chap5참조타입.배열복사;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldArray= {1,2,3};
		int[] newArray= new int[5];
		
//		for(int i=0; i<oldArray.length;i++) {
//			newArray[i]=oldArray[i];
//		}
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i=0; i<newArray.length;i++) {
			System.out.print(newArray[i]+", ");
		}
	}

}
