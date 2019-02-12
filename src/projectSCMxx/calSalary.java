package projectSCMxx;

public class calSalary {
	public int salary;
	public int sales;

	public calSalary() {
		
	}
	
	public calSalary(int s,int sl) {
		this.salary = s;
		this.sales = sl;
		
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public double sumsalary() {
		double sumsalary = 0;
		if( this.sales >= 1 && this.sales <= 50000){
			sumsalary = (int) (this.sales*0.05);
		}else {
			sumsalary = (int) (this.sales*0.10);
		}

		return sumsalary+this.salary;
	}

}
