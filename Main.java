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
	}

}
