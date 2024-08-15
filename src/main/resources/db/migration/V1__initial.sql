create sequence hospital_sequence as integer increment 1;
create sequence patient_sequence as integer increment 1;
create sequence doctor_sequence as integer increment 1;
create sequence specialty_sequence as integer increment 1;
create sequence visit_sequence as integer increment 1;
create sequence doctor_specialty_sequence as integer increment 1;


create table hospital_db (
id INTEGER PRIMARY KEY,
name VARCHAR(150) NOT NULL,
created_at TIMESTAMP,
created_by TIMESTAMP
);

create table patient (
id INTEGER PRIMARY KEY,
name VARCHAR(150) NOT NULL,
last_name VARCHAR(150) NOT NULL,
direction VARCHAR(150) NOT NULL,
birthdate DATE NOT NULL,
created_at TIMESTAMP,
created_by TIMESTAMP,
hospital_id INTEGER NOT NULL,
FOREIGN KEY (hospital_id) REFERENCES hospital_db(id)
);

create table doctor (
id INTEGER PRIMARY KEY,
name VARCHAR(150) NOT NULL,
last_name VARCHAR(150) NOT NULL,
direction VARCHAR(150) NOT NULL,
birthdate DATE NOT NULL,
created_at TIMESTAMP,
created_by TIMESTAMP,
hospital_id INTEGER NOT NULL,
FOREIGN KEY (hospital_id) REFERENCES hospital_db(id)
);

create table specialty (
id INTEGER PRIMARY KEY,
name VARCHAR(150) NOT NULL,
description VARCHAR(200) NOT NULL,
created_at TIMESTAMP,
created_by TIMESTAMP
);

create table visit (
id INTEGER PRIMARY KEY,
description VARCHAR(200) NOT NULL,
date DATE NOT NULL,
patient_id INTEGER NOT NULL,
doctor_id INTEGER NOT NULL,
FOREIGN KEY (patient_id) REFERENCES patient(id),
FOREIGN KEY (doctor_id) REFERENCES doctor(id),
created_at TIMESTAMP,
created_by TIMESTAMP
);


create table doctor_specialty(
id INTEGER PRIMARY KEY,
doctor_id INTEGER NOT NULL, -- Add doctor_id column
specialty_id INTEGER NOT NULL, -- Add specialty_id column
FOREIGN KEY (doctor_id) REFERENCES doctor(id),
FOREIGN KEY (specialty_id) REFERENCES specialty(id),
created_at TIMESTAMP,
created_by TIMESTAMP
);



