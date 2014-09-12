package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;


public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);

	public static Result GO_HOME = redirect(
	        routes.Application.list(0, "task_id", "asc", "")
	    );

	public static Result index() {
		  return GO_HOME;
		}

	public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Task.page(page, 7, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }

	public static Result edit(Long task_id) {
        Form<Task> taskForm = form(Task.class).fill(
            Task.find.byId(task_id)
        );
        return ok(
            editForm.render(task_id, taskForm)
        );
    }

	public static Result edit_pr(Long task_id) {
        Form<Task> taskForm = form(Task.class).fill(
            Task.find.byId(task_id)
        );
        return ok(
            edit_prForm.render(task_id, taskForm)
        );
    }



	public static Result update(Long task_id) {
        Form<Task> taskForm = form(Task.class).bindFromRequest();
        if(taskForm.hasErrors()) {
            return badRequest(editForm.render(task_id, taskForm));
        }
        taskForm.get().update(task_id);
        flash("success", "Task " + taskForm.get().name + " has been updated");
        return GO_HOME;
    }

	public static Result update_pr(Long task_id) {
        Form<Task> taskForm = form(Task.class).bindFromRequest();
        if(taskForm.hasErrors()) {
            return badRequest(edit_prForm.render(task_id, taskForm));
        }
        taskForm.get().update(task_id);
        flash("success", "Task " + taskForm.get().name + " has been updated");
        return GO_HOME;
    }

	public static Result create() {
        Form<Task> taskForm = form(Task.class);
        return ok(
            createForm.render(taskForm)
        );
    }


    public static Result save() {
        Form<Task> taskForm = form(Task.class).bindFromRequest();
        if(taskForm.hasErrors()) {
            return badRequest(createForm.render(taskForm));
        }
        taskForm.get().save();
        flash("success", "Task " + taskForm.get().name + " has been created");
        return GO_HOME;
    }





}
