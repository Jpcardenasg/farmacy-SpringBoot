INSERT INTO country (id, namecountry) VALUES (1, 'COLOMBIA');
INSERT INTO country (id, namecountry) VALUES (2, 'UNITED STATES');

INSERT INTO region (id, namereg, codecountry_id) VALUES (1, 'SANTANDER', 1);
INSERT INTO region (id, namereg, codecountry_id) VALUES (2, 'CUNDINAMARCA', 1);
INSERT INTO region (id, namereg, codecountry_id) VALUES (3, 'ANTIOQUIA', 2);

INSERT INTO city (id, namecity, codereg_id) VALUES (1, 'BUCARAMANGA', 1);
INSERT INTO city (id, namecity, codereg_id) VALUES (2, 'MEDELLIN', 3);
INSERT INTO city (id, namecity, codereg_id) VALUES (3, 'BOGOTA', 2);

INSERT INTO customer (id, birthdate, emailcustomer, lastnamecustomer, latcustomer, longcustomer, namecustomer, codecitycustomer_id) 
VALUES ('1007456897', '2000-04-30 00:00:00', 'admin@campuslands.com', 'perez', 25.6, 90.8, 'pepe', 1);
