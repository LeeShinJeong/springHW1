package springHW1;

public class Taxi extends PublicTransport{
	String destination;
	int passenger=0;
	int distance;
	int max_passenger=4;
	int basic_fare=3000;
	int per_fare=1000;
	int basic_distance=1;
	int oiling=100;
	String status="일반";
	int speed=0;
	int fare=0,sum_fare=0;
	
	{
		System.out.println(num+"번 택시 생성");
		System.out.println("주유량 ="+oiling);
		System.out.println("상태 = "+ status);
	}
	
	public void setPassenger(int passenger) {
		if(status!="일반") {
			System.out.println("탑승 불가");
		}
		if(passenger<=4) {
		this.passenger=passenger;
		status="운행 중";
		}
		
		else if(passenger>4) {
			System.out.println("최대 승객 수 초과");
			this.passenger=0;
		}
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public void setDistance(int distance) {

		this.distance=distance;
	}

	public void getStatus(){
		System.out.println("탑승 승객 수 = "+ passenger);
		System.out.println("잔여 승객 수 = "+passenger);
		System.out.println("기본요금 확인 = "+basic_fare);
		System.out.println("목적지 = "+ destination);
		System.out.println("목적지까지 거리 = "+ distance + "km");
		fare=basic_fare+per_fare*(distance-basic_distance);
		System.out.println("지불할 요금 = "+ fare);
		System.out.println("상태 = "+ status);
	}
	
	public void subtractOiling(int oiling) {
		this.oiling-=oiling;
	}
	
	public void pay() {
		sum_fare+=fare;
		status="일반";
	}
	
	public void print_pay() {
		System.out.println("주유량 = "+ oiling);
		System.out.println("누적 요금 = "+sum_fare);
		if(oiling<10) {
			System.out.println("주유 필요");
			status="운행불가";
			System.out.println("상태 = "+ status);
		}
		
	}
	
	public void addSpeed(int speed) {
		this.speed+=speed;
	}
	
	public void subtractSpeed(int speed) {
		this.speed-=speed;
	}

}
