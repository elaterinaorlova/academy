package by.academy.finish.task2;

import java.util.Objects;

public class Airplane {

	private Brand brand;
	private Type type;
	private String number;
	private int averageSpeed;
	private int flightDistance;
	private int fuelConsumption;
	private int passengerCapacity;
	private int loadCapacity;

	public Airplane() {
	}

	public Airplane(Brand brand, Type type, String number, int averageSpeed, int flightDistance, int fuelConsumption,
			int passengerCapacity, int loadCapacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.number = number;
		this.averageSpeed = averageSpeed;
		this.flightDistance = flightDistance;
		this.fuelConsumption = fuelConsumption;
		this.passengerCapacity = passengerCapacity;
		this.loadCapacity = loadCapacity;
	}

	public Airplane(Type type, String number, int averageSpeed, int flightDistance, int fuelConsumption,
			int passengerCapacity, int loadCapacity) {
		super();
		this.type = type;
		this.number = number;
		this.averageSpeed = averageSpeed;
		this.flightDistance = flightDistance;
		this.fuelConsumption = fuelConsumption;
		this.passengerCapacity = passengerCapacity;
		this.loadCapacity = loadCapacity;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(int averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public int getFlightDistance() {
		return flightDistance;
	}

	public void setFlightDistance(int flightDistance) {
		this.flightDistance = flightDistance;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(averageSpeed, brand, flightDistance, fuelConsumption, loadCapacity, number,
				passengerCapacity, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return averageSpeed == other.averageSpeed && brand == other.brand && flightDistance == other.flightDistance
				&& fuelConsumption == other.fuelConsumption && loadCapacity == other.loadCapacity
				&& Objects.equals(number, other.number) && passengerCapacity == other.passengerCapacity
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "Airplane [brand=" + brand + ", type=" + type + ", number=" + number + ", averageSpeed=" + averageSpeed
				+ ", flightDistance=" + flightDistance + ", fuelConsumption=" + fuelConsumption + ", passengerCapacity="
				+ passengerCapacity + ", loadCapacity=" + loadCapacity + "]";
	}

	public static Airplane setAirplane(Brand brand, String number) {

		switch (brand) {
		case ANTONOV:
			return new Airplane(brand, Type.BIPLANE, number, 500, 20000, 100, 0, 200);
		case BOEING:
			return new Airplane(brand, Type.PASSENGER, number, 2000, 50000, 200, 1000, 510);
		case TUPOLEV:
			return new Airplane(brand, Type.PASSENGER, number, 2000, 30000, 200, 500, 2000);
		case BOMBARDIER:
			return new Airplane(brand, Type.MILITARY, number, 1500, 40000, 300, 0, 30000);
		case YAKOVLEV:
			return new Airplane(brand, Type.CARGO, number, 1000, 890, 10000, 50, 500);
		default:
			throw new IllegalArgumentException("There is no such brand");
		}
	}

}