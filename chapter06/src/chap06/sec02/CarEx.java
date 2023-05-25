package chap06.sec02;

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCompany("���� �ڵ���");
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
			gearType = "�ڵ�";
		} else {
			gearType = "����";
		}
		return gearType;
	}
}