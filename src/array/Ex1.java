package array;

public class Ex1 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];
		arr = new int[] {1, 2, 3};
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
				
		// 생성하고 바로 특정 값으로 초기화
		// 생성 + 초기화 -> 동시에 할때는 생략가능
		int[] arr2 = { 1, 2, 3 }; // new 생략가능	
		
		int[] arr3; //배열 선언
		arr3 = new int[] { 1, 2, 3 }; // 생성 및 초기화
				
		System.out.println();
						
	}

}
