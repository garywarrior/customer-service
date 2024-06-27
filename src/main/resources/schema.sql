DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER
(
    id         INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL,
    dob        DATE        NOT NULL
);