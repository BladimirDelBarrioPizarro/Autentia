drop table course if exists;

CREATE TABLE public.course (
        id SERIAL primary key NOT NULL,
        active BOOLEAN,
        professor character varying(100) NOT NULL,
        title character varying(100) NOT NULL,
        level character varying(100) NOT NULL,
        hours integer NOT NULL
);

INSERT INTO COURSE (active,professor,title,level,hours) VALUES (true,'Roberto Canales','Introducción a JSF 2','Intermedio',25);
INSERT INTO COURSE (active,professor,title,level,hours) VALUES (true,'David Goméz','Novedades en Java 8','Básico',10);
INSERT INTO COURSE (active,professor,title,level,hours) VALUES (true,'Alberto Moratilla','Java para sistemas','Básico',25);
INSERT INTO COURSE (active,professor,title,level,hours) VALUES (true,'Rubén Aguilera','Angular 2','Intermedio',25);
INSERT INTO COURSE (active,professor,title,level,hours) VALUES (false,'Rubén Aguilera','React','Intermedio',10);

