/**
 * 
 */
/**
 * @author Moustafa
 *
 */
package logic;

public class Employee extends User {

	
	private String station_id;
	private String role;
		/**
	 * @param id
	 * @param name
	 * @param name2
	 * @param comp
	 * @param role
	 */
	public Employee(String username,String id, String password ,String Fname, String Lname,String email, String station_id1,String role) {
		super(username,id,password,Fname,Lname,email);
		
		setStation_id(station_id1);
		this.role=role;
		
	}
	
	
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param name the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString(){
		return String.format(super.toString()+" %s %s ",role,station_id);
	}

	public String getStation_id() {
		return station_id;
	}

	public void setStation_id(String satation_id) {
		this.station_id = satation_id;
	}
	
}
