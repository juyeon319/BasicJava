package chap05.sec06;

public class ObjectArrayEx {

	public static void main(String[] args) {
//	Books[] book = new Books[3];
//	book[0] = new Books("왕초보 영어", "EBS", 15000);
//	book[1] = new Books("경제 입문학", "박정호", 30000);
//	book[2] = new Books("소크라테스 변론", "김유원", 10000);
		
		Books[] book = {new Books("왕초보 영어", "EBS", 15000),
						new Books("경제 입문학", "박정호", 30000),
						new Books("소크라테스 변론", "김유원", 10000)
							};
	
	System.out.println("-------------------------------------");
	for(Books b : book) {
		System.out.println(b);
		System.out.println("-------------------------------------");
		}
	}
}

class Books {
	private String title;
	private String writer;
	private int price;
	
	public Books() {}
	public Books(String title, String writer, int price) {
		this.title=title;
		this.writer=writer;
		this.price=price;
	} 
	
	//재정의
	@Override
	public String toString() {
		return "책이름 : " + title + "\n저자 : " + writer + 
				"\n가격 : " + price;
	}
}