SHOW DATABASES;
CREATE DATABASE testdb;
USE testdb;

SHOW TABLES;

CREATE TABLE student(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(100) NOT NULL,
	email VARCHAR(100),
	age INT,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
SELECT * FROM student;
-- 샘플데이터
INSERT INTO student(NAME, email, age) VALUES 
('김철수', 'kim@example.com', 20),
('이영희', 'lee@example.com', 22),
('박민수', 'park@example.com', 21);
INSERT INTO student(NAME, email, age) VALUES 
('김철수', '', 0);
INSERT INTO student(NAME) VALUES 
('김철수');
