package org.tnsif.multilevel;
//Child Class(C)
public class TeamMember extends TeamLead
{
	private int size;
	private int duration;
	
	// parameterized constructor
	public TeamMember(String deptName, String name, int empId, String leadName, String projectName,int size,
	 int duration) {
		super(deptName, name, empId, leadName, projectName);
		this.size = size;
		this.duration = duration;
	}

	//toString Methods
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString()
				+ ", getDeptName()=" + getDeptName() + ", getName()=" + getName() + ", getEmpId()=" + getEmpId() + "]";
	}
	
	
	
	
	
}
