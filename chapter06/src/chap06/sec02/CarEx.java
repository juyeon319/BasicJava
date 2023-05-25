package chap06.sec02;

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCompany("르노 자동차");
		c1.setAuto(true);
		System.out.println(c1);
	}
}

class Car {
	private String company;
	private boolean isAuto;
	
	Car(){}
	Car(String company) {
		this.company=company;
		this.isAuto=isAuto;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	@Override
	public String toString() {
		String gearType = "";
		if(isAuto) {
			gearType = "자동";
		} else {
			gearType = "수동";
		}
		return gearType;
	}
}