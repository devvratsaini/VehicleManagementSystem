create database apexmotors_vms;

use apexmotors_vms;

create table car_company(
	companyid int primary key,
	location varchar(50),
	name varchar(50)
);

create table customisation(
	customizationid int primary key,
    color varchar(20),
    rim varchar(50),
    transmission varchar(20)
);

create table dealer(
	dealerid int primary key,
	location varchar(50),
	name varchar(50)
);

create table manufacturer(
	manufacturerid int primary key,
    location varchar(50),
    name varchar(50)
);
