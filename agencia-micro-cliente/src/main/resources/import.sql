-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

INSERT INTO Cliente(id, nome) VALUES (nextval('hibernate_sequence'), 'João');
INSERT INTO Cliente(id, nome) VALUES (nextval('hibernate_sequence'), 'Maria');
INSERT INTO Cliente(id, nome) VALUES (nextval('hibernate_sequence'), 'José');
INSERT INTO Cliente(id, nome) VALUES (nextval('hibernate_sequence'), 'Ana');
