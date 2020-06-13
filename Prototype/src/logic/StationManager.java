package logic;

public class StationManager extends Employee {

	public StationManager(String username,String id,String password,String Fname,String Lname,String email,String comp, String role) {
		super(username,id,password, Fname, Lname, email, comp, role);
		// TODO Auto-generated constructor stub
	}
	
	public void confirm_supply_order(SupplyOrder supord) {}
	public void set_low_quantity(Product prod) {}
	public void make_report(Reports report) {}
	

}
