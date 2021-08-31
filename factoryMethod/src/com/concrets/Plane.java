package com.concrets;

import com.abstracts.IVehicle;

public class Plane implements IVehicle{

	@Override
	public String getName() {
		return this.getClass().getName();
	}

}
