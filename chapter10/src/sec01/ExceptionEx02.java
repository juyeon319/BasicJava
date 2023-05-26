package sec01;

public class ExceptionEx02 {

	public static void main(String[] args) {
		try {
			throw new CustomException("내가 만든 예외 클래스");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}

//사용자 정의 예외클래스
//	일반예외클래스 : Exception 클래스를 상속 받아 생성
//	실행예외클래스 : RuntimeException 클래스를 상속 받아 생성
class CustomException extends Exception {
	CustomException(){}
	CustomException(String message){
		super(message);
	}
} 