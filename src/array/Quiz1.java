package array;

public class Quiz1 {

	public static void main(String[] args) {

		// 5개 크기의 문자형 배열
		char[] charArr = { 'a', 'b', 'c', 'd', 'e' };

//		for (int i = 0; i < charArr.length; i++)
//			System.out.println(charArr[i]);

		for (int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		char[] charArr1 = new char[5];
		charArr1[0] = 'a';
		charArr1[1] = 'b';
		charArr1[2] = 'c';
		charArr1[3] = 'd';
		charArr1[4] = 'e';

	}

}
