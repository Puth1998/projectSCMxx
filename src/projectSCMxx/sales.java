package projectSCMxx;

public class sales {
	public String empNumber;
	public int sales;

	public sales() {
	}
	
	public sales(String nb, int sales) {
		this.empNumber = nb;
		this.sales = sales;
	}

	public String getEmployeeNumber() {
		return empNumber;
	}

	public void setEmployeeNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

}
