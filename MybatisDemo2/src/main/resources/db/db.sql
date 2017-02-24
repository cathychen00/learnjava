create table Category (
Id int not null auto_increment,
Name varchar(80) null,
constraint pk_category primary key (Id)
);

INSERT INTO category(Name) VALUES ('女装');
INSERT INTO category(Name) VALUES ('美妆');
INSERT INTO category(Name) VALUES ('书籍');

---------------------------------------------
create table product (
Id int not null auto_increment,
categoryId int not null,
Name varchar(80) null,
constraint pk_product primary key (Id),
constraint fk_product_2 foreign key (categoryId)
references category (Id)
);
create index productCat on product (categoryId);
create index productName on product (Name);

INSERT INTO product(CategoryId,Name) VALUES (1, '裂帛');
INSERT INTO product(CategoryId,Name) VALUES (1, '雅鹿');
INSERT INTO product(CategoryId,Name)  VALUES (2,'膜法世家');
INSERT INTO product(CategoryId,Name)  VALUES (2,'御泥坊');
INSERT INTO product(CategoryId,Name)  VALUES (2, '雅诗兰黛');
INSERT INTO product(CategoryId,Name)  VALUES (2, '欧莱雅');
INSERT INTO product(CategoryId,Name)  VALUES (2, '韩后');
INSERT INTO product(CategoryId,Name)  VALUES (2, '相宜本草');
INSERT INTO product(CategoryId,Name)  VALUES (3,'疯狂JAVA');
INSERT INTO product(CategoryId,Name)  VALUES (3,'JAVA核心技术');