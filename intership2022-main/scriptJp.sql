drop table Trade;
drop table Orders;
drop table Trader;

create table Trader (
Code VARCHAR(3),
Name VARCHAR(50) not null,
PRIMARY KEY (Code));

create table Orders (
Id int,
Ticker VARCHAR(50) not null,
Trader VARCHAR(3) not null,
PRIMARY KEY (Id),
CONSTRAINT FK_TraderOrder FOREIGN KEY (Trader)
REFERENCES TRADER(Code));

create table Trade (
OrderId int,
TimeStamp DATE,
Quantity int  not null,
Price FLOAT not null,
CONSTRAINT FK_OrderTrade FOREIGN KEY (OrderId)
REFERENCES Orders(Id));

insert into trader (Code, Name) 
VALUES ('JDO', 'John Doe');
insert into trader (Code, Name) 
VALUES ('JSM', 'John Smith');

insert into Orders (Id, Ticker, Trader)
VALUES (123456, 'PETR4', 'JDO');
insert into Orders (Id, Ticker, Trader)
VALUES (123457, 'ITUB4', 'JSM');

insert into Trade (orderid, timestamp, quantity, price)
VALUES (123456, '26-01-2021', 1000, 25.123456);
insert into Trade (orderid, timestamp, quantity, price)
VALUES (123457, '26-01-2021', 2000, 40.000000);