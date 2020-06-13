package logic;

public class Plan {
	private int plan_id;
	private String name;
	private String description;
	private float fule_discount;
	private float check_out_discount;
	
	
public Plan( int plan_id, String name, String description ,float fule_discount, float check_out_discount) {
	setCheck_out_discount(check_out_discount);
	setDescription(description);
	setFule_discount(fule_discount);
	setName(name);
	setPlan_id(plan_id);

}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getFule_discount() {
		return fule_discount;
	}
	public void setFule_discount(float fule_discount) {
		this.fule_discount = fule_discount;
	}
	public float getCheck_out_discount() {
		return check_out_discount;
	}
	public void setCheck_out_discount(float check_out_discount) {
		this.check_out_discount = check_out_discount;
	}
}
