package chap06.sec05;

public class ProductEx {

	public static void main(String[] args) {
		Product p1 = new Product("볼펜");
		System.out.println(p1);
		
		Product p2 = new Product("지우개");
		System.out.println(p2);
		
		Product p3 = new Product("포스트잇");
		System.out.println(p3);
	}
}

//상품코드는 1001부터 자동생성되어 pid에 저장
class Product {
	static long pid=1000;
	String pName;
	
	Product(){}
	//상품코드는 자동생성되기 때문에 상품명만
	Product(String pName){
		pid++;
		this.pName=pName;
	}
	
	@Override
	public String toString() {
		return "제품번호 : " + pid + "\n제품명 : " + pName;
	}
}
