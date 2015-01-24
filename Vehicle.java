package com.wiley.trans;
public class Vehicle
{
	public String make, model;
	public int year;
	public double purchasePrice;
	public Vehicle(String make, String model, int year)
	{
		System.out.println("Constructing Vehicle");
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public double sellVehicle(double sellPrice)
	{
		System.out.println("Selling " + this.toString());
		return purchasePrice - sellPrice;
	}
	public String toString()
	{
		return year + " " + make + " " + model;
	}
}

