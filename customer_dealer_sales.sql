

create table Customer(customerid int primary key,annual_income int,gender char(2) , name varchar(30),address varchar(50),dealerid int,VIN varchar(30),foreign key (dealerid)references Dealer(dealerid),foreign key (VIN)references Vehicle(VIN));

create table Sales(sdate date,price int);

create table Dealer(dealerid int primary key,location varchar(30),name varchar(30));