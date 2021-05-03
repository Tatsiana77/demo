insert into Author(name, surname) values ('Федор Михайлович', ' Достоевский');
insert into Author(name, surname)  values ('Михаил Афанасьевич ', ' Булгаков');
insert into Author(name, surname)  values ('Николай Николаевич', '  Носов');
insert into Author(name, surname)  values (' Аркадий', 'Стругацкий');
insert into Author(name, surname)  values ('Николай Васильевич','  Гоголь');

insert into Customer(name, surname, customer_address, customer_phone, customer_email) values ('Алена', 'Петрова', 'Минск,ул. Казинца 34, кв 32', '80297546372','alena@gmail.com');
insert into Customer(name, surname, customer_address, customer_phone, customer_email) values ('Василий', 'Иванов', 'Минск,ул. Пушкина 52, кв 49', '80297654920', 'vasiliy@gmail.com');
insert into Customer(name, surname, customer_address, customer_phone, customer_email) values ('Алекс', 'Киров', 'Минск,ул. Сурганова 100, кв 21', '80297546398', 'alex@gmail.com');
insert into Customer(name, surname, customer_address, customer_phone, customer_email) values ('Сергей', 'Машеров', 'Минск,ул. Якуба Коласа 39, кв 7', '80293654312', 'sergey@gmail.com');
insert into Customer(name, surname, customer_address, customer_phone, customer_email) values ('Ольга', 'Купцова', 'Минск,ул. Карбышева 11, кв 5 ', '80297345278','olga@gmail.com');

insert into Book(title, author_Id, customer_id) values ('Вечера на хуторе близ Диканьки', 5, 3 );
insert into Book(title, author_Id, customer_id)  values ('Идиот', 1, 1);
insert into Book(title, author_Id, customer_id)  values ('Мастер и Маргарита', 2, 3);
insert into Book(title, author_Id, customer_id) values ('Незнайка на луне', 3, 2);
insert into Book(title, author_Id, customer_id) values ('Пикник на обочине', 4, 5);
insert into Book(title, author_Id, customer_id) values ('Бесы', 1, 1);
insert into Book(title, author_Id, customer_id)  values ('Собачье сердце', 2, 3);
insert into Book(title, author_Id, customer_id)  values ('Братья Карамазовы', 1, 4);
insert into Book(title, author_Id, customer_id) values ('Трудно быть богом', 4, 2);
insert into Book(title, author_Id, customer_id) values ('Ревизор', 5, 4);