package week_2;

import java.util.Hashtable;
import java.util.Scanner;

public class EVNComDivision {
	private String name;
	private Hashtable<Integer, Customer> listCustomer;
	
	public EVNComDivision(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		listCustomer = new Hashtable<Integer, Customer>();
	}
	
	public void addCustomer(Customer customer) {
		listCustomer.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(int id) {
		return listCustomer.get(id);
	}
	
	public void printElectricityBillOfCustomer(int id) {
		System.out.println(findCustomer(id).toString());
	}
	
	public void printElectricityBillOfCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ma id khach hang : ");
		int id = input.nextInt();
		System.out.println(findCustomer(id).toString());
	}
	
	public void printAllBill() {
		for(Customer c : listCustomer.values())
			System.out.println(c);

	}
	
	public static void main(String[] args) {
		ResidentalCustomer rc1 = new ResidentalCustomer(1, "Mai Duong Tai", "Thu Duc district");
		rc1.addOneReading(new OneReading(new Date(24, 4, 2019), 1700));
		rc1.addOneReading(new OneReading(new Date(24, 5, 2019), 1800));
		
		ResidentalCustomer rc2 = new ResidentalCustomer(2, "Nguyen Van A", "1 district");
		rc2.addOneReading(new OneReading(new Date(24, 4, 2019), 1700));
		rc2.addOneReading(new OneReading(new Date(24, 5, 2019), 1950));
		rc2.addOneReading(new OneReading(new Date(24, 6, 2019), 2200));
		
		ResidentalCustomer rc3 = new ResidentalCustomer(3, "Nguyen Van B", "2 district");
		rc3.addOneReading(new OneReading(new Date(24, 4, 2019), 1700));
		rc3.addOneReading(new OneReading(new Date(24, 5, 2019), 1800));
		rc3.addOneReading(new OneReading(new Date(24, 6, 2019), 2100));
		rc3.addOneReading(new OneReading(new Date(24, 7, 2019), 2530));
		
		
		BusinessCustomer bc1 = new BusinessCustomer(5, "1 member company", "Binh Thanh district","0579375931");
		bc1.addThreeReading(new ThreeReading(new Date(21, 2, 2019), 1900, 100, 50));
		bc1.addThreeReading(new ThreeReading(new Date(21, 3, 2019), 2600, 200, 280));
		bc1.addThreeReading(new ThreeReading(new Date(21, 4, 2019), 3200, 445, 480));
		bc1.addThreeReading(new ThreeReading(new Date(21, 5, 2019), 3900, 550, 730));
		
		EVNComDivision e = new EVNComDivision("TPHCM");
		e.addCustomer(rc1);
		e.addCustomer(rc2);
		e.addCustomer(rc3);
		e.addCustomer(bc1);
		
//		e.printElectricityBillOfCustomer();
		e.printAllBill();
		
	}

}
