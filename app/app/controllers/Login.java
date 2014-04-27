package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Login extends Controller {

    public static void index() {
        render();
    }
    /**
     * Authenticates that a user's login credentials are valid
     * 
     * @param email
     *          The submitted email address
     * @param password
     *          The corresponding password
     */
    public static void authenticate(String email, String password)
    {
  	  
      User user = User.findByEmail(email);
      if ((user != null) && (user.checkPassword(password) == true))
      {
        Logger.info("Authentication successful");
        session.put("logged_in_userid", user.id);
        index();
      }
      else
      {
        Logger.info("Authentication failed");
        login();
      }
    }

    public static void login()
    {
      render();
    }
}