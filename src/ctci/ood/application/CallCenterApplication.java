package ctci.ood.application;

import ctci.ood.callhandling.Call;
import ctci.ood.callhandling.CallCenter;
import ctci.ood.employees.Director;
import ctci.ood.employees.Employee;
import ctci.ood.employees.Manager;
import ctci.ood.employees.Respondent;
import ctci.ood.employees.Type;

public class CallCenterApplication {
	
	public static void main(String[] args) {
		
		//create call center
		CallCenter UK = new CallCenter();
		
		//create employees of different types
		Employee e1 = new Respondent(0001, Type.RESPONDENT, true, true, UK);
		Employee e2 = new Respondent(0002, Type.RESPONDENT, true, true, UK);
		
		Employee e3 = new Manager(0003, Type.MANAGER, true, true, UK);
		Employee e4 = new Manager(0004, Type.MANAGER, true, true, UK);
		
		Employee e5 = new Director(0005, Type.DIRECTOR, false, true, UK);
		Employee e6 = new Director(0006, Type.DIRECTOR, false, true, UK);
		
		//add employees to call center
		UK.addEmployees(e1);
		UK.addEmployees(e2);
		UK.addEmployees(e3);
		UK.addEmployees(e4);
		UK.addEmployees(e5);
		UK.addEmployees(e6);
		
		//create calls
		Call c1 = new Call(1);
		//Call c2 = new Call(2);
		
		//call center will dispatch calls
		UK.dispatchCall(c1);
		
	}

}
