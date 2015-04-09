package bean;

import java.util.Date;

public class Allotment {
	private int allotNo;
	private int aId;
	private int customerId;
	private Date date;
	private int transactionId;

	public int getAllotNo() {
		return allotNo;
	}

	public void setAllotNo(int allotNo) {
		this.allotNo = allotNo;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
