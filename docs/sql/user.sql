CREATE TABLE user(
  id INT NOT NULL au PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  age INT
);

INSERT INTO user(name, age) VALUES ('Tom', 22);
INSERT INTO user(name, age) VALUES ('Jack', 20);
INSERT INTO user(name, age) VALUES ('Jerry', 21);
