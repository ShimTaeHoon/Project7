package array;

public class Quiz3 {

	public static void main(String[] args) {

		// 배열의 합 구하기
		int[] arr = { 10, 15, 20, 25, 30 };
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
						
		}
		
		System.out.println(sum);

	}

}
