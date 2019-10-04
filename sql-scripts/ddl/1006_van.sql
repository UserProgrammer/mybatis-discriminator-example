create table van (
  id int unsigned,
  power_sliding_door boolean not null,
  primary key (id),
  constraint fk_van_vehicle_id foreign key (id) references vehicle (id)
);