package com.carrental.api;

public class VehicleType {

	private boolean IsACApplicable = false;
	private Double discount = 0.0;
	private Double acCharges = 0.0;
	private int seatCapacity = 0;
	// Swift, NON AC

	public VehicleType(String model, String serviceType) {
		serviceTypeCheck(serviceType);
		determineSeatCapacity(model);

	}

	private void serviceTypeCheck(String serviceType) {
		if (serviceType.equalsIgnoreCase("AC")) {
			setIsACApplicable(true);
			acCharges = 2.0;
		}

	}

	private void determineSeatCapacity(String model) {
		seatCapacity = retrieveSeatBasedOnVehicleType(retrieveModelType(model));

	}

	public String retrieveModelType(String model) {
		switch (model = model.toLowerCase()) {
		case "swift":
			return "car";
		case "innova":
			return "suv";
		case "van":
			return "van";
		case "bus":
			return "bus";
		default:
			return "none";
		}
	}

	public int retrieveSeatBasedOnVehicleType(String type) {
		switch (type) {
		case "car":
			return 4;
		case "suv":
			return 7;
		case "van":
			return 15;
		case "bus": {
			setDiscount(2.0);
			return 30;
		}
		default:
			return 0;
		}

	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public boolean isIsACApplicable() {
		return IsACApplicable;
	}

	public void setIsACApplicable(boolean isACApplicable) {
		IsACApplicable = isACApplicable;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getAcCharges() {
		return acCharges;
	}

	public void setAcCharges(Double acCharges) {
		this.acCharges = acCharges;
	}

}
