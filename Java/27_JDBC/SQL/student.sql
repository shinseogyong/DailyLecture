CREATE TABLE STUDENT (
    ID VARCHAR2(10) PRIMARY KEY,-- NOTNULL+UNIQUE
    NAME VARCHAR2(30) NOT NULL, 
    KOR  NUMBER(3) DEFAULT 0 CHECK(KOR BETWEEN 0 AND 100),--안들어오면 DEFAULT 0
    ENG NUMBER(3) DEFAULT 0 CHECK (ENG BETWEEN 0 AND 100), 
    MATH NUMBER(3) DEFAULT 0 CHECK (MATH BETWEEN 0 AND 100), 
    TOT NUMBER(3) DEFAULT 0 CHECK (TOT BETWEEN 0 AND 300),  
    AVG NUMBER(5, 2) DEFAULT 0 CHECK (AVG BETWEEN 0 AND 100)
);
INSERT INTO STUDENT (ID, NAME, KOR, ENG, MATH, TOT, AVG)
VALUES ('2023001', '홍길동', 100, 90, 81, 0, 0);
INSERT INTO STUDENT (ID, NAME, KOR, ENG, MATH)
VALUES ('2023002', '홍길동2', 95, 85, 75);
COMMIT;

SELECT * FROM STUDENT;