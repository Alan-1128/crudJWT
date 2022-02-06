
INSERT INTO productos (nombre, marca, hecho, precio) VALUES('Tenis', 'Nike', 'México', 200);
INSERT INTO productos (nombre, marca, hecho, precio) VALUES('Tenis', 'Adidas', 'Alemania', 365);
INSERT INTO productos (nombre, marca, hecho, precio) VALUES('Tenis', 'Puma', 'México', 101);
INSERT INTO productos (nombre, marca, hecho, precio) VALUES('Tenis', 'Nike', 'Alemania', 465);
INSERT INTO productos (nombre, marca, hecho, precio) VALUES('Tenis', 'Vans', 'Suiza', 300);


/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('usuario','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
