CREATE DATABASE IF NOT EXISTS carshop
    COLLATE utf8_general_ci;

USE carshop;

DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    id               BIGINT(20)    PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name             VARCHAR(50)   NULL,
    surname          VARCHAR(50)   NULL,
    dob              date          NULL,
    sex              VARCHAR(50)   NULL,
    salary           DOUBLE        NULL,
    department       VARCHAR(50)   NULL,
    position         VARCHAR(50)   NULL
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

insert into employee(name, surname, dob, sex, salary, department, position)
values ('Ivan', 'Korznev', '1988-01-027', 'MALE', '4000', 'SALES', 'Lead')
     , ('Sonya', 'Smirnova', '1998-05-12', 'FEMALE', '3500', 'HR', 'Senior')
     , ('Nikita', 'Semenov', '1994-10-10', 'MALE', '4100', 'LEGAL', 'Lead')
     , ('Olga', 'Harrison', '1983-02-20', 'FEMALE', '5100', 'ACCOUNTING', 'Senior')
     , ('Ivan', 'Akimov', '1997-09-12', 'MALE', '3500', 'SALES', 'Junior')
     , ('Dmitriy', 'Gurkin', '1991-11-05', 'MALE', '4000', 'SALES', 'Senior')
     , ('Alina', 'Ketsu', '1990-06-02', 'FEMALE', '4200', 'LEGAL', 'Lead');