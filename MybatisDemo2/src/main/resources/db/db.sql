create table Category (
Id int not null auto_increment,
Name varchar(80) null,
constraint pk_category primary key (Id)
);

INSERT INTO category(Name) VALUES ('Fish');
INSERT INTO category(Name) VALUES ('Dogs');
INSERT INTO category(Name) VALUES ('Birds');