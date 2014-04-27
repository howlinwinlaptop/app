package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class ApplicationFormModel extends Model {

	public String fname; 
	public String lname; 
	public String lastKnownStreet;
	public String city;
	public String state; 
	public String zip;
	public String dob; 
	public String dod; 
	public String ssn;
	
	
	public ApplicationFormModel(String fname, String lname, String lastKnownStreet,
			String city, String state, String zip, String dob, String dod,
			String ssn) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.lastKnownStreet = lastKnownStreet;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.dob = dob;
		this.dod = dod;
		this.ssn = ssn;
	}

}
