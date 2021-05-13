package di.xml.n01;

public class HankookTire implements Tire {

	public HankookTire() {
		System.out.println("한국타이어 생성....");
	}

	public String getBrand() {
		return "한국타이어";
	}
}
