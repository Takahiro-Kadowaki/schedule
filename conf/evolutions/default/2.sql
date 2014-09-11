# --- Sample dataset

# --- !Ups

insert into task (id,name) values (  1,'国語');
insert into task (id,name) values (  2,'数学');
insert into task (id,name) values (  3,'社会');
insert into task (id,name) values (  4,'英語');
insert into task (id,name) values (  5,'世界史');
insert into task (id,name) values (  6,'日本史');
insert into task (id,name) values (  7,'物理');

# --- !Downs

delete from task;

