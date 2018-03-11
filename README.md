# CarritoCompras
carrito de compras con Java, PostgreSQL y HTML

El proyecto inicialmente se comenzó a trabajar con Java Web, de la mano de un Servlet y codigo html desde cero, esperamos poder implementar bootstrap o algun framework como primefaces para mejorar su apariencia.


antes de ejecutar el proyecto en netbeans se debe adecuar el entorno:

1- Montar un servidor web como tomcat, Glashfish, entre otros.
2. Conetarsea servidor en PostgreSQL. Luego crear lo siguiente:

Usuario: admin
Contraseña: admin
 
#Crear la base de datos:
CREATE DATABASE compras
    WITH 
    OWNER = admin
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


#crear tabla de usuarios para login
CREATE TABLE public.usuario
(
    "user" text NOT NULL,
    password text NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to admin;

#crear usuario y contraseña por default a su preferencia. Ejemplo:
INSERT INTO public.usuario(
	"user", password)
	VALUES ('admin', 'admin');


