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

create table supplier(
	supplierid int primary key, 
	name varchar(30),
	location varchar(50)
);
 
create table customer(
	customerid int primary key ,
	dealerid int , foreign key(dealerid) references dealer(dealerid),
	annual_income double,
	gender char(1), 
	name varchar(30),
	address varchar(50)
);
 
create table vehicle(
	vin varchar(30) primary key, 
	manufacturerid int , foreign key(manufacturerid) references manufacturer(manufacturerid),
	customerid int, foreign key(customerid) references customer(customerid)
);

create table car_model(
	modelid int primary key,
	companyid int, foreign key(companyid) references company(companyid),
	fuel_efficiency varchar(30),
	safety_features boolean,
	car_type varchar(20),
	cost double
); 

CREATE TABLE produces(
	vin VARCHAR(30), FOREIGN KEY (vin) REFERENCES vehicle(vin),
	manufacturerid INT, foreign key(manufacturerid) references manufacturer(manufacturerid),
	date date
);

CREATE TABLE sales (
	customerid int, foreign key(customerid) references customer(customerid),
	dealerid int, foreign key(dealerid) references dealer(dealerid),
	date date,
	price double
);

CREATE TABLE inventory(
	inventoryid int primary key,
	dealerid int, foreign key(dealerid) references dealer(dealerid),
	name varchar(30),
	location varchar(30)
);

CREATE TABLE in(
    inid INT PRIMARY KEY,
    inventoryid INT, FOREIGN KEY (inventoryid) REFERENCES inventory(inventoryid),
    VIN VARCHAR(50), FOREIGN KEY (VIN) REFERENCES vehicle(VIN)
);

CREATE TABLE supplies (
    suppliesid INT PRIMARY KEY,
    supplierid INT, FOREIGN KEY (supplierid) REFERENCES supplier(supplierid),
    manufacturerid INT, FOREIGN KEY (manufacturerid) REFERENCES manufacturer(manufactureid)
    quantity INT,
    date DATE,
);

CREATE TABLE phone (
    phoneid INT PRIMARY KEY,
    customerid INT, FOREIGN KEY (customerid) REFERENCES customer(customerid)
); 

CREATE TABLE has (
    hasid INT  PRIMARY KEY,
    VIN VARCHAR(50), FOREIGN KEY (VIN) REFERENCES vehicle(VIN),
    modelid INT, FOREIGN KEY (modelid) REFERENCES model(modelid)
);
