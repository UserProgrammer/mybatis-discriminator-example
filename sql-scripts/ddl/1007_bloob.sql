create table bloob (
  id int unsigned,
  vehicle_id int unsigned,
  primary key (id),
  constraint fk_bloob_vehicle_id foreign key (id) references vehicle (id)
)
