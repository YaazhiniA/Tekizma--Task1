package org.threewheeler;

public class ThreeWheeler {
	
	String ownerName;
	
	public void auto() {
		System.out.println("Owner name: "+ownerName);
	}
	
	public void setData(String ownerName) {
		this.ownerName = ownerName;
	}

}
