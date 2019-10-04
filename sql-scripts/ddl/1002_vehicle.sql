create table vehicle (
  id int unsigned auto_increment,
  vin varchar(25) not null,
  year varchar(25) not null,
  make varchar(25) not null,
  model varchar(25) not null,
  color varchar(25) not null,
  type varchar(25) not null,
  primary key(id)
);
