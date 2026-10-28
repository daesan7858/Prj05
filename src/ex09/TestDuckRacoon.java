package ex09;

// class 는 다중삭속 불가능
// interface 를 이용하여 다중상속을 구현한다

// class 다중상속 : c++ 만 가능, java 랑 c# 은 안됨
// 오리너구리 class = 오리 class + 너구리 class
class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

// interface 
// 모든 함수가 abstract 일 때 해당클래스 interface 로 표현가능하다( 함수의 abstract 생략가능 )
/*
abstract class Sachic {
	abstract int add(int v1, int v2);
	abstract int sub(int v1, int v2);
	abstract int mul(int v1, int v2);
	abstract int div(int v1, int v2);
}
    		 위 == 아래
interface Sachic {
	int add(int v1, int v2);
	int sub(int v1, int v2);
	int mul(int v1, int v2);
	int div(int v1, int v2);
} 
*/
interface Racoon {
	void dig();
}

// java extends 뒤에는 한 개의 class 만 사용가능 - 한 개만 상속가능
class DuckRacoon extends Duck implements Racoon {   // extends 는 콤마 붙여서 2개 이상 못 붙임

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.dig();
		dr.swim();

	}

}

/*
	먼저 Duck 클래스를 만들고, Racoon 클래스는 interface 로 만들어서
	1. DuckRacoon 클래스가 Duck에게 상속받고 (extends)
	2. Racoon의 abstract 짬처리를 받게 만들어서  (abstract -> interface)
	이중상속과 비슷하게 처리
 */
