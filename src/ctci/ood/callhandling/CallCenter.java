package ctci.ood.callhandling;

import java.util.ArrayList;
import java.util.List;
import ctci.ood.employees.Employee;
import ctci.ood.employees.Type;

/**
 * This is the CallCenter class.
 * This class has a list of employees which it can add to
 * This class dispatches call to appropriate employee
 * 
 * @author Devang Sawant
 *
 */

public class CallCenter {
	
	//list of all employees that work in this call center
	private List<Employee> allEmployees;
	
	public CallCenter() {
		this.allEmployees = new ArrayList<>();
	}
	
	public List<Employee> getAllEmployees() {
		return allEmployees;
	}

	public void addEmployees(Employee e){
		this.allEmployees.add(e);
		System.out.println(e.getType()+" added");
	}
	
	/**
	 * will dispatch call to the first available respondent 
	 * @param call
	 */
	public void dispatchCall(Call call){
		
		for(Employee e: allEmployees){
			if(e.isFree() && e.getType() == Type.RESPONDENT){
				e.acceptCall();
				break;
			}
		}
	}
	

}
