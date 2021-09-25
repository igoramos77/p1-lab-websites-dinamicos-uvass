CREATE TABLE category(
    id          INT           NOT NULL,
    image_url   VARCHAR (500) NOT NULL,
    name        VARCHAR (155) NOT NULL,
    description VARCHAR (500)
);

CREATE TABLE product (
     id              INT           NOT NULL,
     name            VARCHAR(255)  NOT NULL,
     description     VARCHAR(500),
     image_url       VARCHAR(500)  NOT NULL,
     created_at      DATE          NOT NULL,
     update_at       TIMESTAMP     NOT NULL,
     unity_value     FLOAT(5.2)    NOT NULL
);

CREATE TABLE productCategory (
    id INT NOT NULL,
    product_id INT NOT NULL,
    category_id INT NOT NULL
);

