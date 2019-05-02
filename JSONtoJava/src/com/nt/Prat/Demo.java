package com.nt.Prat;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Demo 
{
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Demo [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empPwd=" + empPwd + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	private String empName;
	private double empSal;
@JsonIgnore
private String empPwd;


}
