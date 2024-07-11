package array;

public class Quiz8 {

	public static void main(String[] args) {

		Student[] student = new Student[3];

		student[0] = new Student("전성대", 11);
		student[1] = new Student("김영범", 11);
		student[2] = new Student("박태동", 11);

		for (int i = 0; i < student.length; i++) {
			student[i].showInfo();

		}

	}

}

class Student {

	String name;
	int number;

	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public void showInfo() {
		System.out.println("학생의 이름 : " + name + " 학번 :" + number);
	}

}
