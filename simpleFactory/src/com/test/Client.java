package com.test;

import com.abstracts.IVehicle;
import com.concrets.SimpleFactory;

public class Client {
	public static void main(String[] args) {
		IVehicle car = SimpleFactory.getVehicle(1);
		IVehicle plane = SimpleFactory.getVehicle(2);

		System.out.println(car.getName());
		System.out.println(plane.getName());
		
	}
}
