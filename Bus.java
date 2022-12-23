package springHW1;

public class Bus extends PublicTransport {
	
		int passenger=0,max_passenger=30,fare=1000;
		String status="운행";
		
		{
			System.out.println(num+"번 버스객체 만들어짐!");
		}
		
		public void getStatus(){
			System.out.println("탑승 승객 수 = "+ this.passenger);
			System.out.println("잔여 승객 수 = "+(this.max_passenger-this.passenger));
			System.out.println("요금 확인 = "+this.fare*this.passenger);
		} 
		
		public void setStatus(String status) {
			this.status=status;
		}
		
		public void addPassenger(int passenger) {
			if(this.passenger<=max_passenger&&this.status=="운행") {
			this.passenger+=passenger;
			if(this.passenger>max_passenger) {
				this.passenger-=passenger;
				System.out.println("최대 승객 수 초과");
			}
			}
		}
		
		public void addSpeed(int speed) {
			this.speed+=speed;
		}
		
		public void subtractSpeed(int speed) {
			this.speed-=speed;
		}
		public void addOiling(int oiling) {
			this.oiling+=oiling;
			System.out.println("주유량: "+this.oiling);
			System.out.println("상태: "+status);
		}
		public void subtractOiling(int oiling) {
			this.oiling-=oiling;
			System.out.println("주유량: "+this.oiling);
			if(this.oiling<10) {
				System.out.println("주유 필요");
				status="차고지행";
			}
			System.out.println("상태: "+status);
		}
		

}
