package array;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {

		// System.arraycopy 메소드를 사용하여 배열을 복사하세요.
		
		// 원본배열 : { 'a', 'b', 'c', 'd' 'e' }
		// 새배열 : { 'd', 'e' }

		char[] oldArr = { 'a', 'b', 'c', 'd', 'e' };
		char[] newArr = new char[2];
		char[] newnew = { 'f' };
		
		
		System.arraycopy(oldArr, 3, newArr, 0, 2);
		
		System.out.println("old : " + Arrays.toString(oldArr));
		System.out.println("new : " + Arrays.toString(newArr));
		
		System.arraycopy(oldArr, 3, newnew, 0, 1);
		
		System.out.println(Arrays.toString(newnew));
		
		for(int i = 0; i < newnew.length; i++) {
			char result = newnew[i];
			System.out.println(result);
		}
	
	}

}
