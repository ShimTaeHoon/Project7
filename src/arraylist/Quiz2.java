package arraylist;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		// 논리형(Boolean)의 리스트를 생성하세요
		ArrayList<Boolean> list = new ArrayList<>();

		// 값을 3개를 추가하세요(true, true, false)
		list.add(true);
		list.add(true);
		list.add(false);

		// 반복문을 사용하여 리스트의 모든 요소를 출력하세요.
		for (int i = 0; i < list.size(); i++) {
			boolean bool = list.get(i);
			System.out.println(bool);

		} 
		
		System.out.println("첫번째 요소 : " + list.getFirst());
		System.out.println("마지막 요소 : " + list.getLast());

		// 람다식 (get메소드 필요없이 리스트를 앞에있는 변수에 초기화)
		for (boolean bool : list) {
			System.out.println(bool + " ");
		}
		
		int lastIndex = list.size() - 1;
		
		list.get(0); // 첫번째 인덱스는 항상 있음. 0번 인덱스 불러오기
		list.get(lastIndex); // 마지막 인덱스를 알려면 list.size()-1;
		
	}

}
