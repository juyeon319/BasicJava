package chap06.sec08;

public class Bus extends Vehicle{

	int Passenger;
	
	Bus(int Passenger){
		this.Passenger=Passenger;
	}
	
	@Override
	public void run() {
		System.out.println("�°� "+Passenger+"���� �¿� ������ ���� �� �Դϴ�.");
	} 
}
