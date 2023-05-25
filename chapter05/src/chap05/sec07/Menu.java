package chap05.sec07;

public enum Menu {
	Member_SignUp(1), 
	Member_Update(2), 
	Member_Delete(3);
	
	private final int value;
	
	Menu(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}
