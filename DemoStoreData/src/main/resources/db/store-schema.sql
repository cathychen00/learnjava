create table category (
catid varchar(10) not null,
catename varchar(80) null,
constraint pk_category primary key (catid)
);

create table product (
productid varchar(10) not null,
cateid varchar(10) not null,
productName varchar(80) null,
constraint pk_product primary key (productid),
constraint fk_product_1 foreign key (cateid)
references category (catid)
);

create index productCat on product (cateid);
create index productName on product (productName);