drop database apexmotors_vms;
create database apexmotors_vms;
use apexmotors_vms;

create table accounts (
	accountid int primary key auto_increment,
    name varchar(50) not null,
    gender varchar(6) not null,
    address varchar(100) not null,
    username varchar(50) not null,
    password varchar(50) not null,
    email varchar(50)
);

create table cars (
	model varchar(50) primary key,
	manufacturer varchar(50),
    cartype varchar(50),
    transmission varchar(50),
    stock int,
    price int
);

create table orders (
	orderid int primary key auto_increment,
	customerid int,
    model varchar(50), foreign key(model) references cars(model),
    odate date
);

insert into accounts(name, gender, address, username, password, email) values ('Devvrat Saini', 'Male', '', 'devvratsaini', 'Admin1@Apex', 'devvratsaini@apex.com');
insert into accounts(name, gender, address, username, password, email) values ('Atharv Raje', 'Male', '','atharvraje', 'Admin2@Apex', 'atharvraje@apex.com');
insert into accounts(name, gender, address, username, password, email) values ('Rutu Bhanderi', 'Male', '','rutubhanderi', 'Admin3@Apex', 'rutubhanderi@apex.com');
insert into accounts(name, gender, address, username, password, email) values ('Praneet Mahendrakar', 'Male', '','praneetmahendrakar', 'Admin4@Apex', 'praneetmahendrakar@apex.com');
insert into accounts(name, gender, address, username, password, email) values ('John Doe', 'Male', 'Sample Address 1, Here','johndoe', 'JohnDoe@Apex', 'johnddoe@gmail.com');

select * from accounts;

insert into cars values ('Aspire', 'Ford', 'Sedan', 'Manual', 20, 750000);
insert into cars values ('EcoSport', 'Ford', 'SUV', 'Manual', 15, 950000);
insert into cars values ('Focus', 'Ford', 'Hatchback', 'Manual', 20, 900000);
insert into cars values ('Mustang', 'Ford', 'Sport', 'Manual', 10, 7000000);
insert into cars values ('Swift', 'Maruti Suzuki', 'Hatchback', 'Manual', 35, 600000);
insert into cars values ('Baleno', 'Maruti Suzuki', 'Hatchback', 'Manual', 25, 650000);
insert into cars values ('Swift Dzire', 'Maruti Suzuki', 'Sedan', 'Manual', 30, 675000);
insert into cars values ('Vitara Brezza', 'Maruti Suzuki', 'SUV', 'Automatic', 20, 800000);
insert into cars values ('Ciaz', 'Maruti Suzuki', 'Sedan', 'Manual', 20, 900000);

select * from cars;