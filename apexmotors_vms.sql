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


create table supplier(supplierid int primary key, 
name varchar(30),
location varchar(50));
 
create table customer(
customerid int primary key ,
dealerid int , 
annual_income double,
gender varchar(10), 
name varchar(30),
address varchar(50),
foreign key(dealerid) references dealer(dealerid));
 
create table vehicle(vin varchar(30) primary key, 
manufacturerid int , 
customerid int,
foreign key(customerid) references customer(customerid),
foreign key(manufacturerid) references manufacturer(manufacturerid));

create table car_model(modelid int primary key ,
companyid int ,
fuel_efficiency varchar(30) ,
safety_features boolean,
car_type varchar(20),
cost double,
foreign key(customerid) references customer(customerid)); 


--Atharv insert your code here
CREATE TABLE produces(
	vin VARCHAR(30),
	FOREIGN KEY (vin) REFERENCES vehicle(vin),
    manufacturerid INT,
    foreign key(manufacturerid) references manufacturer(manufacturerid),
    produce_date date
    );
    
CREATE TABLE sales (
	customerid int,
    foreign key(customerid) references customer(customerid),
    dealerid int,
    foreign key(dealerid) references dealer(dealerid),
    name VARCHAR(39),
    price int
);

CREATE TABLE inventory(
	inventoryid int primary key,
    dealerid int,
    foreign key(dealerid) references dealer(dealerid),
    name varchar(30),
    location varchar(30)
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




