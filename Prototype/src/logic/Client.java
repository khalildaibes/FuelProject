package logic;

import java.util.ArrayList;

public class Client extends Person {
	private ArrayList<Vehicle> vehcileList = new ArrayList<Vehicle>();
	private float balance;
	private ArrayList<PaymentMethod> credit_card =new ArrayList<PaymentMethod>();
	private ArrayList<Plan> plan = new ArrayList<Plan>();
	private int companyORprivate;
	
	public void remove_car() {}
	public void add_car() {}
	
	
	

	public Client(ArrayList<Vehicle> vehcileList, float balance, ArrayList<PaymentMethod> credit_card,
			ArrayList<Plan> plan, int companyORprivate, String username,String id,String password,String Fname,String Lname,String email) {
	
		super(username,id, password,Fname, Lname, email);
		this.vehcileList = vehcileList;
		this.balance = balance;
		this.credit_card = credit_card;
		this.plan = plan;
		this.companyORprivate = companyORprivate;
	}
	public ArrayList<Vehicle> getVehcileList() {
		return vehcileList;
	}
	public void setVehcileList(ArrayList<Vehicle> vehcileList) {
		this.vehcileList = vehcileList;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public ArrayList<PaymentMethod> getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(ArrayList<PaymentMethod> credit_card) {
		this.credit_card = credit_card;
	}
	public ArrayList<Plan> getPlan() {
		return plan;
	}
	public void setPlan(ArrayList<Plan> plan) {
		this.plan = plan;
	}
	public int getCompanyORprivate() {
		return companyORprivate;
	}
	public void setCompanyORprivate(int companyORprivate) {
		this.companyORprivate = companyORprivate;
	}
	public Client() {
		super(null,null,null,null, null, null);
		// TODO Auto-generated constructor stub
	}
	
//vehcile
	//suscription packge
	// creadit card
	
}
