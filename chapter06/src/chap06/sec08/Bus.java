package chap06.sec08;

public class Bus extends Vehicle{

	int Passenger;
	
	Bus(int Passenger){
		this.Passenger=Passenger;
	}
	
	@Override
	public void run() {
		System.out.println("승객 "+Passenger+"명을 태운 버스가 운행 중 입니다.");
	} 
}
