CREATE TABLE if not exists my_db.routes (
  id int NOT NULL,
  name varchar(15),
  description varchar(255),
  PRIMARY KEY (id)
);  

CREATE TABLE if not exists my_db.points (
  route_id int NOT NULL,
  id int NOT NULL AUTO_INCREMENT,
  x float,
  y float,
  PRIMARY KEY (id, route_id),
  FOREIGN KEY (route_id) REFERENCES my_db.routes(id)
);

INSERT INTO my_db.routes (id, name, description) VALUES 
(1, 'Last Way', 'The Route of Titanic'),
(2, 'Iceberg', '');

INSERT INTO my_db.points (id, route_id, x, y) VALUES 
(1, 1, 50.895282, -1.406778),
(2, 1, 50.669618, -0.989620),
(3, 1, 49.650953, -1.615926),
(4, 1, 50.030191, -2.223883),
(5, 1, 49.406091, -6.046549),
(6, 1, 51.782293, -8.254962),
(7, 1, 51.119311, -8.742052),
(8, 1, 41.544905, -46.593560),
(9, 1, 41.4335, -49.5650),
(10, 1, 40.484726, -74.252355),
(1, 2, 41.4335, -49.5650);

CREATE TABLE if not exists my_db.vehicles (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  type ENUM('ship', 'truck', 'train', 'airplane'),
  speed float,
  owner varchar(15),
  description varchar(255),
  route_id int,
  next_route_point_id int,
  cargo varchar(255),
  x float,
  y float,
  PRIMARY KEY (id)
);

INSERT INTO my_db.vehicles (id, name, type, speed, owner, description, route_id, next_route_point_id, cargo, x, y) VALUES 
(1, 'Titanic', 'ship', 23.0, 'White Star Line', '', 1, 2, '', 50.895282, -1.406778),
(2, 'Iceberg', 'ship', 0, 'Neptunus Inc.', '', 2, 0, '', 41.4335, -49.5650);