package com.concrets;

import com.abstracts.IVehicle;

public class SimpleFactory {

	public static IVehicle getVehicle(int type) {
		switch (type) {
		case 1:
			return new Car();
		case 2:
			return new Plane();
		default:
			return new IVehicle() {
				@Override
				public String getName() {
					return this.getClass().getName();
				}
			};
		}
	}

}
