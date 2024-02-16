create database apexmotors_vms;

use apexmotors_vms;

create table car_model(
	modelid int primary key,
    fuelefficiency int,
    safetyfeatures boolean,
    cartype varchar(50),
    cost int
);
