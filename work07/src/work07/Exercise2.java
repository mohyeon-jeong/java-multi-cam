package work07;

public class Exercise2 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		t.setVolume(20);
		
		System.out.println("CH:" + t.getChannel());
		System.out.println("VOL:" + t.getVolume());
	}

}
