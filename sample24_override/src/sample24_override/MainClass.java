package sample24_override;

import cls.Batter;
import cls.Human;
import cls.Pitcher;

public class MainClass {

	public static void main(String[] args) {
//		Pitcher[] pitArr = new Pitcher[10];
//		Batter[] batArr = new Batter[10];
		
		Human[] humanArr = new Human[5];
		
		humanArr[0] = new Pitcher("A", 20, 10, 2);
		humanArr[1] = new Batter("B", 24, 8, 5);
		humanArr[2] = new Pitcher("C", 23, 14, 10);
		humanArr[3] = new Batter("D", 22, 23, 20);
		humanArr[4] = new Pitcher("E", 25, 20, 10);
		
		for (int i = 0; i < humanArr.length; i++) {
			System.out.println(humanArr[i].toString());
		}
		
		for (int i = 0; i < humanArr.length; i++) {
			if (humanArr[i] instanceof Pitcher) {
				Pitcher p = (Pitcher) humanArr[i];
				System.out.println("wins : " + p.getWin() + ", loses : " + p.getLose());
			} else if (humanArr[i] instanceof Batter) {
				Batter b = (Batter) humanArr[i];
				System.out.println("gets : " + b.getBatCount() + ", hits : " + b.getHit());
			}
		}
	}

}
