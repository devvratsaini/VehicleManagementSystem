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


create table car_model(
	modelid int primary key,
    fuelefficiency int,
    safetyfeatures boolean,
    cartype varchar(50),
    cost int
);
CREATE TABLE in_table (
    inid INT PRIMARY KEY,
    inventoryid INT,
    VIN VARCHAR(50),
    FOREIGN KEY (inventoryid) REFERENCES inventory(inventoryid),
    FOREIGN KEY (VIN) REFERENCES vehicle(VIN)
);
CREATE TABLE supplies (
    suppliesid INT PRIMARY KEY,
    supplierid INT,
    manufacturerid INT,
    quantity INT,
    date DATE,
    FOREIGN KEY (supplierid) REFERENCES supplier(supplierid),
    FOREIGN KEY (manufacturerid) REFERENCES company(companyid)
);
CREATE TABLE phone (
    phoneid INT PRIMARY KEY,
    customerid INT,
    FOREIGN KEY (customerid) REFERENCES customer(customerid)
);
CREATE TABLE has (
    hasid INT  PRIMARY KEY,
    VIN VARCHAR(50),
    modelid INT,
    FOREIGN KEY (VIN) REFERENCES vehicle(VIN),
    FOREIGN KEY (modelid) REFERENCES model(modelid)
);



create table manufacturer(
	manufacturerid int primary key,
    location varchar(50),
    name varchar(50)
);
