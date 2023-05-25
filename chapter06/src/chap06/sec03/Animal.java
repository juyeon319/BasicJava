package chap06.sec03;

//예제1) 동물의 종류(kind)를 보관하는 멤버 필드가 있는 동물클래스(Animal)를 생성하고,
//생성자메서드를 통한 동물의 종류 설정과 동물의 종류를 변경할 수 있는 메서드 및 종류를 봔한하는 메서드 작성	

public class Animal {
	//외부에서 접근할 수 없다
	private String kind;
	
	//기본 생성자
	Animal(){
		this("호랑이");
	} 
	
	Animal(String kind){
		this.kind=kind;
	}
	
	public void setKind(String kind) {
		this.kind=kind;
	}
	
	//특정 값 하나만 반환할 때는 : getter
	//문자열 전체 반환 : toString
	public String getkind() {
		return kind;
	}
}
