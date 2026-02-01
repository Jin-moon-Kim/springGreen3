show databases;
show tables;
create table j_parking_manager (
	plate_number varchar(8) not null primary key,
	driver_name varchar(20) not null,
	license_number bigint (12) not null,
	driver_address int(3) not null,
	parking_type varchar(9) default 'normal'
);

drop table j_parking_manager;

desc j_parking_manager;

select * from j_parking_manager;