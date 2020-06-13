package logic;

import java.util.ArrayList;

public class GasStation {
	private String stationID;
	private ArrayList<Product> product_list = new ArrayList<Product>();
	private StationManager manager;
	private String company_name;
	private ArrayList<Employee> worker_list = new ArrayList<Employee>();
	
	
	public void add_worker( Employee worker) {}
	public void remove_worker() {}
	public void add_product( Product prod) {}
	public void remove_product() {}	
	public void order_supply() {}
	
	
	public String getStationID() {
		return stationID;
	}
	public void setStationID(String stationID) {
		this.stationID = stationID;
	}
	public ArrayList<Product> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(ArrayList<Product> product_list) {
		this.product_list = product_list;
	}
	public StationManager getManager() {
		return manager;
	}
	public void setManager(StationManager manager) {
		this.manager = manager;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public ArrayList<Employee> getWorker_list() {
		return worker_list;
	}
	public void setWorker_list(ArrayList<Employee> worker_list) {
		this.worker_list = worker_list;
	}
	public GasStation(String stationID, ArrayList<Product> product_list, StationManager manager, String company_name,
			ArrayList<Employee> worker_list) {
		super();
		this.stationID = stationID;
		this.product_list = product_list;
		this.manager = manager;
		this.company_name = company_name;
		this.worker_list = worker_list;
	}
	
	
	

}
