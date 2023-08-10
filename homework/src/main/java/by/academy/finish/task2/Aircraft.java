package by.academy.finish.task2;

import java.util.Objects;

public class Aircraft {

	private Brand brand;
	private Type type;
	private String number;
	private int averageSpeed;
	private int flightDistance;
	private int fuelConsumption;
	private int passengerCapacity;
	private int loadCapacity;

	public Aircraft() {
		super();

	}

	Aircraft(Brand brand, Type type, String number, int averageSpeed, int flightDistance, int fuelConsumption,
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
		Aircraft other = (Aircraft) obj;
		return averageSpeed == other.averageSpeed && brand == other.brand && flightDistance == other.flightDistance
				&& fuelConsumption == other.fuelConsumption && loadCapacity == other.loadCapacity
				&& Objects.equals(number, other.number) && passengerCapacity == other.passengerCapacity
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", type=" + type + ", number=" + number + ", averageSpeed=" + averageSpeed
				+ ", flightDistance=" + flightDistance + ", fuelConsumption=" + fuelConsumption + ", passengerCapacity="
				+ passengerCapacity + ", loadCapacity=" + loadCapacity;
	}

}
