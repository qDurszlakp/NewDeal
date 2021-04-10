--liquibase formatted sql

--changeset durszlak:1
CREATE TABLE COUNTRIES
(	COUNTRY_ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
	COUNTRY VARCHAR2(50) NOT NULL ENABLE,
    CODE VARCHAR(10) NOT NULL ENABLE,
    INS_TIME TIMESTAMP DEFAULT CURRENT_DATE,
    VERSION INTEGER NOT NULL ENABLE
);

--changeset durszlak:2
CREATE INDEX COUNTRIES_CODE_INDEX ON COUNTRIES(CODE);

--changeset durszlak:3
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('POLAND', '01', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('GERMANY', '02', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('UK', '03', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('USA', '04', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('HOLLAND', '05', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('ISRAEL', '06', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('FRANCE', '07', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('SPAIN', '08', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('FINLAND', '09', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('RUSSIA', '10', 1);

--changeset durszlak:4
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('SLOVAKIA', '11', 1);
INSERT INTO COUNTRIES(COUNTRY, CODE, VERSION) VALUES ('CHILE', '12', 1);