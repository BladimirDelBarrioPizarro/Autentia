drop table course_professor if exists;
drop table professor if exists;
drop table course if exists;

CREATE TABLE public.course (
        id SERIAL primary key NOT NULL,
        active BOOLEAN,
        title character varying(100) NOT NULL,
        level character varying(100) NOT NULL,
        hours integer NOT NULL,
        fileURL character varying(100) NOT NULL
);

INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Introducción a JSF 2',true,'Intermedio',25,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Clean Code',false,'Básico',10,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Novedades en Java 8',true,'Básico',10,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Java para sistemas',true,'Básico',25,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Angular 2',true,'Intermedio',25,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('React',false,'Intermedio',10,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');
INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Spring Cloud',true,'Intermedio',50,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');

/*INSERT INTO COURSE (title,active,level,hours,fileURL) VALUES ('Spring Cloud',true,'Intermedio',50,'blob:http://localhost:4200/064b1660-5cc4-49d5-9a96-62f0007e21bc');*/



CREATE TABLE public.professor (
    id SERIAL NOT NULL,
    name character varying(100) NOT NULL
);

INSERT INTO professor (id,name) VALUES(1,'Roberto Canales');
INSERT INTO professor (id,name) VALUES(2,'Robert C Martin');
INSERT INTO professor (id,name) VALUES(3,'David Goméz');
INSERT INTO professor (id,name) VALUES(4,'Alberto Moratilla');
INSERT INTO professor (id,name) VALUES(5,'Rubén Aguilera');
INSERT INTO professor (id,name) VALUES(6,'Alberto Moratilla');
INSERT INTO professor (id,name) VALUES(7,'Rod Johnson');

CREATE TABLE public.course_professor(
    course_id integer not null,
    professor_id integer not null
);

INSERT INTO course_professor(course_id,professor_id) VALUES (1,1);
INSERT INTO course_professor(course_id,professor_id) VALUES (2,2);
INSERT INTO course_professor(course_id,professor_id) VALUES (3,3);
INSERT INTO course_professor(course_id,professor_id) VALUES (4,4);
INSERT INTO course_professor(course_id,professor_id) VALUES (5,5);
INSERT INTO course_professor(course_id,professor_id) VALUES (6,5);
INSERT INTO course_professor(course_id,professor_id) VALUES (7,7);





