package chap11.sec01;

//StringBuffer, StringBuilder : String 클래스의 단점(immutable)을 보완한 클래스
//append() 메서드를 이용하여 저장된 문자열 끝에 새로운 문자열 추가 가능
//연산 후 toString()를 이용하여 문자열(String) 타입으로 변환

public class StringBufferEx {
	
	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer();
		 StringBuffer sb1 = new StringBuffer("select * from member where mem_id = ? ");
		 sb.append("select * \n ");
		 sb.append("   from member \n ");
		 sb.append(" where mem_id = ? ");
		 
		 String str = sb.toString();
		 System.out.println(str);
	}
}
