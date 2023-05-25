package chap06.sec06;

import java.util.Scanner;

public class MemberService {
	private Member member;
	private Scanner scanner;

	public MemberService() {
		member = new Member("È«±æµ¿", "a001", "1234", 30);
		scanner = new Scanner(System.in);
	}

	public boolean login(String id, String passwd) {
		System.out.print("id: ");
		String pid = scanner.nextLine();

		System.out.print("password: ");
		String pwd = scanner.nextLine();

		if (pid.equals(id) && pwd.equals(passwd)) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		System.out.println(id + "´ÔÀÌ ·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù....");
	}
}
