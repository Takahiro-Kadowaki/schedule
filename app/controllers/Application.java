package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;


public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);

	public static Result index() {
		  return redirect(routes.Application.list(0, "name", "asc", ""));
		}

	public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Task.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }






}
