package org.tnsif.multilevel;
//Parent Class(B)
public class TeamLead extends Manager
{
	
	private String leadName;
	private String projectName;
	
	
	public TeamLead(String deptName, String name, int empId,String leadName,String projectName) {
		super(deptName, name, empId);
		this.leadName=leadName;
		this.projectName=projectName;
		// TODO Auto-generated constructor stub
	}
	
	//getters and setters method

/*
	public String getLeadName() {
		return leadName;
	}


	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
*/
	//toString Method
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", getDeptName()=" + getDeptName()
				+ ", getName()=" + getName() + ", getEmpId()=" + getEmpId() + ", toString()=" + super.toString() + "]";
	}
	
	

}
