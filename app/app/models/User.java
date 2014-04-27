package models;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.Logger;
import play.db.jpa.Model;

@Entity
public class User extends Model {
	public String email;
	public String password;
	
	  public User()
	  {}
	  
	  public User(String email, String password)
	  {	
	    this.email = email;
	    this.password = password;
	  }

	  public static User findById(long id)
	  {
	    return find("byId", id).first();
	  }
	  
	  public static User findByEmail(String email)
	  {
	    return find("byEmail", email).first();
	  }

	  public boolean checkPassword(String password)
	  {
	    return this.password.equals(password);
	  }

}