package org.twowheeler;

public class TwoWheeler {
	String brand;
	int cost;
	
	public String bike() {
		return "Bike brand: "+brand+"\n"+"Cost: "+cost;
	}
	
	public String cycle() {
		return "Cycle brand: "+brand+"\n"+"Cost: "+cost;
	}
	
	public void setData(String brand, int cost){
		this.brand = brand;
		this.cost = cost;
	}

}
