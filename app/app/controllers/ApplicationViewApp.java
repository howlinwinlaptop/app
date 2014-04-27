package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class ApplicationViewApp extends Controller {

    public static void index(Long id) {
        ApplicationFormModel application = ApplicationFormModel.findById(id);
        render(application);
    }

}