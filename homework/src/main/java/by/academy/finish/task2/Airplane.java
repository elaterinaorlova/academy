package by.academy.finish.task2;

public class Airplane extends Aircraft {

	private Wings wings;

	public Airplane() {
	}

	Airplane(Brand brand, Type type, String number, int averageSpeed, int flightDistance, int fuelConsumption,
			int passengerCapacity, int loadCapacity, Wings wings) {
		super(brand, type, number, averageSpeed, flightDistance, fuelConsumption, passengerCapacity, loadCapacity);
		this.wings = wings;
	}

	public Wings getWings() {
		return wings;
	}

	public void setWings(Wings wings) {
		this.wings = wings;
	}

	@Override
	public String toString() {

		return "Airplane: " + super.toString();
	}

	public static Airplane setAirplane(Brand brand, String number) {

		switch (brand) {
		case ANTONOV:
			return new Airplane(brand, Type.BIPLANE, number, 500, 20000, 100, 0, 200, Wings.SMALL_WING);
		case BOEING:
			return new Airplane(brand, Type.PASSENGER, number, 2000, 10000, 200, 1000, 510, Wings.LARGE_WING);
		case TUPOLEV:
			return new Airplane(brand, Type.PASSENGER, number, 2000, 30000, 200, 500, 2000, Wings.SMALL_WING);
		case BOMBARDIER:
			return new Airplane(brand, Type.MILITARY, number, 1500, 40000, 300, 0, 30000, Wings.SMALL_WING);
		case YAKOVLEV:
			return new Airplane(brand, Type.CARGO, number, 1000, 890, 10000, 50, 500, Wings.LARGE_WING);
		default:
			throw new IllegalArgumentException("There is no such brand");
		}
	}

}