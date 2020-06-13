package logic;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private ArrayList<Product> products_list;

	private int order_id;
	private float check_out_price;
	private Date date;
	private int station_id;
	private String status;
	//private Arraylist<Sale> sales;
	private float sum;
	public User user;
	public Employee employee;
	
	public Order( int order_id,float check_out_price,Date date ,int station_id, String status, float sum, User user, Employee employee) {
		setCheck_out_price(check_out_price);
		setDate(date);
		setEmployee(employee);
		setOrder_id(order_id);
		setProducts_list(products_list);
		setStation_id(station_id);
		setStatus(status);
		setSum(sum);
		setUser(user);
	}
	
	

	public ArrayList<Product> getProducts_list() {
		return products_list;
	}
	public void setProducts_list(ArrayList<Product> products_list) {
		this.products_list = products_list;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public float getCheck_out_price() {
		return check_out_price;
	}
	public void setCheck_out_price(float check_out_price) {
		this.check_out_price = check_out_price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStation_id() {
		return station_id;
	}
	public void setStation_id(int station_id) {
		this.station_id = station_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
