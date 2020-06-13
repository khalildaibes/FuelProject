package logic;

public class Reports {
	private String reportsID;
	private String reportTpye;
	private String description;
	private Employee ManagerID;
	
	
	public Reports(String reportsID, String reportTpye, String description, Employee managerID) {
		super();
		this.reportsID = reportsID;
		this.reportTpye = reportTpye;
		this.description = description;
		ManagerID = managerID;
	}
	public String getReportsID() {
		return reportsID;
	}
	public void setReportsID(String reportsID) {
		this.reportsID = reportsID;
	}
	public String getReportTpye() {
		return reportTpye;
	}
	public void setReportTpye(String reportTpye) {
		this.reportTpye = reportTpye;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Employee getManagerID() {
		return ManagerID;
	}
	public void setManagerID(Employee managerID) {
		ManagerID = managerID;
	}
	
	

}
