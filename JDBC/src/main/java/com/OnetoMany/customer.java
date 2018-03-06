package com.OnetoMany;

import java.util.ArrayList;
import java.util.List;

public class customer {

	private Integer ID;
	private String firstname;
	private String lastname;
	private String email;
	private address address;//This is address object which is used to map or join address.
	private List<Orders>orders = new ArrayList<>();
		
	//we have 3 relation ships onetoOne, onetoMany, manytoMany Reltionships.
	//Patient and Doctor is ManytoMany Relationships.
	//A patient can visit many doctors and a doctor can have many patients.
	/*In Many->Many relationship we need to have patient table, doctor table 
	And in middle we need to have patient_doctor table.*/
	
	/*Lets say i created a patient with ID=1, doctor with ID=1,2. This patient goes to doctor 1 and 2.
	 * In patient_doctor table u are going to have 2 columns.One is patient_id and the other is doctor_id
	 * patient id is 1 and doctor id is 1.In the 2nd row patient id is 1 doctor id is 2.Because this patient
	 * is going to two doctors.By looking at this table we can see that ur doctor 1 is visiting only single 
	 * patient and your doctor 2 is visiting only one patient.
	 * Inside ur patient class ur going to have List<Doctors> in patient.
	 * U have List<Patients> in Doctor class.Both sides u have to represent using array list.
	 * 
	 * 
	 */

	
	
	public customer(Integer iD, String firstname, String lastname, String email) {
		super();
		ID = iD;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public customer(){}
	
	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	
	
	
		
	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "customer [ID=" + ID + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
}
