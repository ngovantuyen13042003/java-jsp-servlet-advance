create database testfpt;
use testfpt;
create table school(
	idschool varchar(100) primary key,
    name varchar(255),
    address varchar(255),	
    phonenumber varchar(11)
);

insert into school values("S01", "Đại học sư phạm ký thuật","Cao Thắng", "0874561235");
insert into school	values("S02", "Đại học bách khoa","Nguyễn Đức Thắng", "0236236465");

select * from graduate;

create table major(
	idmajor varchar(100) primary key,
    name varchar(255),
    category varchar(255)
);

insert into major values('M02', "internet of thing",'Khá');


create table student(
	identitycardnumber varchar(100) primary key, 
    name varchar(255),
    email varchar(255),
    phonenumber varchar(11),
    address varchar(255)
);

insert into student values('123456789','Ngô Văn Tuyến','ngovantuyen13042003@gmail.com','0966925849','Quảng Trị');

select * from student;

select * from job;

select * from graduate;

CREATE TABLE job (
    identitycardnumber VARCHAR(100),
    dateentercompany DATE,
    idmajor VARCHAR(100),
    namejob VARCHAR(255),
    namecompany VARCHAR(255),
    addresscompany VARCHAR(255),
    workingtime DATE,
    CONSTRAINT FK_major_job FOREIGN KEY (idmajor) REFERENCES major(idmajor),
    CONSTRAINT FK_st_job FOREIGN KEY (identitycardnumber) REFERENCES student(identitycardnumber),
    PRIMARY KEY (identitycardnumber, dateentercompany)
);



create table graduate(
	identitycardnumber varchar(100) ,
    idschool  varchar(100) ,
    idmajor varchar(100) ,
    dategraduate DATE,
    graduationtype varchar(100),
    graduationdegree varchar(100),
	constraint FK_st_gr foreign key (identitycardnumber) references student(identitycardnumber),
    constraint FK_st_school foreign key (idschool ) references school(idschool),
    constraint FK_st_major foreign key (idmajor ) references major(idmajor),
    primary key (identitycardnumber,idschool,idmajor  )
);





select * from graduate
