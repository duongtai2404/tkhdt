package week_2;

import java.util.ArrayList;

public class ResidentalCustomer extends Customer {
	private ArrayList<OneReading> readings;

	public ResidentalCustomer(int id, String name, String address) {
		super(id, name, address);
		this.readings = new ArrayList<OneReading>();

	}

	public ResidentalCustomer(int id, String name, String address,
			ArrayList<OneReading> readings) {
		super(id, name, address);
		this.readings = readings;
	}
	
	public void addOneReading(OneReading oneReading) {
		readings.add(oneReading);
	}

	public ArrayList<OneReading> getReadings() {
		return readings;
	}

	public void setReadings(ArrayList<OneReading> readings) {
		this.readings = readings;
	}

	@Override
	public ArrayList<? extends Reading> getReading() {
		// TODO Auto-generated method stub
		return getReadings();
	}

	// tinh so kw tieu thu cua ho dan cu
	@Override
	public Long soKWTieuThu() {
		
		 // so kw tieu thu = so kw mới nhất - số kw cũ
		return getNewReading().getIndex() - getOldReading().getIndex();
	}

	// tính tiền điện của hộ dân cư
	@Override
	public double tinhTienDien() {
		Long a = soKWTieuThu();
		double tongTien = 0;
		
		
		if (a > 301)
			tongTien = (100 * 550) + (50 * 900) + (50 * 1210) + (100 * 1340)
					+ ((a - 300) * 1400); 
		if (200 < a && a <= 300)
			tongTien = (100 * 550) + (50 * 900) + (50 * 1210)
					+ ((a - 200) * 1340);
		if (150 < a && a <= 200)
			tongTien = (100 * 550) + (50 * 900) + ((a - 150) * 1210);
		if (100 < a && a <= 150)
			tongTien = (100 * 550) + ((a - 100) * 900);
		if (100 < a && a <= 150)
			tongTien = (100 * 550) + ((a - 100) * 900);
		if (0 < a && a <= 100)
			tongTien = a * 550;
		return tongTien;
	}

	@Override
	public String toString() {
		String s;
		s= "Id of residental customer :\t" + getId() + "\nName of residental customer :\t" + getName()
				+ "\nAddress of residental customer :\t" + getAddress() +
				"\nKW is cosumed :\t" + soKWTieuThu() +"\nElectricity bill :\t" + tinhTienDien();
		return s;
	}
	
	

}
