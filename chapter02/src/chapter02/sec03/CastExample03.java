package chapter02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
	//문제1: 1년은 365.2422일이다.이 자료로 
	//"1년은 365일 xx시간 xx분 xx초 이다"를 출력하도록 프로그램 하시오.
	
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
	
	System.out.printf("1년은 %d일 %d시간 %d분 %d초 이다.", day, h, m, s);
	
	
	
	
	}
}
