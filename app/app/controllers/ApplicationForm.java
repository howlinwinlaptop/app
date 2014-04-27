package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class ApplicationForm extends Controller {

    public static void index() 
    {
        render();
    }

    public static void formPosted(String fname, String lname, String lastKnownStreet,
    								String city, String state, String zip, String dob, 
    								String dod, String ssn) 
    {
    	ApplicationFormModel appForm = new ApplicationFormModel(fname, lname, lastKnownStreet, city, state, zip, dob, dod, ssn);
    	appForm.save();
    	
    }
}