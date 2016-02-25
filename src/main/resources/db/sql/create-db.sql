--DROP TABLE users IF EXISTS;

CREATE TABLE users (
  id    INTEGER PRIMARY KEY,
  name  VARCHAR(50),
  phone VARCHAR(50),
  email VARCHAR(50)
);

--DROP TABLE books IF EXISTS;

CREATE TABLE books (
  id     INTEGER PRIMARY KEY,
  title  VARCHAR(1024),
  author VARCHAR(50),
  ISBN   VARCHAR(50)
);

--DROP TABLE loans IF EXISTS;

CREATE TABLE loans (
  id     INTEGER PRIMARY KEY,
  userid INTEGER,
  bookid INTEGER
);
