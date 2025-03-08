CREATE TABLE IF NOT EXISTS USER (
  user_id INTEGER AUTO_INCREMENT PRIMARY KEY,
  username TEXT NOT NULL,
  password BINARY(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS USER_ROLE_MAPPING (
  user_role_mapping_id INTEGER AUTO_INCREMENT PRIMARY KEY,
  user_id INTEGER NOT NULL,
  role TEXT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES USER(user_id)
);

INSERT INTO USER(user_id, username, password) VALUES (1, 'robertw', '$2a$12$crj5FU3E694kracICnbXkuqSXpzRjTSWp0mB37lR4SiTc8/2y2/zC');
INSERT INTO USER(user_id, username, password) VALUES (2, 'michaelw', '$2a$12$crj5FU3E694kracICnbXkuqSXpzRjTSWp0mB37lR4SiTc8/2y2/zC');
INSERT INTO USER(user_id, username, password) VALUES (3, 'maxw', '$2a$12$crj5FU3E694kracICnbXkuqSXpzRjTSWp0mB37lR4SiTc8/2y2/zC');

INSERT INTO USER_ROLE_MAPPING(user_role_mapping_id, user_id, role) VALUES(1, 1, 'USER');
INSERT INTO USER_ROLE_MAPPING(user_role_mapping_id, user_id, role) VALUES(2, 2, 'USER');
INSERT INTO USER_ROLE_MAPPING(user_role_mapping_id, user_id, role) VALUES(3, 2, 'ADMIN');
INSERT INTO USER_ROLE_MAPPING(user_role_mapping_id, user_id, role) VALUES(4, 3, 'NO_ROLE');