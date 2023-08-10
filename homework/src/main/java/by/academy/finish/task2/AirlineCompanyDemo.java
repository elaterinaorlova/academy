package by.academy.finish.task2;

import java.util.ArrayList;

public class AirlineCompanyDemo {

	public static void main(String[] args) {

		ArrayList<Airplane> airplanes = new ArrayList<>();
		AirlineCompany airline = new AirlineCompany("AirBaltic", airplanes);

		airplanes.add(Airplane.setAirplane(Brand.BOEING, "12345"));
		airplanes.add(Airplane.setAirplane(Brand.TUPOLEV, "2345"));
		airplanes.add(Airplane.setAirplane(Brand.BOMBARDIER, "3456"));
		airplanes.add(Airplane.setAirplane(Brand.YAKOVLEV, "6789"));
		airplanes.add(Airplane.setAirplane(Brand.BOEING, "78912"));

		for (Airplane a : airplanes) {
			System.out.println(a);
		}
		airline.airlineCompanyCapacity();
		airline.sortAirplanesFlightDistance();
		airline.fuelConsumption(50, 200);

	}

}
