package chap06.sec06;

public class Controller {
	public static void main(String[] args) {
		new Controller().controller();
	}

	// 로그인 메서드 호출
	public void controller() {
		MemberService memberService = new MemberService();
		Member member = new Member("홍길동", "a001", "1234", 30);
		boolean result = memberService.login(member.getId(), member.getPasswd());
		if (result) {
			System.out.println(member.getId() + "님이 로그인 했습니다.");
		} else {
			System.out.println("id나 혹은 password를 잘못 입력했습니다.");
		}
	}
}
