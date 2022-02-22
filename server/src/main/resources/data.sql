DROP TABLE IF EXISTS Card;
CREATE TABLE Card (
  id INT AUTO_INCREMENT PRIMARY KEY,
  card_number INT NOT NULL,
  password INT NOT NULL,
  balance NUMBER DEFAULT 0,
  currency VARCHAR(3) DEFAULT 'RUB',
  id_client INT NOT NULL,
  foreign key (id_client) references Client(id)
);

DROP TABLE IF EXISTS Client;
CREATE TABLE Client (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name varchar(50) NOT NULL,
  surname varchar(50) NOT NULL
);


INSERT INTO Card (card_number, password, balance, currency, id_client) VALUES
  (15232, 1324, 56007.67, 'RUB', 1),
  (24340, 2847, 357.67, 'USD', 2),
  (32348, 3832, 3000457.67, 'RUB', 3);


INSERT INTO Client (name, surname) VALUES
  ('Client_name1', 'Client_surname1'), -- id: 1
  ('Client_name2', 'Client_surname2'), -- id: 2
  ('Client_name3', 'Client_surname3'); -- id: 3