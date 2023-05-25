package chap05.sec07;

public class Controller {
	
	public static void main(String[] args) {
		Menu[] m1 = Menu.values();
		for(int i=0; i<m1.length; i++) {
			System.out.println(m1[i]);
		}
		
		for(Menu m : Menu.values()) {
			System.out.print(m+"(");
			System.out.println(m.getValue()+")");
		}
	}
}
