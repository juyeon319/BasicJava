package chap06.sec01;

//예제4) 제품번호, 제품명, 제조회사, 가격 정보를 가지고있고 제품정보를 출력할 수 있는
//제품 클래스(Products)를 생성하시오.
public class Products {

	String prodno;
	String prodname;
	String prodmaker;
	String prodprice;
	
	public void proddata() {
		System.out.println("제품번호 : " + prodno);
		System.out.println("제품명 : " + prodname);
		System.out.println("제조사 : " + prodmaker);
		System.out.println("가격 : " + prodprice);
	}
}
