package array;

public class Ex2 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];
		
		// index는 0번부터 시작이 된다.
		// 첫번째 방에 접근하려면 인덱스 0부터..
		arr[0] = 10; // 배열의 첫번째 요소에 10 저장
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40; // 배열의 범위가 3이라 0,1,2 값이 3개인데 4개라 오류
		
		// 배열의 두번째 요소값을 가져와서 value에 저장
		int value = arr[2];	
		System.out.println(value);

	}

}
