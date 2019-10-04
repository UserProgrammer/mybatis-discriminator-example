create table car (
  id int unsigned,
  door_count int unsigned not null,
  primary key(id),
  constraint fk_car_vehicle_id foreign key (id) references vehicle (id)
);
