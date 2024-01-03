SELECT *
FROM mydemodb.customers;

-- AS LIKE IN BETWEEN
-- MIN MAX COUNT AVG SUM

-- AS as lakap takma

SELECT c.last_name, c.first_name
FROM mydemodb.customers AS c;

SELECT c.last_name AS soyadi, c.first_name as adi, c.country ülke
FROM mydemodb.customers AS c;

-- MAX yasi en büyük olan kişi
SELECT max(age)
FROM mydemodb.customers;

-- MAX adi sen sonda olan kişi
SELECT max(first_name)
FROM mydemodb.customers;

-- min yasi en büyük olan kişi
SELECT min(age)
FROM mydemodb.customers;

-- min adi en başta olan kişi
SELECT min(first_name)
FROM mydemodb.customers;

-- min yasi en büyük olan kişi -- MAX yasi en büyük olan kişi
SELECT min(age), max(age)
FROM mydemodb.customers;

-- min adi en başta olan kişi -- MAX adi sen sonda olan kişi
SELECT min(first_name), max(first_name)
FROM mydemodb.customers;

-- şartlı sorgu
SELECT *
FROM mydemodb.customers
WHERE age = 42;

-- şartlı sorgu - en küçük kişi yaşını bul ve onların kolonlarını göster
SELECT *
FROM mydemodb.customers
WHERE age = (SELECT MIN(age)
             FROM mydemodb.customers);

-- şartlı sorgu - en büyük kişileri bul ve onların kolonlarını göster
SELECT *
FROM mydemodb.customers
WHERE age = (SELECT MAX(age)
             FROM mydemodb.customers);

-- COUNT kaç tane musteri var?
SELECT COUNT(*)
FROM mydemodb.customers;

-- COUNT kaç tane musteri var? Lakap kullan.
SELECT COUNT(*) AS MUSTERI_SAYISI
FROM mydemodb.customers;

-- COUNT kaç tane musteri var? Lakap kullan.
SELECT COUNT(*) MUSTERI_SAYISI
FROM mydemodb.customers;

-- Ulkesi CA olanlar
SELECT *
FROM mydemodb.customers
WHERE country = 'CA';

-- Ulkesi CA olanlar SAYISI
SELECT count(*)
FROM mydemodb.customers
WHERE country = 'CA';

-- Ulkesi CA olanlar SAYISI LAKAPLI
SELECT count(*) AS ULKESI_K_OLAN
FROM mydemodb.customers
WHERE country = 'CA';

-- Kaç ülke var?
SELECT COUNT(DISTINCT country)
FROM mydemodb.customers;

-- Her ülkeden kaç kişi var?
SELECT country, COUNT(*)
FROM mydemodb.customers
GROUP BY country;

-- Her ülkeden kaç kişi var?  Sırala
SELECT country, count(*) customer_totals
FROM mydemodb.customers
GROUP BY country
order by customer_totals DESC;

-- Her ülkeden kaç kişi var?  35 DEN ÇOK OLANLAR.
SELECT country, count(*) customer_totals
FROM mydemodb.customers
GROUP BY country
HAVING count(*) > 35
ORDER BY customer_totals DESC;

-- Müşterilerin yaşları toplamı nedir?
SELECT SUM(age)
FROM mydemodb.customers;

-- Müşterilerin min max toplam ve ortalama yaşları nedir?
SELECT min(age), max(age), sum(age), avg(age)
FROM mydemodb.customers;

-- Çoklu şart ile seçilen ülkeleri listeleme
SELECT *
FROM mydemodb.customers
WHERE country = 'TR'
   OR country = 'BR'
   OR country = 'CA'
   OR country = 'DE';

-- Çoklu şart ile seçilen ülkeleri listeleme
SELECT *
FROM mydemodb.customers
WHERE country IN ('TR', 'BR', 'CA', 'DE');

-- Çoklu şart ile seçilen ülkeleri listeleme olumsuz
SELECT *
FROM mydemodb.customers
WHERE country NOT IN ('TR', 'BR', 'CA', 'DE');

-- Yasi 18 ve 25 arası olanlar
SELECT *
FROM mydemodb.customers
WHERE age > 17
  AND age < 26;

-- Yasi 18 ve 25 arası olanlar
SELECT *
FROM mydemodb.customers
WHERE age >= 18
  AND age <= 25;

-- Yasi 18 ve 25 arası olanlar
SELECT *
FROM mydemodb.customers
WHERE age BETWEEN 18 AND 25;

-- Yasi 18 ve 25 arası olmayanlarlar
SELECT *
FROM mydemodb.customers
WHERE age NOT BETWEEN 18 AND 25;

-- secilen isimlere göre listele
SELECT *
FROM mydemodb.customers
WHERE first_name = 'Biron';

-- secilen son harfi i olan isimlere göre listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%i';

-- secilen isimlerin en son 2 harfi "ai" olacak listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%ai';

-- secilen isimlerin bir yerinde "a" harfi geçenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%a%';

-- secilen isimlerin bir yerinde "önce a bir yerde sonra i" harfi geçenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%a%i%';

-- secilen isimlerin bir yerinde "önce a bir tek harf sonra i" harfi geçenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%a_i%';

-- secilen isimlerin bir yerinde "a harfi" geçmeyenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name NOT LIKE '%a%';

-- secilen isim soy isimlerin bir yerinde "a harfi" geçmeyenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name NOT LIKE '%a%'
  AND last_name NOT LIKE '%a%';

-- secilen isimlerin bir yerinde "a harfi ve büyük A" geçmeyenleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name NOT LIKE '%a'
  AND first_name NOT LIKE '%A';

-- secilen isimlerin bir yerinde "büyük A olacak ve isimin sonu da küçük o ile bitecek" geçeleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%A%o';

-- secilen isimlerin bir yerinde "büyük A olacak ve isimin içinde küçük o" geçeleri listele
SELECT *
FROM mydemodb.customers
WHERE first_name LIKE '%A%'
  AND first_name LIKE '%o%';

-- Tüm siparişler;
SELECT *
FROM mydemodb.orders;

-- Tüm kargo teslimat durumu
SELECT *
FROM mydemodb.shippings;

/*
SELECT KOLONLAR
FROM TABLO_A
JOIN TABLO_B
ON   ŞART
*/
-- default JOIN --- INNER JOINdir
SELECT *
FROM mydemodb.customers
         JOIN mydemodb.orders ON customers.customer_id = orders.customer_id;

SELECT *
FROM mydemodb.customers
        INNER JOIN mydemodb.orders ON customers.customer_id = orders.customer_id;

--JOINLERDE kolonları seçme
