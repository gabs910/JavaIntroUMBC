package ssapackage;

public class MDCustomer extends Customer {
	int mdID;

	@Override
	public void printCustData() {
		super.printCustData();
		System.out.println(mdID);
	}// printCustData

	public MDCustomer(String name, int id, int balance, int mdid) {
		super(name, id, balance);
		mdID = mdid;

	}// constructor

	public MDCustomer() {
	}// default constructor;

	@Override
	public void processInvoice(int invoiceNumber) {
		System.out.println("Processing MD Customer Invoice nUmber " + invoiceNumber);

	}

	public String toString() {
		return super.toString() + " " + mdID;

	}// toString

	@Override
	public boolean equals(Object obj) {
		MDCustomer custObj = null;
		if (obj instanceof MDCustomer) {
			custObj = (MDCustomer) obj;
		} // if
		if (super.equals(custObj)
				&&
		(mdID == custObj.getCustID())) {
			return true;
		}
		return false;

	}// equals

}// class
