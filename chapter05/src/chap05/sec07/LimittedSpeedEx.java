package chap05.sec07;

import java.util.Scanner;

public class LimittedSpeedEx {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ������");
		System.out.println("2. �ó� ����");
		System.out.println("3. �ÿ� ����");
		System.out.println("---------------------");
		System.out.print("��ȣ �Է� : ");
		int num = sc.nextInt();
	
		if(num == 1) {
			str = "SchoolZone";
		} else if(num == 2) {
			str = "Downtown";
		} else if(num == 3) {
			str = "ContrySide";
		} else {
			System.out.println("�۾���ȣ �Է� ����");
			System.exit(0);
		}
		
		LimitedSpeed limitedSpeed = LimitedSpeed.valueOf(str);
		switch (limitedSpeed) {
		case SchoolZone:
			System.out.println(limitedSpeed.getValues()+"km ������ �ӵ��� �����ؾ� �մϴ�...");
			break;
		case Downtown:
			System.out.println(limitedSpeed.getValues()+"km ������ �ӵ��� �����ؾ� �մϴ�...");
			break;
		case ContrySide:
			System.out.println(limitedSpeed.getValues()+"km ������ �ӵ��� �����ؾ� �մϴ�...");
		}
	}
}
