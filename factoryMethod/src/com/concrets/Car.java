package com.concrets;

import com.abstracts.IVehicle;

public class Car implements IVehicle{

	@Override
	public String getName() {
		return this.getClass().getName();
	}

}
