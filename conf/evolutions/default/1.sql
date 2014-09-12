# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  task_id                   bigint not null,
  week_id                   bigint,
  time_id                   bigint,
  name                      varchar(255),
  pr                        varchar(255),
  create_date               timestamp,
  update_date               timestamp,
  constraint pk_task primary key (task_id))
;

create sequence task_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists task_seq;

