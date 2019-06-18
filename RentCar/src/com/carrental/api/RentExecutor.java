package com.carrental.api;

//Car rental application:

//A vehicle can be rented for a trip. Vehicle can be a SUV, car, van, bus, etc.
//The standard rate for a petrol vehicle for a standard trip is 15 Rs/Km.
//Additional 2 Rs/Km charge is applicable for AC vehicles. 
//Diesel vehicles cost a rupee less than standard rate.
//2% discount is applicable for bus on standard rate.
//Additional charges of 1 Rs/Km/Person are charged if number of passengers exceeds the max limit of a vehicle.
//Example distance:
//	Pune - Mumbai: 200 KM
//	Pune - Bangalore: 1000 KM
//	Mumbai - Delhi: 2050 KM
//	Mumbai - Chennai: 1234.5 KM

public class RentExecutor {
	Trip trip;

	public static void main(String args[]) {
		RentExecutor re = new RentExecutor();
		re.executor();
	}

	// Swift, Diesel, NON AC, Pune-Mumbai-Bangalore-Pune, 3 Passengers
	public void executor() {
			String model = "Swift";
			String category = "Diesel";
			String serviceType = "NON AC";
			String multipleDestinations = "Pune-Mumbai-Bangalore-Pune";
			int passengers = 3;

		Double distance = 0.0; 

		String[] splitString = multipleDestinations.split("-");
		for (int i = 0; i < splitString.length;) {
			distance = distance + new Trip().getDistance(splitString[i], splitString[i + 1]);
			i = i + 2;

		}
		System.out.println("total distance--" + distance);
		Vehicle vehicleData = new Vehicle(model, category, serviceType, passengers);

		Double totalTripCost = 0.00;		
		System.out.println("discounts percentage --" + vehicleData.getAvailableDiscounts());
		Double discountedPrice = ((distance * vehicleData.getTotalCostWithoutDiscount())
				* (vehicleData.getAvailableDiscounts() / 100));
		System.out.println("discounts Amount --" + discountedPrice);
		totalTripCost = (distance * vehicleData.getTotalCostWithoutDiscount()) - discountedPrice;
		System.out.println("totalTripCost--" + totalTripCost);

	}

}
