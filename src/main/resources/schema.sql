CREATE TABLE category(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    image_url VARCHAR (500) NOT NULL,
    name VARCHAR (155) NOT NULL,
    description VARCHAR (500)
);

CREATE TABLE product (
     id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     name VARCHAR(255) NOT NULL,
     description VARCHAR(500),
     image_url VARCHAR(500) NOT NULL,
     created_at DATE NOT NULL,
     update_at TIMESTAMP NOT NULL,
     unity_value FLOAT(5.2) NOT NULL
);

CREATE TABLE productCategory (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    product_id INT NOT NULL,
    category_id INT NOT NULL,

    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);

create table promotion (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR (100) NOT NULL,
    description varchar(200) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_at TIMESTAMP NOT NULL,
    update_at TIMESTAMP NOT NULL
);

create table promotionItem (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    promotion_value FLOAT(5.2) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    update_at TIMESTAMP NOT NULL,
    product_id INT NOT NULL,
    promotion_id INT NOT NULL,

    FOREIGN KEY (promotion_id) REFERENCES promotion(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);

