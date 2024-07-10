package array;

public class Quiz5 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };
		int value = arr[0];
			
		for(int i = 0; i < arr.length; i++) {
		if(arr[i] > value) {
			value = arr[i];
			
		}
	}
		System.out.println(value);
		
//		if(value < value2) {
//			System.out.println("가장 큰 값이 아닙니다.");
//		}else if(value2 < value3){
//			
//		}else if(value3 < value4) {
//			
//		}else if(value4 < value5) {
//			
//		}else {
//			
//		}

	}

}
