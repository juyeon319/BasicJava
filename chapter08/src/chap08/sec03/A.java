package chap08.sec03;

interface I {
	public void methodB();
}

//사용자
public class A { //사용자
	public void methodA(I i) {
		i.methodB();
	}
}

//제공자
class B implements I { //제공자
	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
}