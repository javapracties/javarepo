package com.carrental.api.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.carrental.api.Trip;

public class TripTest { 

	@Test
	public void testGetDistance() {

		Trip trip = new Trip();
		String tri = trip.getDestination();
		assertEquals(tri, trip.getDestination());
		assertNotSame("distance", trip.getDestination());

	}

	@Test
	public void testSetDistance() {

		Trip trip = new Trip();
		trip.setDistance(1000);
		assertEquals(1000, trip.getDistance());
		assertNotSame(2000, trip.getDistance());

	}

	@Test
	public void testGetDestination() {

		Trip trip = new Trip();
		trip.setDestination("Pune-Mumbai-Bangalore-Pune");
		assertEquals("Pune-Mumbai-Bangalore-Pune", trip.getDestination());
		assertNotSame("Pune-Mumbai", trip.getDestination());

	}

	@Test
	public void testSetDestination() {

		Trip trip = new Trip();
		trip.setDestination("Pune-Mumbai-Bangalore-Pune");
		assertEquals("Pune-Mumbai-Bangalore-Pune", trip.getDestination());
		assertNotSame("Pune-Mumbai", trip.getDestination());

	}

	@Test
	public void testGetSource() {

		Trip trip = new Trip();
		trip.setSource("Bangalore");
		assertEquals("Bangalore", trip.getSource());
		assertNotSame("Mumbai", trip.getSource());

	}

	@Test
	public void testSetSource() {

		Trip trip = new Trip();
		trip.setSource("Bangalore");
		assertEquals("Bangalore", trip.getSource());
		assertNotSame("Mumbai", trip.getSource());

	}

	@Test
	public void testGetDistanceStringString() {

		Trip trip = new Trip();
		assertEquals(new Double(1000.0), trip.getDistance("Pune", "Bangalore"));
		assertEquals(new Double(0.0), trip.getDistance("Hyderabad", "Vizag"));
	}

}
