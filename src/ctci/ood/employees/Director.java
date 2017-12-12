package ctci.ood.employees;

import ctci.ood.callhandling.CallCenter;

/**
 * This is Director class IS-A Employee
 * This class can accept calls
 * 
 * @author Devang Sawant
 *
 */

public class Director extends Employee {

	public Director(int id, Type type, boolean isAFK, boolean isFree, CallCenter callCenter) {
		super(id, type, isAFK, isFree, callCenter);
	}
	
	/**
	 * A director can accept calls via this method
	 */
	@Override
	public void acceptCall() {

		if(isAFK()){
			System.out.println(this.getType()+" is away from keyboard, Your call will escalated shortly");
			escalate();
		}else{
			System.out.println(this.getType()+" has accepted your call");
			System.exit(1);
		}
	
	}

	private void escalate() {
		System.out.println("*********CALL TERMINATED*******");
		
	}

}
