package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class ApplicationList extends Controller {

    public static void index() {
        List<ApplicationFormModel> applications = ApplicationFormModel.findAll();
    	render(applications);
    }

}