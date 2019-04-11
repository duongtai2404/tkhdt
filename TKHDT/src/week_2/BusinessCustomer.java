package week_2;

import java.util.ArrayList;
public class BusinessCustomer extends Customer {
	private String numberAccount;
	private ArrayList<ThreeReading> readings;
	
	
	public BusinessCustomer(int id, String name, String address, String numberAccount) {
		super(id, name, address);
		this.numberAccount = numberAccount;
		readings = new ArrayList<ThreeReading>();
		// TODO Auto-generated constructor stub
	}


	public BusinessCustomer(int id, String name, String address, String numberAccount,
			ArrayList<ThreeReading> readings) {
		super(id, name, address);
		this.numberAccount = numberAccount;
		this.readings = readings;
	}


	public String getNumberAccount() {
		return numberAccount;
	}


	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}


	public ArrayList<ThreeReading> getReadings() {
		return readings;
	}


	public void setReadings(ArrayList<ThreeReading> readings) {
		this.readings = readings;
	}


	@Override
	public ArrayList<? extends Reading> getReading() {
		// TODO Auto-generated method stub
		return getReadings();
	}
	
	public void addThreeReading(ThreeReading threeReading) {
		readings.add(threeReading);
	}


	@Override
	public Long soKWTieuThu() {
		return getNewReading().getIndex() - getOldReading().getIndex();
	}
	
	//Phương thức tính số kw tiêu thụ giờ bình thường
	public Long soKWNormal(){
		return soKWTieuThu() - soKWSuDungHighHour() - soKWSuDungLowHour();
	}
	
	//Phương thức tính số kw tiêu thụ giờ cao điểm
	public Long soKWSuDungHighHour(){
		ThreeReading newReading = (ThreeReading) getNewReading();
		ThreeReading oldReading = (ThreeReading) getOldReading();
		
		return newReading.getHighIndex() - oldReading.getHighIndex();
	}
	
	//Phương thức tính số kw tiêu thụ giờ thấp điểm
	public Long soKWSuDungLowHour(){
		ThreeReading newReading = (ThreeReading) getNewReading();
		ThreeReading oldReading = (ThreeReading) getOldReading();
		
		return newReading.getLowIndex() - oldReading.getLowIndex();
	
	}

	
	// tính tiền điện cho nhà sản xuất
	@Override
	public double tinhTienDien() {
		
		/*tổng tiền bằng = số kw tiêu thụ binh thường * 895 +
		 * số kw tiêu thụ giờ thấp điểm * 505 +
		 * số kw tiêu thụ giờ cao điểm * 1480
		 */
		return soKWNormal()*895 + soKWSuDungLowHour()*505 + soKWSuDungHighHour()*1480;
	}


	@Override
	public String toString() {
		String s;
		s= "Id of business customer :\t" + getId() + "\nName of business customer :\t" + getName()
				+ "\nAddress of residental customer :\t" + getAddress() + 
				"\nAccount of business customer :\t" + numberAccount +
				"\nKW Normal is cosumed :\t" + soKWNormal() + "\nKW High is cosumed :\t" + soKWSuDungHighHour() +
				"\nKW Low is cosumed :\t" + soKWSuDungLowHour() +
				"\nElectricity bill :\t" + tinhTienDien();
		return s;
	}
		
}
