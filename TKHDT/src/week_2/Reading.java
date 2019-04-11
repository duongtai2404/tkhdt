package week_2;

public abstract class Reading {
	protected Date date;
	protected long index;
	
	public Reading(Date date, long index) {
		super();
		this.date = date;
		this.index = index;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}
	
	
	
}
