package com.carrental.api.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.carrental.api.VehicleType;

public class VehicleTypeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testVehicleType() {
		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
	}

	@Test
	public void testGetSeatCapacity() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setSeatCapacity(4);
		assertEquals(4, vehicleType.getSeatCapacity());
		assertNotSame(5, vehicleType.getSeatCapacity());

	}

	@Test
	public void testSetSeatCapacity() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setSeatCapacity(4);
		assertEquals(4, vehicleType.getSeatCapacity());
		assertNotSame(5, vehicleType.getSeatCapacity());

	}

	@Test
	public void testIsIsACApplicable() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setIsACApplicable(true);
		;
		assertEquals(true, vehicleType.isIsACApplicable());
		assertNotSame(false, vehicleType.isIsACApplicable());
	}

	@Test
	public void testSetIsACApplicable() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setIsACApplicable(false);
		assertEquals(false, vehicleType.isIsACApplicable());
		assertNotSame(true, vehicleType.isIsACApplicable());
	}

	@Test
	public void testGetDiscount() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setDiscount(2.0);
		assertEquals(new Double(2.0), vehicleType.getDiscount());
		assertNotSame(new Double(7.0), vehicleType.getDiscount());
	}

	@Test
	public void testSetDiscount() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setDiscount(2.0);
		assertEquals(new Double(2.0), vehicleType.getDiscount());
		assertNotSame(new Double(7.0), vehicleType.getDiscount());
	}

	@Test
	public void testGetAcCharges() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setAcCharges(5.0);
		assertEquals(new Double(5.0), vehicleType.getAcCharges());
		assertNotSame(new Double(7.0), vehicleType.getAcCharges());
	}

	@Test
	public void testSetAcCharges() {

		VehicleType vehicleType = new VehicleType("Swift", "Petrol");
		vehicleType.setAcCharges(5.0);
		assertEquals(new Double(5.0), vehicleType.getAcCharges());
		assertNotSame(new Double(7.0), vehicleType.getAcCharges());
	}

	@Test
	public void testRetrieveModelType() {

		VehicleType vehicleType = new VehicleType("swift", "Petrol");

		assertEquals("car", vehicleType.retrieveModelType("Swift"));
		assertEquals("suv", vehicleType.retrieveModelType("innova"));
		assertEquals("van", vehicleType.retrieveModelType("van"));
		assertEquals("bus", vehicleType.retrieveModelType("bus"));
		assertEquals("none", vehicleType.retrieveModelType("none"));

	}
	@Test
	public void testRetrieveSeatBasedOnVehicleType() {
		
		VehicleType vehicleType = new VehicleType("swift", "Petrol");
		assertEquals(4, vehicleType.retrieveSeatBasedOnVehicleType("car"));
		assertEquals(7, vehicleType.retrieveSeatBasedOnVehicleType("suv"));
		assertEquals(15, vehicleType.retrieveSeatBasedOnVehicleType("van"));
		assertEquals(30, vehicleType.retrieveSeatBasedOnVehicleType("bus"));
	}

}
