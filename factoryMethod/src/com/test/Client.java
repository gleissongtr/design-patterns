package com.test;

import com.abstracts.IVehicle;
import com.abstracts.IVehicleFactory;
import com.concrets.CarFactory;
import com.concrets.PlaneFactory;

public class Client {
	public static void main(String[] args) {
		IVehicleFactory factoryCar = new CarFactory();
		IVehicleFactory factoryPlane = new PlaneFactory();

		IVehicle car = factoryCar.getVehicle();
		IVehicle plane = factoryPlane.getVehicle();
		
		System.out.println(car.getName());
		System.out.println(plane.getName());
		
	}
}
