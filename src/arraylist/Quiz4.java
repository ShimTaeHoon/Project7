//package arraylist;
//
//import java.util.ArrayList;
//
//public class Quiz4 {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Student> list = new ArrayList<>();
//		
//		// 1. 일단 객체를 생성하고
//		Student student = new Student(1001, "둘리");
//		// add함수에 참조변수를 넣어줌
//		list.add(student);
//		
//		// 2. 위 방법이 귀찮으면 add메서드 매개변수안에 생성자 호출하면됨
//		list.add(new Student(1002, "또치"));
//		list.add(new Student(1003, "도우너"));
//		
//		Student student1 = list.get(0);
//		student1.showInfo();
//		Student student2 = list.get(1);
//		student2.showInfo();
//		Student student3 = list.get(2);
//		student3.showInfo();
//		
//		for(int i=0; i<list.size(); i++) {
//			Student stu = list.get(i);
//			stu.showInfo();
//		}
//		
//	}
//
//}
//
//class Student{
//	String name;
//	int studentNo;
//	
//	public Student(int studentNo, String name) {
//		super();
//		this.name = name;
//		this.studentNo = studentNo;
//	}
//	
//	public void showInfo() {
//		System.out.println(name + studentNo);
//	}
//}
