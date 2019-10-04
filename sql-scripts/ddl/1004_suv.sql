create table suv (
  id int unsigned,
  all_wheel_drive boolean not null,
  primary key (id),
  constraint fk_suv_vehicle_id foreign key (id) references vehicle (id)
);