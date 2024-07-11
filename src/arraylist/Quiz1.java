package arraylist;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		//문자형(character) 리스트를 생성하세요.
		//char -> Character
		ArrayList<Character> ch= new ArrayList<>();
		
		//리스트에 데이터 추가
		ch.add('A');
		ch.add('B');
		ch.add('C');
		
		//리스트에서 요소를 하나씩 꺼내기
		char ch1 = ch.get(0); // 호환 ok
		Character ch2 = ch.get(0); // 호환 ok
		
		ch.get(0);
		System.out.println(ch);

	}

}
