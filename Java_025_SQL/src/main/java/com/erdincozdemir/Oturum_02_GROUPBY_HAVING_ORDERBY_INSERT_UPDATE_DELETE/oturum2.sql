SELECT * FROM mydemodb.customers;

INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ali Yağız', 'Tar', '333', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Mehmet Ali', 'Kaya', '333', 'CA');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Salih', 'Bilgin', '333', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ebru', 'Çınar', '444', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Banu', 'Balta', '555', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ogün', 'Gültekin', '666', 'BR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ecem', 'Koro', '777', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Kenan', 'Asker', '888', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Mert', 'Kaynak', '999', 'NL');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Merve', 'Türk', '123', 'US');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Nevzat', 'Ağbaş', '774', 'US');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Şadiye', 'Hanım', '887', 'NL');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Süheda', 'Şen', '874', 'CA');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Yunus Emre', 'Karakaş', '812', 'BR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Erdinç', 'Özdemir', '435', 'TR');

SELECT * FROM mydemodb.customers;

-- Tüm kayıtlar
SELECT * FROM mydemodb.customers;

-- Ülkesi TR olmayanlar
SELECT * FROM mydemodb.customers WHERE country != 'TR';

-- Bütün ülkeler
SELECT customers.country FROM customers;

-- Bütün ülkeler tekil
SELECT DISTINCT customers.country FROM customers;

-- Ülkesi CA olmayanlar
SELECT * FROM customers WHERE NOT country='CA';

-- Ülkesi TR olmayanlar
SELECT * FROM customers WHERE NOT country ='TR';

ALTER TABLE `mydemodb`.`customers`
    ADD COLUMN `age` INT NOT NULL DEFAULT 0 AFTER `country`;

SELECT * FROM mydemodb.customers;

UPDATE mydemodb.customers t
SET t.age = 23
WHERE t.customer_id = 11;

UPDATE mydemodb.customers t
SET t.age = 33
WHERE t.customer_id = 8;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 3;

UPDATE mydemodb.customers t
SET t.age = 40
WHERE t.customer_id = 13;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 7;

UPDATE mydemodb.customers t
SET t.age = 32
WHERE t.customer_id = 5;

UPDATE mydemodb.customers t
SET t.age = 22
WHERE t.customer_id = 1;

UPDATE mydemodb.customers t
SET t.age = 19
WHERE t.customer_id = 6;

UPDATE mydemodb.customers t
SET t.age = 43
WHERE t.customer_id = 15;

UPDATE mydemodb.customers t
SET t.age = 18
WHERE t.customer_id = 14;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 12;

UPDATE mydemodb.customers t
SET t.age = 42
WHERE t.customer_id = 10;

UPDATE mydemodb.customers t
SET t.age = 18
WHERE t.customer_id = 4;

UPDATE mydemodb.customers t
SET t.age = 25
WHERE t.customer_id = 2;

UPDATE mydemodb.customers t
SET t.age = 45
WHERE t.customer_id = 9;


-- Yasi 22'den büyük olanlar
SELECT * FROM customers WHERE age>22;

-- Hangi ülkeden toplam kaç tane var?
SELECT COUNT(DISTINCT country) FROM customers;

-- Alias (lakap, takma isim, takma ad)
SELECT customers.customer_id AS cus_id FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id AS cus_id, first_name, last_name FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT  customers.customer_id AS cus_id, customers.first_name As f_name, customers.last_name AS l_name FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT  customers.customer_id id, customers.first_name f_name, customers.last_name l_name FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id id, first_name f, last_name l  FROM customers c;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT c.customer_id, c.first_name, c.last_name  FROM customers c;

SELECT c.customer_id AS id,
       c.first_name AS f_name,
       c.last_name AS l_name
FROM customers c;

-- CONCAT birleştirme
SELECT CONCAT(customers.first_name, ' ' ,customers.last_name ) FROM customers;

-- CONCAT birleştirme
SELECT CONCAT(customers.first_name, ' ' ,customers.last_name ) AS FullName FROM customers;

-- Bir kayıt ekleme
INSERT INTO customers(first_name, last_name, phone, country, age) VALUES ('Hava','Sevgili','1812','06','31');

SELECT * FROM customers WHERE first_name = 'Hava';

-- Birden fazla kayıt ekleme
INSERT INTO customers(first_name, last_name, phone, country, age) VALUES ('Hacer','Sevgili','1812','06','49'),
                                                                         ('Ezgi','Sevgili','1812','06','27'),
                                                                         ('İsmail','Sevgili','1812','06','59');
SELECT * FROM customers WHERE customer_id > 16;

-- SAKIN BÖYLE YAPMAYIN!!!! WHERE şart koymak zorundasınız!
/*
UPDATE customers
SET age = 20;
*/

-- CusId 19 olan müşterinin yaşını 20 olarak güncelle.
UPDATE customers SET customers.age = 20 WHERE customer_id=19;

SELECT * FROM customers WHERE customer_id = 19;

