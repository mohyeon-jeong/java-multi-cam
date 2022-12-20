package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		String hongName, ilName, jangName, hongPhone, ilPhone, jangPhone, hongAdd, ilAdd, jangAdd;
		int hongAge, ilAge, jangAge;
		boolean hongMan, ilMan, jangMan;
		double hongHeight, ilHeight, jangHeight;
		
		hongName = "\"홍길동\"";
		ilName = "\"일지매\"";
		jangName = "\"장옥정\"";
		
		hongAge = 20;
		ilAge = 18;
		jangAge = 14;
		
		hongMan = true;
		ilMan = true;
		jangMan = false;
		
		hongPhone = "010-111-2222";
		ilPhone = "02-123-4567";
		jangPhone = "02-345-7890";
		
		hongHeight = 175.12;
		ilHeight = 180.01;
		jangHeight = 155.78;
		
		hongAdd = "\"경기도\"";
		ilAdd = "\"서울\"";
		jangAdd = "\"부산\"";
		
		System.out.println("=================================================================");
		System.out.println("\\ name\t\tage\tman\tphone\t\theight\taddress\t\\");
		System.out.println("=================================================================");
		System.out.println("\\ " + hongName + "\t" + hongAge + "\t"+ hongMan + "\t" + hongPhone + "\t" + hongHeight + "\t" + hongAdd + "\t\\");
		System.out.println("\\ " + ilName + "\t" + ilAge + "\t"+ ilMan + "\t" + ilPhone + "\t" + ilHeight + "\t" + ilAdd + "\t\\");
		System.out.println("\\ " + jangName + "\t" + jangAge + "\t"+ jangMan + "\t" + jangPhone + "\t" + jangHeight + "\t" + jangAdd + "\t\\");
		System.out.println("=================================================================");
		
	}

}
