package logic;

import java.util.ArrayList;

public class Gas_Station {

	private int station_id;
	private ArrayList<Product> products_List;
	private Employee manager;
	private String company_Name;
	private ArrayList<Employee> Employee_List;
	
	public Gas_Station( int station_id, ArrayList<Product> products_List, Employee manager, String company_Name, ArrayList<Employee> employee_List) {
		setCompany_Name(company_Name);
		setEmployee_List(employee_List);
		setManager(manager);
		setProducts_List(products_List);
		setStation_id(station_id);
		
	}
	
	public int getStation_id() {
		return station_id;
	}
	public void setStation_id(int station_id) {
		this.station_id = station_id;
	}
	public ArrayList<Product> getProducts_List() {
		return products_List;
	}
	public void setProducts_List(ArrayList<Product> products_List) {
		this.products_List = products_List;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public ArrayList<Employee> getEmployee_List() {
		return Employee_List;
	}
	public void setEmployee_List(ArrayList<Employee> employee_List) {
		Employee_List = employee_List;
	}
}
