drop table course if exists;

CREATE TABLE public.course (
        id SERIAL primary key NOT NULL,
        active BOOLEAN,
        professor character varying(100) NOT NULL,
        title character varying(100) NOT NULL,
        level character varying(100) NOT NULL,
        hours integer NOT NULL
);

INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('Introducción a JSF 2',true,'Roberto Canales','Intermedio',25);
INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('Clean Code',false,'Robert C Martin','Básico',10);
INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('Novedades en Java 8',true,'David Goméz','Básico',10);
INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('Java para sistemas',true,'Alberto Moratilla','Básico',25);
INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('Angular 2',true,'Rubén Aguilera','Intermedio',25);
INSERT INTO COURSE (title,active,professor,level,hours) VALUES ('React',false,'Rubén Aguilera','Intermedio',10);


