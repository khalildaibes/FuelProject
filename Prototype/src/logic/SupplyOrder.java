package logic;

public class SupplyOrder {
	private String supplierID;
	private Employee emp;
	
	
	public void Supply_order(Employee workerID,float quant,String supplierid,GasStation station, Product prod,String orderID,String date ) {}
	public void Update_quantity() {}
	
	
	private GasStation station;
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public GasStation getStation() {
		return station;
	}
	public void setStation(GasStation station) {
		this.station = station;
	}
	

}
