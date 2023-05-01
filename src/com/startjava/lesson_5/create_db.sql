DROP DATABASE IF EXISTS Jagers;

CREATE DATABASE Jagers;

\c jagers;

DROP TABLE IF EXISTS Jagers;

CREATE TABLE Jagers (
id        SERIAL PRIMARY KEY,
modelName TEXT,
mark      CHAR(6),
height    INTEGER,
weight    DECIMAL(5, 3),
status    TEXT,
origin    TEXT,
launch    DATE,
kaijuKill INT
);

\i init_db.sql

\i queries.sql