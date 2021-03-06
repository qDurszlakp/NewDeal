--liquibase formatted sql

--changeset durszlak:1
CREATE TABLE COUNTRIES
(	COUNTRY_ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
	COUNTRY VARCHAR2(50) NOT NULL ENABLE,
    CODE VARCHAR(10) NOT NULL ENABLE,
    INS_TIME TIMESTAMP DEFAULT CURRENT_DATE NOT NULL ENABLE,
    PRIMARY KEY(COUNTRY_ID)
);

--changeset durszlak:2
CREATE INDEX COUNTRIES_CODE_INDEX ON COUNTRIES(CODE);

--changeset durszlak:3
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('POLAND', '01');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('GERMANY', '02');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('UK', '03');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('USA', '04');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('HOLLAND', '05');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('ISRAEL', '06');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('FRANCE', '07');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('SPAIN', '08');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('FINLAND', '09');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('RUSSIA', '10');

--changeset durszlak:4
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('SLOVAKIA', '11');
INSERT INTO COUNTRIES(COUNTRY, CODE) VALUES ('CHILE', '12');