CREATE TABLE movie
(
  id     BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title VARCHAR(255),
  director  VARCHAR(255),
  genre  VARCHAR(255),
  rating INT(11)                NOT NULL,
  year   INT(11)                NOT NULL
);
