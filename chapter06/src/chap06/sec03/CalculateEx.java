package chap06.sec03;

//����3) �� ���ڸ� �Է� �޾� ������ ����� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
//�� ������ Ÿ���� [int, int], [int, double], [double,int], 
//[int,float]�̴�.
 
public class CalculateEx {

	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		int res1 = c1.add(100, 200);
		double res2 = c1.add(27.5, 50);
	}
}

class Calculate {
	public int add(int a, int b) {
		return (a+b);
	}
	
	public double add(int a, double b) {
		return (a+b);
	}
	
	public double add(double a, int b) {
		return (a+b);
	}
	
	public float add(int a, float b) {
		return (a+b);
	}
}