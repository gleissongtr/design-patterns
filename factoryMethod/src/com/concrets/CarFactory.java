package com.concrets;

import com.abstracts.IVehicle;
import com.abstracts.IVehicleFactory;

public class CarFactory implements IVehicleFactory{

	@Override
	public IVehicle getVehicle() {
		return new Car();
	}

}
