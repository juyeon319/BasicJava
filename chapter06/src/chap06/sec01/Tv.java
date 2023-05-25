package chap06.sec01;

//main메서드를 실행시켰을 때 
//제조회사, 생산년도, 크기를 출력하는 Tv 클래스를 작성하시오.
public class Tv {
	String tvMaker;
	int year;
	String tvSize;
	
	public void showTvInfor() {
		System.out.println("=======================");
		System.out.println("제조회사    생산년도     크기");
		System.out.println("=======================");
		System.out.printf("%5s   %5d   %6s", tvMaker, year, tvSize);
	}
}