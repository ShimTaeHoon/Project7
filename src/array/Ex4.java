package array;

public class Ex4 {

	public static void main(String[] args) {
		
		// 10개 크기 배열 생성
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 반복문으로 배열의 요소 하나씩 꺼내기
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// 순회 개념(배열의 크기를 몰라도 됨)
		// 첫번째 요소부터 마지막 요소까지 봄
		// 람다식 포문: 반복문의 간결한 형태
		for (int value : arr) { // 변수 : 배열
			System.out.print(value + " ");
		}

	}

}
