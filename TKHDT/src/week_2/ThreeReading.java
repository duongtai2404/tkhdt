package week_2;

public class ThreeReading extends Reading {
	private long highIndex;
	private long lowIndex;
	

	public ThreeReading(Date date, long index, long highIndex, long lowIndex) {
		super(date, index);
		this.highIndex = highIndex;
		this.lowIndex = lowIndex;
	}


	public long getHighIndex() {
		return highIndex;
	}


	public void setHighIndex(long highIndex) {
		this.highIndex = highIndex;
	}


	public long getLowIndex() {
		return lowIndex;
	}


	public void setLowIndex(long lowIndex) {
		this.lowIndex = lowIndex;
	}
	
	
	

}
