package springHW1;

public class Main {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		
		bus1.addPassenger(2);
		bus1.getStatus();
		
		bus1.subtractOiling(50);
		bus1.setStatus("차고지행");
		bus1.addOiling(10);
		bus1.setStatus("운행");
		
		bus1.addPassenger(45);

		bus1.addPassenger(5);
		bus1.getStatus();

		bus1.subtractOiling(55);
		
		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();
		
		taxi1.setPassenger(2);
		taxi1.setDestination("서울역");
		taxi1.setDistance(2);
		taxi1.getStatus();
		
		taxi1.subtractOiling(80);
		taxi1.pay();
		taxi1.print_pay();
		
		taxi1.setPassenger(5);
		
		taxi1.setPassenger(3);
		taxi1.setDestination("구로디지털단지역");
		taxi1.setDistance(12);
		taxi1.getStatus();
		
		taxi1.subtractOiling(20);
		taxi1.pay();
		taxi1.print_pay();
	}

}
