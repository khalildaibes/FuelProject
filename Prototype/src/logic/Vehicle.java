package logic;

public class Vehicle {
	
	private String vehicle_id;
	private String owner;
	private String package_id;
	private String model;
	private String fuel_type;
	public Vehicle(	 String vehicle_id, String owner_id,String packageid, String model, String fuel_type) {
		
		setFuel_type(fuel_type);
		setModel(model);
		setPackage_id(packageid);
		setOwner(owner_id);
		setVehicle_id(vehicle_id);
		
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner_id) {
		this.owner = owner_id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getPackage_id() {
		return package_id;
	}
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	public String toString()
	{
		return owner+"  "+vehicle_id+"  "+package_id+"  "+model+"  "+fuel_type;
	}
}
