package sec01;

public class ExceptionEx02 {

	public static void main(String[] args) {
		try {
			throw new CustomException("���� ���� ���� Ŭ����");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}

//����� ���� ����Ŭ����
//	�Ϲݿ���Ŭ���� : Exception Ŭ������ ��� �޾� ����
//	���࿹��Ŭ���� : RuntimeException Ŭ������ ��� �޾� ����
class CustomException extends Exception {
	CustomException(){}
	CustomException(String message){
		super(message);
	}
} 