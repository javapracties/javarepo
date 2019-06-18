package com.carrental.api;

public class Vehicle {

	private Double totalCostWithoutDiscount = 0.0;
	private Double stdCost = 0.00;
	private Double additionalCharges = 0.00;
	private Double gasCharges = 0.00;
	private Double availableDiscounts = 0.0;

	public Vehicle(String model, String category, String serviceType, int passengers) {
		VehicleType vType = new VehicleType(model, serviceType);
		determineVehicleCharges(vType, category, passengers);
		setStdCost(15.0);
		setAvailableDiscounts(vType.getDiscount());
		setAdditionalCharges(vType.getAcCharges() + getGasCharges() + getAdditionalCharges());
		System.out.println("additional charges --" + getAdditionalCharges());
		setTotalCostWithoutDiscount(getStdCost() + getAdditionalCharges());
		System.out.println("total vehicle cost/KM--" + getTotalCostWithoutDiscount());

	}

	private void determineVehicleCharges(VehicleType vType, String category, int passengers) {
		getVehicleCategoryCharges(category);
		checkForExtraPassengers(vType.getSeatCapacity(), passengers);

	}

	public void getVehicleCategoryCharges(String category) {
		if (category.equalsIgnoreCase("Diesel")) {
			gasCharges = -1.0;
		}
	}

	private void checkForExtraPassengers(int seatCapacity, int passengers) {

		if (passengers > seatCapacity) {
			setAdditionalCharges(new Double((passengers - seatCapacity) * 1));
		}
	}

	public Double getStdCost() {
		return stdCost;
	}

	private void setStdCost(Double stdCost) {
		this.stdCost = stdCost;
	}

	public Double getAdditionalCharges() {
		return additionalCharges;
	}

	private void setAdditionalCharges(Double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public Double getGasCharges() {
		return gasCharges;
	}

	private void setGasCharges(Double gasCharges) {
		this.gasCharges = gasCharges;
	}

	public Double getAvailableDiscounts() {
		return availableDiscounts;
	}

	private void setAvailableDiscounts(Double availableDiscounts) {
		this.availableDiscounts = availableDiscounts;
	}

	public Double getTotalCostWithoutDiscount() {
		return totalCostWithoutDiscount;
	}

	private void setTotalCostWithoutDiscount(Double totalCostWithoutDiscount) {
		this.totalCostWithoutDiscount = totalCostWithoutDiscount;
	}

}
