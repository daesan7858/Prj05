package ex10;
// interface 인걸 알 수 있도록 이름 앞에 I를 쓰는데, C++ 하던 놈들은 able 을 붙이더라~
interface IDuck {
	void swim();
}
interface IRacoon {
	void dig();
}

class DuckRacoon implements IDuck, IRacoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다");
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		
		dr.swim();
		dr.dig();

	}

}
