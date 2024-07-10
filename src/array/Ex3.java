package array;

public class Ex3 {

	public static void main(String[] args) {
		
		// 10개 크기의 정수형 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
				
		int[] arr = new int[3];
		
		// 배열의 요소를 하나씩 꺼내서 출력하기~!
//		System.out.println(intArr[0]); // 배열이름[인덱스]
//		System.out.println(intArr[1]);

		// i를 인덱스로 활용!
		for(int i = 0; i <= 9; i++){
			System.out.println(intArr[i]);
		}
		
		// 위보다 이렇게 작성하는게 더 좋음 // 위와 결과는 같음
		for(int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}
		
		// length: 배열의 크기
		System.out.println(intArr.length);
		
		// 배열이 추가되더라도 동적으로 가져오기 때문에 수정할 필요가 없음.
		// 이렇게 사용하면 유지보수가 좋음
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}

}
