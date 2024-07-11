package arraylist;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// 문자열형(String) 리스트를 생성하세요
		ArrayList<String> list = new ArrayList<>();
		// 문자열 5개를 추가하세요 ("AA", "BB", "CC", "DD", "EE")
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		// 반복문을 사용하여 리스트의 요소를 출력하세요.
		for(String str : list) {
			System.out.println(str);
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		
//		list.remove(0);
//		list.remove(1);
//		list.remove(2);
//		remove 인덱스 0,1,2,3,4 > 삭제하면 에러남 // list 삭제된 자리가 유동적이라
		
//		list.remove(0); << 0번 인덱스를 5번 삭제하면 모든 데이터 소멸
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
		
		for (int i = list.size()-1; i > -1 ; i--) {
			list.remove(i);
			
		}
		
		System.out.println(list.size());

	}

}
