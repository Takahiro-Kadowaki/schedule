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

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long task_id;
	public Long week_id;
	public Long time_id;

	@Required
	 public String name;
	 public String pr;

	 @Formats.DateTime(pattern="yyyy-MM-dd")
	 public Date create_date;

	 @Formats.DateTime(pattern="yyyy-MM-dd")
	 public Date update_date;

	public static Finder<Long,Task> find = new Finder<Long,Task>(Long.class, Task.class);


  public static Page<Task> page(int page, int pageSize, String sortBy, String order, String filter) {
      return
          find.where()
              .ilike("name", "%" + filter + "%")
              .orderBy(sortBy + " " + order)
              .findPagingList(pageSize)
              .getPage(page);
  }

}