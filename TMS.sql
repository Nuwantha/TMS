Drop DataBase TMS;
Create Database TMS;
USE TMS;


CREATE TABLE Student(
	studentId varchar(10) NOT NULL,
	birthDay DATE NOT NULL,
	name VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    parentName VARCHAR(50),
	contactNumber INT(10),
	CONSTRAINT PRIMARY KEY(studentId)
);

CREATE TABLE SchoolarshipResult(
	studentId VARCHAR(10) NOT NULL,
	indexNumber INT(10) NOT NULL,
	year1 INT(4),
	results INT(3),
	rank1 INT(4),
        isPass INT(1),
	CONSTRAINT FOREIGN KEY(studentId)REFERENCES Student(studentId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(indexNumber)
);


CREATE TABLE Class1(
	classId VARCHAR(10) NOT NULL,
	grade INT(2) NOT NULL,
	conductedDate VARCHAR(20) NOT NULL,  
	classFeesAmount INT(3),
	year2 YEAR,
	CONSTRAINT PRIMARY KEY(classId)	 		
);

CREATE TABLE Paper(
	paperId VARCHAR(10) NOT NULL,
	classId VARCHAR(10) NOT NULL,
	dateOfConduct DATE NOT NULL,
	numberOfFacedStudent INT(3) NOT NULL,
	grade INT(2) NOT NULL,
	topScore INT(3),
	average DOUBLE(5,2),
	CONSTRAINT FOREIGN KEY(classId)REFERENCES Class1(classId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(paperId)
);


CREATE TABLE Exam(
	studentId VARCHAR(10) NOT NULL,
	paperId VARCHAR(10) NOT NULL,
	mark INT(4),
	rank2 INT(3),
	CONSTRAINT FOREIGN KEY(studentId)REFERENCES Student(studentId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT FOREIGN KEY(paperId)REFERENCES Paper(paperId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(studentId,paperId)
);


CREATE TABLE Registration(
	classId VARCHAR(10) NOT NULL,
	studentId VARCHAR(10) NOT NULL,
	yearR YEAR NOT NULL,
	CONSTRAINT FOREIGN KEY(studentId)REFERENCES Student(studentId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT FOREIGN KEY(classId)REFERENCES Class1(classId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(classId,studentId)	 		
);


CREATE TABLE ClassFees(
	classId VARCHAR(10) NOT NULL,
	studentId VARCHAR(10) NOT NULL,
        month1 INT(2) NOT NULL,		
        datePay DATE NOT NULL,
        CONSTRAINT FOREIGN KEY(studentId)REFERENCES Student(studentId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT FOREIGN KEY(classId)REFERENCES Class1(classId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(classId,studentId,month1)	 		
);

CREATE TABLE Attendence(
	classId VARCHAR(10) NOT NULL,
	studentId VARCHAR(10) NOT NULL,
	dateAttended DATE NOT NULL,
        status INT(1) NOT NULL,
	CONSTRAINT FOREIGN KEY(studentId)REFERENCES Student(studentId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT FOREIGN KEY(classId)REFERENCES Class1(classId)
	ON DELETE CASCADE ON UPDATE CASCADE, 	
	CONSTRAINT PRIMARY KEY(classId,studentId,dateAttended)	 		
);

--2015 grade 5 student

insert into Student  values ('ST0001', '2005-11-03', 'Ashley Cox', 'Lulea', 'Cox', '0750344156');
insert into Student  values ('ST0002', '2005-09-05', 'Billy Black', 'Kopashnovo', 'Black', '0750344156');
insert into Student  values ('ST0003', '2005-01-22', 'Thomas Webb', 'Oklahoma City', 'Webb', '0750344156');
insert into Student  values ('ST0004', '2005-11-10', 'Betty Daniels', 'Agualva de Cima', 'Daniels', '0750344156');
insert into Student  values ('ST0005', '2005-04-19', 'Lisa Welch', 'Kohila', 'Welch', '0750344156');
insert into Student  values ('ST0006', '2005-02-02', 'Kathy Stone', 'Bernardo de Irigoyen', 'Stone', '0750344156');
insert into Student  values ('ST0007', '2005-09-17', 'Christina Johnston', 'Barobo', 'Johnston', '0750344156');
insert into Student  values ('ST0008', '2005-06-25', 'Joshua Butler', 'Al Qurayn', 'Butler', '0750344156');
insert into Student  values ('ST0009', '2005-09-08', 'Jimmy Freeman', 'Ambatofinandrahana', 'Freeman', '0750344156');
insert into Student  values ('ST0010', '2005-08-16', 'Karen Clark', 'Shanmei', 'Clark', '0750344156');
insert into Student  values ('ST0011', '2005-10-23', 'Stephanie Bryant', 'Mirzec', 'Bryant', '0750344156');
insert into Student  values ('ST0012', '2005-02-19', 'Gerald Reed', 'Buchlovice', 'Reed', '0750344156');
insert into Student  values ('ST0013', '2005-04-11', 'Chris Bell', 'Lugouqiao', 'Bell', '0750344156');
insert into Student  values ('ST0014', '2005-01-29', 'Jeffrey Simpson', 'Palekastro', 'Simpson', '0750344156');
insert into Student  values ('ST0015', '2005-03-07', 'Harold Ward', 'Kibondo', 'Ward','0750344156');
insert into Student  values ('ST0016', '2005-05-29', 'Samuel Hernandez', 'Yaojiaji', 'Hernandez', '0750344156');
insert into Student  values ('ST0017', '2005-09-26', 'Carol Cox', 'Maoshan', 'Cox', '0750344156');
insert into Student  values ('ST0018', '2005-03-06', 'Jimmy Andrews', 'Yangzi', 'Andrews','0750344156');
insert into Student  values ('ST0019', '2005-06-13', 'Jerry Wallace', 'Brześć Kujawski', 'Wallace', '0750344156');
insert into Student  values ('ST0020', '2005-07-19', 'Anthony Duncan', 'Oemanu', 'Duncan','0750344156');
insert into Student  values ('ST0021', '2005-08-18', 'Raymond Owens', 'Plateliai', 'Owens','0750344156');
insert into Student  values ('ST0022', '2005-07-17', 'Phyllis Clark', 'Duncan', 'Clark','0750344156');

-- 2015 grade 4 student
 
insert into Student  values ('ST0023', '2006-01-26', 'Janice Hicks', 'Staroderevyankovskaya', 'Hicks', '0750344156');
insert into Student  values ('ST0024', '2006-05-27', 'Teresa Crawford', 'Vom', 'Crawford','0750344156');
insert into Student  values ('ST0025', '2006-11-28', 'Kathleen Cooper', 'Meadow Lake', 'Cooper','0750344156');
insert into Student  values ('ST0026', '2006-01-10', 'Billy Andrews', 'Makueni', 'Andrews', '0750344156');
insert into Student  values ('ST0027', '2006-08-05', 'Terry Kim', 'Communal', 'Kim', '0750344156');
insert into Student  values ('ST0028', '2006-04-14', 'Deborah Reynolds', 'Bagrāmī', 'Reynolds','0750344156');
insert into Student  values ('ST0029', '2006-10-08', 'Jennifer Garcia', 'Bahía Blanca', 'Garcia', '0750344156');
insert into Student  values ('ST0030', '2006-07-17', 'Stephanie Morales', 'Ágios Týchon', 'Morales', '0750344156');
insert into Student  values ('ST0031', '2006-03-13', 'Shawn Reed', 'Aleg', 'Reed','0750344156');
insert into Student  values ('ST0032', '2006-02-09', 'Julie Stewart', 'Bobo-Dioulasso', 'Stewart','0750344156');
insert into Student  values ('ST0033', '2006-10-07', 'Cheryl Schmidt', 'Liquan Chengguanzhen', 'Schmidt','0750344156');
insert into Student  values ('ST0034', '2006-03-25', 'Beverly Richardson', 'Almere Haven', 'Richardson','0750344156');
insert into Student  values ('ST0035', '2006-06-08', 'Paul Green', 'Sipe Sipe', 'Green','0750344156');
insert into Student  values ('ST0036', '2006-08-09', 'Ruby Kim', 'Tianhekou', 'Kim','0750344156');
insert into Student  values ('ST0037', '2006-05-20', 'Phyllis Dunn', 'Kimakamak', 'Dunn','0750344156');
insert into Student  values ('ST0038', '2006-01-07', 'Antonio Schmidt', 'Jinchang', 'Schmidt','0750344156');
insert into Student  values ('ST0039', '2006-05-28', 'John Harris', 'Lovas', 'Harris','0750344156');
insert into Student  values ('ST0040', '2006-07-28', 'Jose Coleman', 'Huangzhan', 'Coleman','0750344156');
insert into Student  values ('ST0041', '2006-06-30', 'Robin Carpenter', 'Longkali', 'Carpenter','0750344156');
insert into Student  values ('ST0042', '2006-05-30', 'Sarah Vasquez', 'Dobre', 'Vasquez','0750344156');

--2015 grade 3 student

insert into Student  values ('ST0043', '2007-03-04', 'Craig Ford', 'Bykivka', 'Ford','0750344156');
insert into Student  values ('ST0044', '2007-06-14', 'Ralph Gardner', 'Eastern Suburbs Mc', 'Gardner','0750344156');
insert into Student  values ('ST0045', '2007-01-26', 'Paul Lawson', 'Bowen Island', 'Lawson','0750344156');
insert into Student  values ('ST0046', '2007-03-27', 'Michelle Hunter', 'Campos Belos', 'Hunter','0750344156');
insert into Student  values ('ST0047', '2007-05-27', 'Janice Davis', 'Hexi', 'Davis','0750344156');
insert into Student  values ('ST0048', '2007-04-07', 'Phyllis Stewart', 'Abengourou', 'Stewart','0750344156');
insert into Student  values ('ST0049', '2007-11-08', 'Karen Ray', 'Kaom', 'Ray', '0750344156');
insert into Student  values ('ST0050', '2007-01-23', 'Paula Bowman', 'Fernandópolis', 'Bowman','0750344156');
insert into Student  values ('ST0051', '2007-03-19', 'Evelyn Chapman', 'Xinhuang', 'Chapman','0750344156');
insert into Student  values ('ST0052', '2007-03-02', 'Frank Bennett', 'Kosino', 'Bennett','0750344156');
insert into Student  values ('ST0053', '2007-09-01', 'Jack Fernandez', 'Los Angeles', 'Fernandez','0750344156');
insert into Student  values ('ST0054', '2007-11-14', 'Janet Lewis', 'Rozwadza', 'Lewis','0750344156');
insert into Student  values ('ST0055', '2007-02-24', 'Christine Hill', 'Rizal', 'Hill','0750344156');
insert into Student  values ('ST0056', '2007-04-10', 'Jonathan Baker', 'San Esteban', 'Baker','0750344156');
insert into Student  values ('ST0057', '2007-06-20', 'Beverly Hall', 'Pārūn', 'Hall','0750344156');
insert into Student  values ('ST0058', '2007-09-05', 'Carol Turner', 'Sishilichengzi', 'Turner', '0750344156');
insert into Student  values ('ST0059', '2007-05-01', 'Anne Rice', 'Bridgetown', 'Rice','0750344156');
insert into Student  values ('ST0060', '2007-08-17', 'Sean Simmons', 'Yoshikawa', 'Simmons','0750344156');
insert into Student  values ('ST0061', '2007-05-19', 'Judith Woods', 'Ishim', 'Woods','0750344156');
insert into Student  values ('ST0062', '2007-09-14', 'Jeffrey Lopez', 'Serra de Santa Marinha', 'Lopez','0750344156');

--2016 grade 3 student

insert into Student  values ('ST0063', '2008-06-16', 'Larry Gilbert', 'Privlaka', 'Gilbert', '0750344156');
insert into Student  values ('ST0064', '2008-09-25', 'Frank Brooks', 'Kebonsari', 'Brooks', '0750344156');
insert into Student  values ('ST0065', '2008-01-16', 'Christina Coleman', 'Poncokusumo', 'Coleman', '0750344156');
insert into Student  values ('ST0066', '2008-10-06', 'Cynthia Sims', 'Oslo', 'Sims', '0750344156');
insert into Student  values ('ST0067', '2008-10-02', 'Linda Fisher', 'Debrecen', 'Fisher','0750344156');
insert into Student  values ('ST0068', '2008-04-30', 'Sean Henry', 'Parawan', 'Henry', '0750344156');
insert into Student  values ('ST0069', '2008-08-23', 'Paul Moreno', 'Pescadería', 'Moreno', '0750344156');
insert into Student  values ('ST0070', '2008-06-14', 'Ruth Kim', 'Avanca', 'Kim', '0750344156');
insert into Student  values ('ST0071', '2008-04-03', 'Johnny Ford', 'Chauk', 'Ford', '0750344156');
insert into Student  values ('ST0072', '2008-11-16', 'Phillip Hanson', 'Esil', 'Hanson','0750344156');
insert into Student  values ('ST0073', '2008-05-18', 'Sara Dean', 'Kolobovo', 'Dean','0750344156');
insert into Student  values ('ST0074', '2008-09-14', 'Virginia Morrison', 'Honda', 'Morrison','0750344156');
insert into Student  values ('ST0075', '2008-11-27', 'Martha Ortiz', 'Saskylakh', 'Ortiz','0750344156');
insert into Student  values ('ST0076', '2008-03-24', 'Lori Hamilton', 'Pucangkrajan', 'Hamilton','0750344156');
insert into Student  values ('ST0077', '2008-09-12', 'Terry Fisher', 'Sacotes', 'Fisher','0750344156');
insert into Student  values ('ST0078', '2008-09-20', 'Ann Kelly', 'Embarcación', 'Kelly','0750344156');
insert into Student  values ('ST0079', '2008-11-26', 'Kathryn Ramirez', 'Caburan', 'Ramirez','0750344156');
insert into Student  values ('ST0080', '2008-11-16', 'Roy Castillo', 'Mao’er', 'Castillo','0750344156');

insert into Student  values ('ST0081', '2006-04-07', 'Stephanie Grant', 'Xinmin', 'Grant','0750344156');
insert into Student  values ('ST0082', '2006-07-05', 'Ronald Snyder', 'Qilong', 'Snyder', '0750344156');
insert into Student  values ('ST0083', '2006-04-08', 'Stephanie Oliver', 'Acton Vale', 'Oliver', '0750344156');
insert into Student  values ('ST0084', '2006-01-02', 'Clarence Gilbert', 'Benguela', 'Gilbert','0750344156');
insert into Student  values ('ST0085', '2006-06-16', 'Cynthia Thomas', 'Koran', 'Thomas','0750344156');
insert into Student  values ('ST0086', '2006-11-28', 'Ruth White', 'Longhe', 'White','0750344156');
insert into Student  values ('ST0087', '2006-10-24', 'Teresa Holmes', 'Novaya Tavolzhanka', 'Holmes', '0750344156');
insert into Student  values ('ST0088', '2006-07-15', 'Irene Nichols', 'Al Matlīn', 'Nichols','0750344156');
insert into Student  values ('ST0089', '2006-09-06', 'John Webb', 'Budapest', 'Webb','0750344156');



INSERT INTO Class1 values('CL001','03','Monday','500','2015');
INSERT INTO Class1 values('CL002','03','Tuesday','500','2015');
INSERT INTO Class1 values('CL003','04','Wednsday','600','2015');
INSERT INTO Class1 values('CL004','04','Thursday','600','2015');
INSERT INTO Class1 values('CL005','05','Saturday','800','2015');
INSERT INTO Class1 values('CL006','05','Sunday','800','2015');
INSERT INTO Class1 values('CL007','03','Monday','500','2016');
INSERT INTO Class1 values('CL008','03','Tuesday','500','2016');
INSERT INTO Class1 values('CL009','04','Wednsday','600','2016');
INSERT INTO Class1 values('CL010','04','Thursday','600','2016');
INSERT INTO Class1 values('CL011','05','Saturday','800','2016');
INSERT INTO Class1 values('CL012','05','Sunday','800','2016');

--grade 3 registration 2015

INSERT INTO Registration values('CL001','ST0043','2015');
INSERT INTO Registration values('CL001','ST0044','2015');
INSERT INTO Registration values('CL001','ST0044','2015');
INSERT INTO Registration values('CL001','ST0045','2015');
INSERT INTO Registration values('CL001','ST0046','2015');
INSERT INTO Registration values('CL001','ST0047','2015');
INSERT INTO Registration values('CL001','ST0048','2015');
INSERT INTO Registration values('CL001','ST0049','2015');
INSERT INTO Registration values('CL001','ST0050','2015');
INSERT INTO Registration values('CL001','ST0051','2015');
INSERT INTO Registration values('CL002','ST0052','2015');
INSERT INTO Registration values('CL002','ST0053','2015');
INSERT INTO Registration values('CL002','ST0054','2015');
INSERT INTO Registration values('CL002','ST0055','2015');
INSERT INTO Registration values('CL002','ST0056','2015');
INSERT INTO Registration values('CL002','ST0057','2015');
INSERT INTO Registration values('CL002','ST0058','2015');
INSERT INTO Registration values('CL002','ST0059','2015');
INSERT INTO Registration values('CL002','ST0060','2015');
INSERT INTO Registration values('CL002','ST0061','2015');
INSERT INTO Registration values('CL002','ST0062','2015');

--grade 4 registration 2015


INSERT INTO Registration values('CL003','ST0023','2015');
INSERT INTO Registration values('CL003','ST0024','2015');
INSERT INTO Registration values('CL003','ST0025','2015');
INSERT INTO Registration values('CL003','ST0026','2015');
INSERT INTO Registration values('CL003','ST0027','2015');
INSERT INTO Registration values('CL003','ST0028','2015');
INSERT INTO Registration values('CL003','ST0029','2015');
INSERT INTO Registration values('CL003','ST0030','2015');
INSERT INTO Registration values('CL003','ST0031','2015');
INSERT INTO Registration values('CL003','ST0032','2015');
INSERT INTO Registration values('CL003','ST0033','2015');
INSERT INTO Registration values('CL003','ST0034','2015');
INSERT INTO Registration values('CL004','ST0035','2015');
INSERT INTO Registration values('CL004','ST0036','2015');
INSERT INTO Registration values('CL004','ST0037','2015');
INSERT INTO Registration values('CL004','ST0038','2015');
INSERT INTO Registration values('CL004','ST0039','2015');
INSERT INTO Registration values('CL004','ST0040','2015');
INSERT INTO Registration values('CL004','ST0041','2015');
INSERT INTO Registration values('CL004','ST0042','2015');

--frade 5 registration 2015

INSERT INTO Registration values('CL005','ST0001','2015');
INSERT INTO Registration values('CL005','ST0002','2015');
INSERT INTO Registration values('CL005','ST0003','2015');
INSERT INTO Registration values('CL005','ST0004','2015');
INSERT INTO Registration values('CL005','ST0005','2015');
INSERT INTO Registration values('CL005','ST0006','2015');
INSERT INTO Registration values('CL005','ST0007','2015');
INSERT INTO Registration values('CL005','ST0008','2015');
INSERT INTO Registration values('CL005','ST0009','2015');
INSERT INTO Registration values('CL005','ST0010','2015');
INSERT INTO Registration values('CL005','ST0011','2015');
INSERT INTO Registration values('CL005','ST0012','2015');
INSERT INTO Registration values('CL005','ST0013','2015');
INSERT INTO Registration values('CL006','ST0014','2015');
INSERT INTO Registration values('CL006','ST0015','2015');
INSERT INTO Registration values('CL006','ST0016','2015');
INSERT INTO Registration values('CL006','ST0017','2015');
INSERT INTO Registration values('CL006','ST0018','2015');
INSERT INTO Registration values('CL006','ST0019','2015');
INSERT INTO Registration values('CL006','ST0020','2015');
INSERT INTO Registration values('CL006','ST0021','2015');
INSERT INTO Registration values('CL006','ST0022','2015');

--grade 3 registration 2016

INSERT INTO Registration values('CL007','ST0063','2016');
INSERT INTO Registration values('CL007','ST0064','2016');
INSERT INTO Registration values('CL007','ST0065','2016');
INSERT INTO Registration values('CL007','ST0066','2016');
INSERT INTO Registration values('CL007','ST0067','2016');
INSERT INTO Registration values('CL007','ST0068','2016');
INSERT INTO Registration values('CL007','ST0069','2016');
INSERT INTO Registration values('CL007','ST0070','2016');
INSERT INTO Registration values('CL007','ST0071','2016');
INSERT INTO Registration values('CL007','ST0072','2016');
INSERT INTO Registration values('CL007','ST0073','2016');
INSERT INTO Registration values('CL008','ST0074','2016');
INSERT INTO Registration values('CL008','ST0075','2016');
INSERT INTO Registration values('CL008','ST0076','2016');
INSERT INTO Registration values('CL008','ST0077','2016');
INSERT INTO Registration values('CL008','ST0078','2016');
INSERT INTO Registration values('CL008','ST0079','2016');
INSERT INTO Registration values('CL008','ST0080','2016');

--grade 4 registration 2016


INSERT INTO Registration values('CL009','ST0043','2016');
INSERT INTO Registration values('CL009','ST0044','2016');
INSERT INTO Registration values('CL009','ST0044','2016');
INSERT INTO Registration values('CL009','ST0045','2016');
INSERT INTO Registration values('CL009','ST0048','2016');
INSERT INTO Registration values('CL009','ST0049','2016');
INSERT INTO Registration values('CL009','ST0050','2016');
INSERT INTO Registration values('CL009','ST0051','2016');
INSERT INTO Registration values('CL010','ST0052','2016');
INSERT INTO Registration values('CL010','ST0053','2016');
INSERT INTO Registration values('CL010','ST0054','2016');
INSERT INTO Registration values('CL010','ST0055','2016');
INSERT INTO Registration values('CL010','ST0058','2016');
INSERT INTO Registration values('CL010','ST0059','2016');
INSERT INTO Registration values('CL010','ST0060','2016');
INSERT INTO Registration values('CL010','ST0061','2016');
INSERT INTO Registration values('CL010','ST0062','2016');

--grade 5 registration 2016


INSERT INTO Registration values('CL011','ST0023','2016');
INSERT INTO Registration values('CL011','ST0024','2016');
INSERT INTO Registration values('CL011','ST0025','2016');
INSERT INTO Registration values('CL011','ST0026','2016');
INSERT INTO Registration values('CL011','ST0027','2016');
INSERT INTO Registration values('CL011','ST0028','2016');
INSERT INTO Registration values('CL011','ST0029','2016');
INSERT INTO Registration values('CL011','ST0030','2016');
INSERT INTO Registration values('CL011','ST0081','2016');
INSERT INTO Registration values('CL011','ST0082','2016');
INSERT INTO Registration values('CL011','ST0083','2016');
INSERT INTO Registration values('CL011','ST0084','2016');
INSERT INTO Registration values('CL011','ST0085','2016');
INSERT INTO Registration values('CL012','ST0086','2016');
INSERT INTO Registration values('CL012','ST0087','2016');
INSERT INTO Registration values('CL012','ST0088','2016');
INSERT INTO Registration values('CL012','ST0089','2016');
INSERT INTO Registration values('CL012','ST0040','2016');
INSERT INTO Registration values('CL012','ST0041','2016');
INSERT INTO Registration values('CL012','ST0042','2016');



---check sql quaries

Insert into Attendence Values('CL012','ST0089','2016-05-22','0');
Select * From Attendence where classId='CL012' and dateAttended='2016-05-22';
Select * From Attendence where classId='CL012' and studentId='ST0089';
update attendence set status='1' where classId='CL012' and studentId='ST0089' and dateAttended='2016-05-22';


select count(distinct classId)  from Class1;
Select * From Class1;
Select * From Class1 where year2=(select year(curdate()));
Select * from Class1 where classId='CL001';
Insert into Class1 Values('CL013','3','Wednesday','500','2017');
update Class1 set grade='3', conductedDate = 'Wednesday',classFeesAmount='450.00',year2='2017' where classId='CL013';

Insert into ClassFees Values('CL012','ST0089','6','2016-05-22');
Select studentId From classFees where classId='CL012' and month1='6';
Select studentId from registration where classid='CL012' and studentId not in(Select studentId From classFees where classId='CL012' and month1='6');

select count(distinct paperId)  from Paper;
Insert into paper Values('P003','CL012','2016-05-22','56','3','78','45.67');
Select * From paper;
Select * from paper where paperId='P003';
update paper set  numberOfFacedStudent ='57',topscore='80',average='45.67' where paperId='P003';
Select * From  paper where classId='CL012';

Insert into Exam Values('ST0089','P003','89','5');
Select * From exam where paperId='P003' order by rank2;
Select * From exam where studentId='ST0089';
update Exam set mark='90' ,rank2='4' where studentId='ST0089' and paperId='P003';
