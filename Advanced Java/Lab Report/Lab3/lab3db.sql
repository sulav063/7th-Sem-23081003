-- Create Database
CREATE DATABASE lab3db;

-- Use it
USE lab3db;

-- Table 1
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

-- Table 2
CREATE TABLE result (
    roll_no INT,
    course_name VARCHAR(50),
    marks_obtained INT
);

-- Table 3
CREATE TABLE salary (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    emp_salary INT
);

-- Sample Data (optional but useful)
INSERT INTO student VALUES (1, 'Ram', 80);
INSERT INTO student VALUES (2, 'Sita', 85);

INSERT INTO result VALUES (1, 'Java', 90);
INSERT INTO result VALUES (2, 'DBMS', 88);

INSERT INTO salary VALUES (101, 'John', 50000);
INSERT INTO salary VALUES (102, 'Mike', 60000);