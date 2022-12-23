package springHW1;

public class Main {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		System.out.println("1번 버스객체 만들어짐!");
		Bus bus2 = new Bus();
		System.out.println("2번 버스객체 만들어짐!");
		bus1.passenger+=2;
		System.out.println("탑승 승객 수 = "+ bus1.passenger);
		System.out.println("잔여 승객 수 = "+(bus1.max_passenger-bus1.passenger));
		System.out.println("요금 확인 = "+bus1.fee*bus1.passenger);
		bus1.oiling-=50;
		System.out.println("주유량: "+bus1.oiling);
		bus1.status="차고지행";
		bus1.oiling+=10;
		System.out.println("상태: "+bus1.status);
		System.out.println("주유량: "+bus1.oiling);
		bus1.status="운행중";
		bus1.passenger+=45;
		if(bus1.passenger>bus1.max_passenger) {
			System.out.println("최대 승객 수를 초과했습니다.");
			bus1.passenger=0;
		}
		bus1.passenger+=5;
		System.out.println("탑승 승객 수 = "+bus1.passenger);
		System.out.println("잔여 승객 수 = "+(bus1.max_passenger-bus1.passenger));
		System.out.println("요금 확인 = "+bus1.fee*bus1.passenger);
		bus1.oiling-=55;
		System.out.println("주유량: "+bus1.oiling);
		if(bus1.oiling<=10) {
			System.out.println("주유가 필요합니다");
		}
		System.out.println("상태: "+bus1.status);
	}

}
