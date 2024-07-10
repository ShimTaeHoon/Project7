package array;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		System.out.println(Arrays.toString(arr));
		
		// 1~10 중에서 짝수 찾기
		int cnt = 0; // 인덱스를 저장할 변수
		
		// i는 1~10이 되므로, 인덱스로 사용할 수 없음.
		for (int i = 1; i <= 10; i++) {
			
//			System.out.println("i: " + i);
			
			if(i % 2 == 0) {
				arr[cnt] = i; // i가 짝수일때 변수에 저장
				cnt++; // 0~4

			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 배열의 요소를 한번에 출력
		 System.out.println(arr); // arr은 참조변수이므로 주소가 출력 됨
		 Arrays.toString(arr); // Arrays클래스 활용해서 toString으로 배열이 가지고 있는 값을 확인
	}

}
