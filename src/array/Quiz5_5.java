package array;

public class Quiz5_5 {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {5, 20, 100, 30, 77};
		// 배열 중 가장 큰 값을 구하시오.
		int[] arr = { 5, 20, 10, 30, 77 };
		
		// 최대값을 저장하기 위한변수
		int max = arr[0]; // 배열의 첫번째 값으로 최대값을 초기화
		
		for(int i = 1; i < 5; i++) {
			System.out.print(max + "vs" + arr[i]);
			
			if(max < arr[i]) { // 배열의값이 현재 최대값보다 크면
				max = arr[i]; // 최대값 변경
			}
			System.out.print("??" + max);;
			System.out.println();
		}
		
	}

}
