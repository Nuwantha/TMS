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

INSERT INTO Student values("ST0001","2007-03-12","sachin","no 75","rohith","0702324332");
INSERT INTO Student values("ST0002","2007-07-12","virat","no 02","pathiv","0705423232");
INSERT INTO Student values("ST0003","2008-03-12","galle","no 01","raudu","0702324334");
INSERT INTO Student values("ST0004","2007-03-25","AB","no 03","pollad","0702324356");
INSERT INTO Student values("ST0005","2007-03-30","jadev","no 88","buttler","0702324388");
INSERT INTO Student values("ST0006","2007-04-12","imran","no 99","soutee","0702324786");
INSERT INTO Student values("ST0007","2007-05-12","richadson","no 78","mackleran","0702324335");
INSERT INTO Student values("ST0008","2007-06-13","samshi","no 55","bumra","0702324389");

INSERT INTO Student values("ST0009","2006-03-12","dawarn","no 75","rohith","0702324332");
INSERT INTO Student values("ST0010","2006-07-12","warner","no 02","pathiv","0705423232");
INSERT INTO Student values("ST0011","2006-03-12","wilianson","no 01","raudu","0702324334");
INSERT INTO Student values("ST0012","2006-03-25","yuvarai","no 03","pollad","0702324356");
INSERT INTO Student values("ST0013","2006-03-30","moises","no 88","buttler","0702324388");
INSERT INTO Student values("ST0014","2006-04-12","hendriques","no 99","soutee","0702324786");
INSERT INTO Student values("ST0015","2006-05-12","buwaneshwar","no 78","mackleran","0702324335");
INSERT INTO Student values("ST0016","2006-06-13","nera","no 55","bumra","0702324389");

INSERT INTO Student values("ST0017","2005-03-12","dhoni","no 75","rohith","0702324332");
INSERT INTO Student values("ST0018","2005-07-12","kawaja","no 02","pathiv","0705423232");
INSERT INTO Student values("ST0019","2005-03-12","rahane","no 01","raudu","0702324334");
INSERT INTO Student values("ST0020","2005-03-25","thisara","no 03","pollad","0702324356");
INSERT INTO Student values("ST0021","2005-03-30","perera","no 88","buttler","0702324388");
INSERT INTO Student values("ST0022","2005-04-12","baily","no 99","soutee","0702324786");
INSERT INTO Student values("ST0023","2005-05-12","smith","no 78","mackleran","0702324335");
INSERT INTO Student values("ST0024","2005-06-13","dufesis","no 55","bumra","0702324389");



INSERT INTO Class1 values('CL001','03','Monday','500','2016');
INSERT INTO Class1 values('CL002','03','Tuesday','500','2016');
INSERT INTO Class1 values('CL003','04','Wednsday','600','2016');
INSERT INTO Class1 values('CL004','04','Thursday','600','2016');
INSERT INTO Class1 values('CL005','05','Saturday','800','2016');
INSERT INTO Class1 values('CL006','05','Sunday','800','2016');

INSERT INTO Registration values('CL001','ST0001','2016');
INSERT INTO Registration values('CL001','ST0002','2016');
INSERT INTO Registration values('CL001','ST0003','2016');
INSERT INTO Registration values('CL001','ST0004','2016');

INSERT INTO Registration values('CL002','ST0005','2016');
INSERT INTO Registration values('CL002','ST0006','2016');
INSERT INTO Registration values('CL002','ST0007','2016');

INSERT INTO Registration values('CL003','ST0009','2016');
INSERT INTO Registration values('CL003','ST0010','2016');
INSERT INTO Registration values('CL003','ST0011','2016');
INSERT INTO Registration values('CL003','ST0012','2016');

