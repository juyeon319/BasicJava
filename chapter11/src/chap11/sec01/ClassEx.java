package chap11.sec01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

//Class : 클래스의 정보 반환
public class ClassEx {

	public static void main(String[] args) throws Exception{
		Class c1 = Member.class;
		Class c2 = Byte.class;
		
//		System.out.println("클래스 이름 : "+c2.getName());
//		System.out.println("클래스이름(약칭) : "+c2.getSimpleName());
//		System.out.println("소속 패키지명 : "+c2.getPackage());
		
		//생성자메서드 - 배열로 반환
		Constructor[] constructors = c1.getConstructors();
		Member member = null;
		for(Constructor c : constructors) {
			member=(Member)c.newInstance("1");
			System.out.println(member.getModifiers());
		}
		
		//멤버필드 - 배열로 반환
		Field[] fields = c1.getFields(); //public field 만 반환
		Field[] fieldInher = c1.getDeclaredFields(); //상속 받은 필드만 반환
		for(Field field : fields) {
			System.out.println("필드명 : " + field.getName());
			System.out.println("필드타입 : " + field.getType());
		}
		
		//메서드 - 배열로 반환
		Method[] methods = c1.getDeclaredMethods(); //상속 받은 메서드 제외한 메서드 반환 
		
		for(Method method : methods) {
			System.out.println("메서드명 : " + method.getName());
			System.out.println("반환타입 : " + method.getReturnType());
		}
	}
}
