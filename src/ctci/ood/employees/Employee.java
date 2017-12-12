package ctci.ood.employees;

import ctci.ood.callhandling.CallCenter;

/**
 * This is an abstract Employee class
 * @author Devang Sawant
 *
 */

public abstract class Employee {
	
	//each employee has a unique id
	private int id;
	
	//type of employee (i.e. respondent, manager, director)
	private Type type;
	
	//indicates whether employee is away from keyboard
	private boolean isAFK;
	
	//indicates whether employee is free
	private boolean isFree;
	
	//this instance will help respondent to get a list of free managers and escalate calls 
	private CallCenter callCenter;

	public Employee(int id, Type type, boolean isAFK, boolean isFree, CallCenter callCenter) {
		this.id = id;
		this.type = type;
		this.isAFK = isAFK;
		this.isFree = isFree;
		this.callCenter = callCenter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public boolean isAFK() {
		return isAFK;
	}

	public void setAFK(boolean isAFK) {
		this.isAFK = isAFK;
	}
	
	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	
	public CallCenter getCallCenter() {
		return callCenter;
	}

	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}
	
	/**
	 * this method allows an employee to accept call
	 */
	public abstract void acceptCall();
	
	/**
	 * this method allows an employee to escalate call to higher level if he is busy
	 */
	
	
	

}
