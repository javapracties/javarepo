package com.carrental.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import com.carrental.api.Vehicle;

public class VehicleTest {

	@Test
	public void testVehicle() {

		String model = "Swift";
		String category = "Petrol";
		String serviceType = "AC";
		int passengers = 4;
		Double dbl = new Double(2.0);

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(dbl, vehicle.getAdditionalCharges());
		assertNotNull(vehicle);

	}

	@Test
	public void testGetStdCost() {

		String model = "SUV";
		String category = "Petrol";
		String serviceType = "AC";
		int passengers = 10;

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(new Double(15.0), vehicle.getStdCost());
		assertNotSame(13.0, vehicle.getStdCost());
	}

	@Test
	public void testGetAdditionalCharges() {

		String model = "SUV";
		String category = "Petrol";
		String serviceType = "AC";
		int passengers = 10;

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(new Double(12.0), vehicle.getAdditionalCharges());
		assertNotSame(13.0, vehicle.getAdditionalCharges());

	}

	@Test
	public void testGetGasCharges() {

		String model = "SUV";
		String category = "Petrol";
		String serviceType = "AC";
		int passengers = 10;

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(new Double(12.0), vehicle.getAdditionalCharges());
		assertNotSame(13.0, vehicle.getAdditionalCharges());

	}

	@Test
	public void testGetAvailableDiscounts() {

		String model = "Bus";
		String category = "Desel";
		String serviceType = "AC";
		int passengers = 10;

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(new Double(2.0), vehicle.getAvailableDiscounts());
		assertNotSame(5.0, vehicle.getAvailableDiscounts());

	}

	@Test
	public void testGetTotalCostWithoutDiscount() {

		String model = "Bus";
		String category = "Desel";
		String serviceType = "AC";
		int passengers = 10;

		Vehicle vehicle = new Vehicle(model, category, serviceType, passengers);
		assertEquals(new Double(17.0), vehicle.getTotalCostWithoutDiscount());
		assertNotSame(5.0, vehicle.getTotalCostWithoutDiscount());

	}

}
