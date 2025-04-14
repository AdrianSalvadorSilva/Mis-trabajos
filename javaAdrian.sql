-- create de DB
create database java_db_Adrian;
use java_db_Adrian;
create table productos(
codigo int auto_increment,
nombre varchar(200) not null,
precio int not null,
primary key(codigo)
);
-- insercion de datos
insert into productos value(default, 'Manzana', 4500);
insert into productos value(default, 'Pera', 3500);

-- autualizacion de datos
update  productos
set nombre ="Pera Nacional" where codigo =1;
-- seleccion de datos
select  * from productos;
select nombre from productos where codigo =1;
select nombre from productos where precio<4000;
-- eliminar datos
delete from productos where codigo =2;
-- verificacion 
select * from productos;
