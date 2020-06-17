package logic;

public class Vehicle {
	
	private String vehicle_id;
	private String owner;
	private String dalkan;
	 private String plan_id;
	private String fuel_type;


	public Vehicle(	String owner_id, String vehicle_id, String fuel_type,String  dalkan ,String plan_id) {
		setPlan_id(plan_id);
		setFuel_type(fuel_type);
		setDalkan(dalkan);
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
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getDalkan() {
		return dalkan;
	}
	public void setDalkan(String dalkan) {
		this.dalkan = dalkan;
	}
	public String toString()
	{
		return owner+"  "+vehicle_id+"  "+fuel_type+" "+dalkan+" "+plan_id;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
}
