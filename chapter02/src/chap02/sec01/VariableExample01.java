package chap02.sec01;

public class VariableExample01 {

	public static void main(String[] args) {
		Variable02 var2 = new Variable02();
		var2 = new Variable02();
		System.out.println(var2.value1);
	}
}

class Variable02 {
	int value1;
}
