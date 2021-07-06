CREATE DATABASE IF NOT EXISTS carshop
    COLLATE utf8_general_ci;

USE carshop;

DROP TABLE IF EXISTS car;

CREATE TABLE car
(
    id               BIGINT(20)    PRIMARY KEY NOT NULL AUTO_INCREMENT,
    make             VARCHAR(50)   NULL,
    model            VARCHAR(50)   NULL,
    bodyType         VARCHAR(50)   NULL,
    prodDate         date          NULL,
    transmissionType VARCHAR(50)   NULL,
    exteriorColor    VARCHAR(50)   NULL,
    interiorColor    VARCHAR(50)   NULL,
    engine           DOUBLE        NULL,
    driveTrain       VARCHAR(50)   NULL,
    price            DOUBLE        NULL,
    fuelType         VARCHAR(50)   NULL,
    kilometres       DOUBLE        NULL
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

insert into car(make, model, bodyType, prod_date, transmissionType, exteriorColor, interiorColor, engine, driveTrain, price, fuelType, kilometres)
values ('Mazda', '3', 'SEDAN', '2010-01-01', 'AUTOMATIC', 'Red', 'Black', 1.4, 'FF', 3100, 'GASOLINE', 42500)
     , ('Volvo', 'XC90', 'HATCHBACK', '2011-01-01', 'AUTOMATIC', 'Grey', 'White', 2.0, 'FOURWD', 7000, 'DIESEL', 27000)
     , ('BMW', 'Z4', 'CONVERTIBLE', '2012-01-01', 'AUTOMATIC', 'White', 'Black', 3.0, 'MR', 8200, 'GASOLINE', 31250)
     , ('Peugeot', '308', 'CONVERTIBLE', '2012-01-01', 'MANUAL', 'White', 'Black', 1.6, 'FF', 2700, 'GASOLINE', 40300)
     , ('VW', 'Touran II', 'MINIVAN', '2010-01-01', 'CVT', 'Brown', 'Black', 1.4, 'FF', 6250, 'GASOLINE', 10000)
     , ('Citroen', 'Berlingo II', 'MINIVAN', '2010-01-01', 'MANUAL', 'Black', 'Black', 1.4, 'FF', 2500, 'GASOLINE', 56500)
     , ('Volvo', 'V60', 'STATIONWAGON', '2016-01-01', 'AUTOMATIC', 'White', 'Red', 2.4, 'FOURWD', 10000, 'DIESEL', 7500)
     , ('Kia', 'Ceed 3', 'STATIONWAGON', '2019-01-01', 'AUTOMATIC', 'Gray', 'Indigo', 1.4, 'FF', 4700, 'GASOLINE', 6500)
     , ('Audi', 'A5', 'COUPE', '2011-01-01', 'CVT', 'White', 'Black', 1.8, 'FF', 7000, 'GASOLINE', 55000)
     , ('Ford', 'Ranger 3', 'PICKUP', '2010-01-01', 'AUTOMATIC', 'White', 'Black', 2.2, 'FOURWD', 5900, 'DIESEL', 40000);