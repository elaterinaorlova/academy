package by.academy.finish.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class AirlineCompany {

	private String name;
	private ArrayList<Airplane> airplanes;

	public AirlineCompany() {
	}

	public AirlineCompany(String name, ArrayList<Airplane> airplanes) {
		this.name = name;
		this.airplanes = airplanes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setFleet(ArrayList<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	@Override
	public String toString() {
		return "Airline{" + "name='" + name + '\'' + ", airplanes=" + airplanes + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof AirlineCompany airline))
			return false;
		return name.equals(airline.name) && airplanes.equals(airline.airplanes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, airplanes);
	}

	public void airlineCompanyCapacity() {
		int passengers = 0;
		int loads = 0;

		for (Airplane airplane : airplanes) {
			passengers += airplane.getPassengerCapacity();
			loads += airplane.getLoadCapacity();
		}
		System.out.println("Passenger capacity : " + passengers + "Load capacity : " + loads);
	}

	public void sortAirplanesFlightDistance() {
		airplanes.sort(Comparator.comparing(Airplane::getFlightDistance));
		System.out.println(airplanes);
	}

	public void fuelConsumption(int minFuelConsumption, int maxFuelConsumption) {
		System.out.println("There are such airplanes under this range of fuel consumption:");
		int count = 1;
		for (Airplane airplane : airplanes) {
			if (minFuelConsumption <= airplane.getFuelConsumption()
					&& maxFuelConsumption >= airplane.getFuelConsumption()) {
				System.out.println(count + ": " + airplane);
				count++;
			}
		}
	}

	public void airplanesHierarchy(int distance, int passengerCapacity) {
		ArrayList<Airplane> airplanesHierarchy = new ArrayList<>();
		for (Airplane airplane : airplanes) {
			if (airplane.getFlightDistance() >= distance && airplane.getPassengerCapacity() >= passengerCapacity) {
				airplanesHierarchy.add(airplane);
			}
		}
		airplanesHierarchy.sort(Comparator.comparing(Airplane::getFuelConsumption));
		System.out.println("Hierarchy of airplanes on your parametrs \"flight distance\" and \"passengerCapacity\"  ");
		int count = 1;
		for (Airplane airplane : airplanesHierarchy) {
			System.out.println(count + ": " + airplane.toString());
			count++;
		}
	}
}
