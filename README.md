# ejemplo
Hola

1.- Ejecutar con mvnw spring-boot:run

2.- Visitar http://localhost:8080/


**Notas
1.-No se implementa zkoss debido a que el framework se ejecuta del lado del servidor y no me parece el correcto para ser usado con servicios REST 
  (Posiblemente esté equivocado, desconozco el framework zkoss)

2.-No se implementa JasperReports por falta de tiempo

Saludos. Muchas gracias. 

--===================================
Se modificó un poco el script de BD

create table t_alumnos (
id_t_usuarios SERIAL not null PRIMARY KEY,
nombre varchar (80),
ap_paterno varchar(80),
ap_materno varchar(80),
activo int 
) ;
insert into t_alumnos values (default,'John','Dow','Down',1);
create table t_materias (
id_t_materias SERIAL not null PRIMARY KEY,
nombre varchar(80),
activo int 
) ;
insert into t_materias values (default,'matematicas',1); insert
into t_materias values (default,'programacion I',1); insert into
t_materias values (default,'ingenieria de sofware',1);
create table t_calificaciones (
id_t_calificaciones SERIAL not null PRIMARY KEY,
id_t_materias int not null,
id_t_usuarios int not null,
calificacion decimal (10,2),
fecha_registro date,
foreign key (id_t_materias) references t_materias (id_t_materias),
foreign key (id_t_materias) references t_materias (id_t_materias) )
;
