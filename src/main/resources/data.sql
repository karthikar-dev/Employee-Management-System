create schema if not exists ems;

create table if not exists employee (
    id int primary key auto_increment,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    email varchar(50) not null unique
);

insert into employee (firstname, lastname, email)
values
('Alice', 'Brown', 'alice.brown@example.com'),
('Bob', 'Johnson', 'bob.johnson@example.com'),
('Charlie', 'Davis', 'charlie.davis@example.com'),
('David', 'Wilson', 'david.wilson@example.com'),
('Emily', 'Smith', 'emily.smith@example.com'),
('Fiona', 'Clark', 'fiona.clark@example.com'),
('George', 'Lewis', 'george.lewis@example.com'),
('Hannah', 'Walker', 'hannah.walker@example.com'),
('Ian', 'Hall', 'ian.hall@example.com'),
('Jessica', 'Allen', 'jessica.allen@example.com');
