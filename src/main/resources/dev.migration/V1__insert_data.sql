insert into specialty (id, name, description, created_at , created_by) values
(1, 'Anesthesiology', 'A doctor of anesthesiology—an anesthesiologist—practices anesthesia', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(2, 'Cardiology', 'Cardiology is a subspecialty of internal medicine.', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(3, 'Dermatology', 'A doctor of dermatology—a dermatologist—finds, prevents, and treats diseases of the skin', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(4, 'Forensic', 'Forensic pathology is a subspecialty of pathology that examines cases of sudden', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(5, 'Genetics', 'Medical geneticists evaluate, diagnose, and manage genetic', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(6, 'Internal Medicine', 'Internal medicine is a broad and versatile discipline', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
(7, 'Neurology', 'Neurologists diagnose, treat, and manage conditions of the nervous system', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP);


insert into patient (id, name, last_name, direction, birthdate, created_at, created_by) values
(1, 'Alfonso', 'Romero', 'calle 1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, 'Ana', 'Gallardo', 'calle 2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, 'Lupe', 'Tejerina', 'calle 3', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(4, 'Carlos', 'Byron', 'calle 4', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(5, 'Bryan', 'Quispia', 'calle 5', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into doctor (id, first_name, last_name, age, birthdate, created_at, created_by) values
(1, 'Matias', 'Herbas', 'calle 1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, 'Andrea', 'Arnez', 'calle 2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, 'Freddy', 'Tejerina', 'calle 3', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(4, 'Luis', 'Oropeza', 'calle 4', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(5, 'Harry', 'Delgadillo', 'calle 5', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into hospital (id, first_name, last_name, age, birth_day, user_id) values
(1, 'fn1', 'ln1', 1, null, 1),
(2, 'fn2', 'ln2', 2, null, 2),
(3, 'fn3', 'ln3', 3, null, 3),
(4, 'fn4', 'ln4', 4, null, 4),
(5, 'fn5', 'ln5', 5, null, 5);

insert into visit(id, name, created_at, created_by ) values
(1, 'Cordes', CURRENT_TIMESTAMP, 1),
(2, 'Clinica Mayo', CURRENT_TIMESTAMP, 1),
(3, 'Cleveland Clinic', CURRENT_TIMESTAMP, 1),

