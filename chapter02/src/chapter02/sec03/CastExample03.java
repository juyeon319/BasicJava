package chapter02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
	//����1: 1���� 365.2422���̴�.�� �ڷ�� 
	//"1���� 365�� xx�ð� xx�� xx�� �̴�"�� ����ϵ��� ���α׷� �Ͻÿ�.
	
	double year = 365.2422;
	int hourPerDay = 24;
	int minPerHour = 60;
	int secPerMin = 60;
	
	int day = (int)(year);
	int s = (int)((year-day) * hourPerDay * minPerHour * secPerMin);
	int h = s/(minPerHour * secPerMin);
	s%=(minPerHour * secPerMin);
	int m = s/secPerMin;
	s%=secPerMin;
	
	System.out.printf("1���� %d�� %d�ð� %d�� %d�� �̴�.", day, h, m, s);
	
	
	
	
	}
}
