create database apexmotors_vms;

use apexmotors_vms;

create table car_company (
	companyid int primary key,
	location varchar(50),
	name varchar(50)
);

create table customisation (
	customisationid int primary key,
	color varchar(20),
	rim varchar(50),
	transmission varchar(20)
);

create table dealer (
	dealerid int primary key,
	location varchar(50),
	name varchar(50)
);

create table manufacturer (
	manufacturerid int primary key,
	location varchar(50),
	name varchar(50)
);

create table supplier (
	supplierid int primary key, 
	name varchar(50),
	location varchar(50)
);
 
create table customer (
	customerid int primary key ,
	dealerid int , foreign key(dealerid) references dealer(dealerid),
	annual_income double,
	gender char(1), 
	name varchar(50),
	address varchar(100)
);
 
create table vehicle (
	vin varchar(30) primary key, 
	manufacturerid int , foreign key(manufacturerid) references manufacturer(manufacturerid),
	customerid int, foreign key(customerid) references customer(customerid)
);

create table car_model (
	modelid int primary key,
	companyid int, foreign key(companyid) references car_company(companyid),
	fuel_efficiency varchar(30),
	safety_features boolean,
	car_type varchar(20),
	cost double
); 

create table produces (
	vin varchar(30), foreign key(vin) references vehicle(vin),
	manufacturerid int, foreign key(manufacturerid) references manufacturer(manufacturerid),
	date date
);

create table sales (
	customerid int, foreign key(customerid) references customer(customerid),
	dealerid int, foreign key(dealerid) references dealer(dealerid),
	date date,
	price double
);

create table inventory (
	inventoryid int primary key,
	dealerid int, foreign key(dealerid) references dealer(dealerid),
	name varchar(50),
	location varchar(50)
);

create table in_table (
    inid int primary key,
    inventoryid int, foreign key(inventoryid) references inventory(inventoryid),
    vin varchar(30), foreign key(vin) references vehicle(vin)
);

create table supplies (
    suppliesid int primary key,
    supplierid int, foreign key(supplierid) references supplier(supplierid),
    manufacturerid int, foreign key(manufacturerid) references manufacturer(manufacturerid),
    quantity int,
    date date
);

create table phone (
    phoneid int primary key,
    customerid int, foreign key(customerid) references customer(customerid)
); 

create table has (
    hasid int primary key,
    vin varchar(30), foreign key(VIN) references vehicle(VIN),
    modelid int, foreign key(modelid) references car_model(modelid)
);


INSERT INTO car_company (companyid, location, name) VALUES
        (1, 'Chennai', 'Maruti'),
         (2, 'Pune', 'Volkswagen'),
         (3, 'Bangalore', 'Toyota'),
         (4, 'Chennai', 'Hyundai'),
         (5, 'Mumbai', 'Ferarri');


 INSERT INTO car_model (modelid, companyid, fuel_efficiency, safety_features, car_type, cost)
    -> VALUES
    ->     (11, 1, '15', TRUE, 'Swift', 700000.00),
    ->     (12, 2, '12', TRUE, 'Polo', 1000000.00),
    ->     (13, 3, '11', TRUE, 'Fortuner', 3000000.00),
    ->     (14, 4, '9', TRUE, 'Verna', 1200000.00),
    ->     (15, 5, '6', FALSE, '488 GTB', 40000000.00);
