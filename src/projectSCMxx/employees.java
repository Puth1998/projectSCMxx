package projectSCMxx;

public class employees {
	private sales sale;
	public String empNumber;
	public String empName;
	public int salary;

	
	public employees() {
		
	}
	
	public employees(String nb, String n, int s) {
		this.empNumber = nb;
		this.empName = n;
		this.salary = s;
	}


	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String emptName) {
		this.empName = emptName;
	}

	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	public sales getSale() {
		return sale;
	}

	public void setSale(sales sale) {
		this.sale = sale;
	}

}
