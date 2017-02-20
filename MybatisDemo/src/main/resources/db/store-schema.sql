create table Category (
Id INT not null,
Name varchar(80) null,
constraint pk_category primary key (Id)
);

create table Product (
Id INT not null,
CateId INT not null,
Name varchar(80) null,
constraint pk_product primary key (Id),
constraint fk_product_1 foreign key (CateId)
references category (Id)
);

