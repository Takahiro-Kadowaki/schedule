# --- Sample dataset

# --- !Ups

insert into task (id,name,pr) values (  1,'国語','名無し');
insert into task (id,name,pr) values (  2,'数学','13');
insert into task (id,name,pr) values (  3,'社会','e.t');
insert into task (id,name,pr) values (  4,'英語','etc');
insert into task (id,name,pr) values (  5,'世界史','name');
insert into task (id,name,pr) values (  6,'日本史','dis');
insert into task (id,name,pr) values (  7,'物理','nahme');

insert into task_tue (id,name,pr) values (  1,'国語','名無し');
insert into task_tue (id,name,pr) values (  2,'数学','13');
insert into task_tue (id,name,pr) values (  3,'社会','e.t');
insert into task_tue (id,name,pr) values (  4,'英語','etc');
insert into task_tue (id,name,pr) values (  5,'世界史','name');
insert into task_tue (id,name,pr) values (  6,'日本史','dis');
insert into task_tue (id,name,pr) values (  7,'物理','nahme');

# --- !Downs

delete from task;

