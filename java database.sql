drop database apexmotors_vms;
create database apexmotors_vms;
use apexmotors_vms;

create table accounts (
	accountid int primary key auto_increment,
    accounttype varchar(15) not null,
    username varchar(50) not null,
    password varchar(50) not null,
    email varchar(50)
);

insert into accounts(accounttype, username, password, email) values ('Admin', 'devvratsaini', 'Admin1@Apex', 'devvratsaini@apex.com');
insert into accounts(accounttype, username, password, email) values ('Admin', 'atharvraje', 'Admin2@Apex', 'atharvraje@apex.com');
insert into accounts(accounttype, username, password, email) values ('Admin', 'rutubhanderi', 'Admin3@Apex', 'rutubhanderi@apex.com');
insert into accounts(accounttype, username, password, email) values ('Admin', 'praneetmahendrakar', 'Admin4@Apex', 'praneetmahendrakar@apex.com');

select * from accounts;

create table cars (
	model varchar(50) primary key,
	manufacturer varchar(50),
    cartype varchar(50),
    transmission varchar(50),
    stock int,
    price int
);

insert into cars values ('Ford', 'Aspire', 'Sedan', 'Manual', 20, 750,000);
insert into cars values ('Ford', 'EcoSport');
insert into cars values ('Ford');
insert into cars values ('Ford');
insert into cars values ('Maruti Suzuki');
insert into cars values ('Maruti Suzuki');
insert into cars values ('Maruti Suzuki');
insert into cars values ('Maruti Suzuki');
insert into cars values ('Maruti Suzuki');

create table orders (
	orderid int primary key auto_increment,
	customerid int,
    isConfirmed boolean,
    model varchar(50), foreign key(model) references cars(model)
);