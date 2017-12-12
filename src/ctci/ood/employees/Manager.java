package ctci.ood.employees;

import java.util.List;

import ctci.ood.callhandling.CallCenter;

public class Manager extends Employee {
	
	public Manager(int id, Type type, boolean isAFK, boolean isFree, CallCenter callCenter) {
		super(id, type, isAFK, isFree, callCenter);
	}

	@Override
	public void acceptCall() {
		
		if(isAFK()){
			System.out.println(this.getType()+" is away from keyboard, Your call will escalated shortly");
			escalate();
		}else{
			System.out.println(this.getType()+" has accepted your call");
		}
	}

	/**
	 * escalates calls to director
	 */
	private void escalate() {
		
		List<Employee> tempList = this.getCallCenter().getAllEmployees();
		
		for(Employee e: tempList){
			if(e.isFree() && (e.getType() == Type.DIRECTOR)){
				e.acceptCall();
				break;
			}
		}
		
		System.out.println("No Director is currently available");
	}

}
