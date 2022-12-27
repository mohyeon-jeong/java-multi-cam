package work07;

public class Student {
	
	String name = "";
	int ban, no, kor, eng, math;
	
	public int getTotal(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return Math.round(((double)(kor + eng + math) / 3) * 10) / 10.0;
	}
	
}
