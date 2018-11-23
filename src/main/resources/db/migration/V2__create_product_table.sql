CREATE TABLE product(
  id IDENTITY,
  name varchar(255),
  description varchar(255),
  imageurl varchar(255),
  price decimal,
  date date,
  seller_id bigint
);