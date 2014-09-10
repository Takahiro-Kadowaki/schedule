package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import play.data.validation.Constraints.*;

@Entity
public class Task extends Model {

	 @Id
	public Long id;

	@Required
	 public String name;

	public static Finder<Long,Task> find = new Finder<Long,Task>(Long.class, Task.class);

  public static List<Task> all() {
    return new ArrayList<Task>();
  }

  public static void create(Task task) {
  }

  public static void delete(Long id) {
  }

  public static Page<Task> page(int page, int pageSize, String sortBy, String order, String filter) {
      return
          find.where()
              .ilike("name", "%" + filter + "%")
              .orderBy(sortBy + " " + order)
              .findPagingList(pageSize)
              .getPage(page);
  }

}