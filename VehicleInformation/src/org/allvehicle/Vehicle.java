package org.allvehicle;

import org.twowheeler.*;
import org.threewheeler.*;
import org.fourwheeler.*;

public class Vehicle {

	public void vehicleNecessary() {
		System.out.println("Vehicles are necessary for transportation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle veh = new Vehicle();
		TwoWheeler b = new TwoWheeler();
		ThreeWheeler three = new ThreeWheeler();
		FourWheeler four = new FourWheeler();
		
		veh.vehicleNecessary();
		
		b.setData("Activa", 80000);
		String bi=b.bike();
		System.out.println(bi);
		b.setData("Hero", 75000);
		String cyc=b.cycle();
		System.out.println(cyc);
		
		three.setData("ravi");
		three.auto();
		
		four.setData(600000,5);
		four.car();
		four.setData(800000, 50);
		String bu=four.bus();
		System.out.println(bu);
		four.setData(700000, 4);
		String lo=four.lorry();
		System.out.println(lo);
		
	}

}
