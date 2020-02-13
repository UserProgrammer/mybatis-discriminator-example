create table service_record (
  id int unsigned,
  vehicle_id int unsigned,
  description varchar(50) not null,
  primary key (id),
  constraint fk_service_record_vehicle_id foreign key (id) references vehicle (id)
)
