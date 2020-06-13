package logic;

public class MarketingManager extends Employee {

	public MarketingManager(String username,String id,String password, String Fname, String Lname,String email,String comp, String role) {
		super(username,id, password,Fname, Lname, email, comp, role);
		// TODO Auto-generated constructor stub
	}
	public void make_marketing_report(Reports report) {}
	public void create_sale(Sale sale) {}
	public void update_max_price(Product prod){}


}
