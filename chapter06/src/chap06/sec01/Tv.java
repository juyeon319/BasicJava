package chap06.sec01;

//main�޼��带 ��������� �� 
//����ȸ��, ����⵵, ũ�⸦ ����ϴ� Tv Ŭ������ �ۼ��Ͻÿ�.
public class Tv {
	String tvMaker;
	int year;
	String tvSize;
	
	public void showTvInfor() {
		System.out.println("=======================");
		System.out.println("����ȸ��    ����⵵     ũ��");
		System.out.println("=======================");
		System.out.printf("%5s   %5d   %6s", tvMaker, year, tvSize);
	}
}