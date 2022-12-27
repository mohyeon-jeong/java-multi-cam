package work07;

public class Exercise1 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("name : " + s.name);
		System.out.println("total : " + s.getTotal(s.kor, s.eng, s.math));
		System.out.println("avg : " + s.getAverage());
	}

}
