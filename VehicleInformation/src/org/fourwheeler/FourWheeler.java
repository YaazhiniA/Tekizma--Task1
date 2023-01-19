package org.fourwheeler;

public class FourWheeler {
	
	int amount;
	int capacity;
	
	public void car() {
		System.out.println("Car amount: "+amount+"\n"+"Car capacity: "+capacity);
	}
	
	public String bus() {
		return "Bus amount: "+amount+"\n"+"Bus capacity: "+capacity;
	}
	
	public String lorry() {
		return "Lorry amount: "+amount+"\n"+"Lorry capacity: "+capacity;
	}
	
	public void setData(int amount, int capacity) {
		this.amount = amount;
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
