-- 1. 데이터베이스 생성 및 선택
CREATE DATABASE SQL_SJ;
USE SQL_SJ;-- 2. 테이블 생성 (컬럼 3개)
CREATE TABLE todo (
id INT PRIMARY KEY,
title VARCHAR(50),
author VARCHAR(30)
);-- 3. 데이터 3건 입력 (INSERT)
INSERT INTO todo VALUES (1, '출석');
INSERT INTO todo VALUES (2, '공부');
INSERT INTO todo VALUES (3, '퇴실');
SELECT * FROM todo;--  (WHERE)
SELECT * FROM todo WHERE id = 1;