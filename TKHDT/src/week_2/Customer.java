package week_2;

import java.util.ArrayList;

public abstract class Customer {
	private int id;
	private String name;
	private String address;
	
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public Reading getOldReading(){
		return getReading().get(getReading().size() - 2);
	}
	
	public Reading getNewReading(){
		return getReading().get(getReading().size() - 1);
	}
	
	public abstract ArrayList<? extends Reading> getReading();
	
	public abstract Long soKWTieuThu();
	
	public abstract double tinhTienDien();
	
	public abstract String toString();
	
	
	
	
	
}
