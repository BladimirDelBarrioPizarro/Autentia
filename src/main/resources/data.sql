drop table course_professor if exists;
drop table professor if exists;
drop table course if exists;

CREATE TABLE public.course (
        id SERIAL primary key NOT NULL,
        active BOOLEAN,
        title character varying(100) NOT NULL,
        level character varying(100) NOT NULL,
        hours integer NOT NULL
);

INSERT INTO COURSE (title,active,level,hours) VALUES ('Introducción a JSF 2',true,'Intermedio',25);
INSERT INTO COURSE (title,active,level,hours) VALUES ('Clean Code',false,'Básico',10);
INSERT INTO COURSE (title,active,level,hours) VALUES ('Novedades en Java 8',true,'Básico',10);
INSERT INTO COURSE (title,active,level,hours) VALUES ('Java para sistemas',true,'Básico',25);
INSERT INTO COURSE (title,active,level,hours) VALUES ('Angular 2',true,'Intermedio',25);
INSERT INTO COURSE (title,active,level,hours) VALUES ('React',false,'Intermedio',10);




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





