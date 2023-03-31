
	package in.banking.Model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "empTab")
	public class Customer{
		@Id
		@Column(name = "eid")
		private Integer empId;

		@Column(name = "ename", length = 20)
		private String empName;

		@Column(name = "esal")
		private Double empSal;

		static {
			System.out.println("Employee.class is loading...");
		}

	public void setCustomerID(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setCustomerName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomeremail(String string) {
		// TODO Auto-generated method stub
		
	}


	
	

}
