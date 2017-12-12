package ctci.ood.employees;

import java.util.List;

import ctci.ood.callhandling.CallCenter;

public class Respondent extends Employee {
	
	public Respondent(int id, Type type, boolean isAFK, boolean isFree, CallCenter callCenter) {
		super(id, type, isAFK, isFree, callCenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptCall() {
		if(isAFK()){
			System.out.println(this.getType()+" is away from keyboard, Your call will escalated shortly");
			escalate(); //if respondent is away from keyboard he will escalate the call
		}else{
			System.out.println(this.getType()+" has accepted your call");
		}
	}
	
	/**
	 * escalates calls to managers
	 */
	private void escalate() {
		
		// gets the manager list from CallCenter class
		List<Employee> tempList = this.getCallCenter().getAllEmployees(); 
		
		for(Employee e:tempList){
			if(e.isFree() && (e.getType() == Type.MANAGER)){
				e.acceptCall();
				break;
			}
		}
		
		System.out.println("No manager is currently available");
		
	}

}
