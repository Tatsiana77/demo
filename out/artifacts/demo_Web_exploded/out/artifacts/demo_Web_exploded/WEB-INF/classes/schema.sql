create table Author
(
    id   integer not null auto_increment,
    name varchar(255),
    surname varchar(255),
    PRIMARY KEY (id)
);
create table Customer
(
    id               Integer not null auto_increment,
    name             varchar(255),
    surname          varchar(255),
    customer_address varchar(255),
    customer_phone   varchar(255),
    customer_email   varchar(255),
    PRIMARY KEY (id)
);

create table Book
(
    id           integer not null auto_increment,
    title        varchar(255),
    author_id    integer,
    customer_id integer,
    PRIMARY KEY (id),
    FOREIGN KEY (author_id) references Author (id),
    FOREIGN KEY (customer_id) references Customer (id)

);