create table truck (
  id int unsigned,
  box_size int unsigned not null,
  extended_cab boolean not null,
  primary key (id),
  constraint fk_truck_vehicle_id foreign key (id) references vehicle (id)
);