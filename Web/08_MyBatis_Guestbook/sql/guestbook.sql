CREATE TABLE GUESTBOOK (
    IDX NUMBER(4)PRIMARY KEY,
    NAME VARCHAR2(30) NOT NULL,
    SUBJECT VARCHAR2(150),
    CONTENT VARCHAR2(4000),
    EMAIL VARCHAR2(100),
    PWD VARCHAR2(30),
    REGDATE DATE DEFAULT SYSDATE
);
CREATE SEQUENCE GUESTBOOK_SEQ NOCACHE;

INSERT INTO GUESTBOOK
    (IDX, NAME, SUBJECT, CONTENT, EMAIL, PWD, REGDATE)
VALUES (GUESTBOOK_SEQ.NEXTVAL, '신민기', '제목1', '내용1', 
        'shin1@test.com', '1111', SYSDATE - 3);
        
INSERT INTO GUESTBOOK
    (IDX, NAME, SUBJECT, CONTENT, EMAIL, PWD, REGDATE)
VALUES (GUESTBOOK_SEQ.NEXTVAL, '신민아', '제목2', '내용2', 
        'shin2@test.com', '2222', SYSDATE - 2);        

INSERT INTO GUESTBOOK
    (IDX, NAME, SUBJECT, CONTENT, EMAIL, PWD, REGDATE)
VALUES (GUESTBOOK_SEQ.NEXTVAL, '신동엽', '제목3', '내용3', 
        'shin3@test.com', '3333', SYSDATE - 1);   
        
COMMIT;

SELECT * FROM GUESTBOOK;