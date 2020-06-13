package logic;

public class Vehicle {
	
	private int vehicle_id;
	private User owner;
	private String color;
	private String company;
	private String model;
	private Product fuel_type;
	public Vehicle(	 int vehicle_id, User owner, String color, String company, String model, Product fuel_type) {
		setColor(color);
		setCompany(company);
		setFuel_type(fuel_type);
		setModel(model);
		setOwner(owner);
		setVehicle_id(vehicle_id);
		
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Product getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(Product fuel_type) {
		this.fuel_type = fuel_type;
	}
}
