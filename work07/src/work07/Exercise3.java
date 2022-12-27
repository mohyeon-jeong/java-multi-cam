package work07;

public class Exercise3 {

	public static void main(String[] args) {
		DiceGame d = new DiceGame();
		
		// 아래 과정들도 method 하나 파서 묶어놓고 main에서는 그거 하나만 호출하는 식으로 하면 좋음
		System.out.println("GAME START!!");
		while (true) {
			System.out.println("your coin : " + d.coin);
			System.out.print("bet quantity : ");
			d.betCoin();
			System.out.print("expected sum : ");
			d.expect();
			System.out.println("you expected " + d.expectSum);
			d.game();
			if (d.coin <= 0) {
				System.out.println("no more coin. GAME OVER");
				break;
			}
			System.out.println();
		}
	}

}
