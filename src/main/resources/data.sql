INSERT INTO category(id, image_url, name, description) VALUES (
    1,
    'https://a-static.mlcdn.com.br/618x463/placa-de-video-asus-geforce-gtx-1050-ti-4gb-gddr5-128-bits-cerberus/magazineluiza/227145900/34876e5bbecb5973522782793bfac931.jpg',
    'Placa de Vídeo',
    'lorem ipsum dolor'
);

INSERT INTO category(id, image_url, name, description) VALUES (
    2,
    'https://m.media-amazon.com/images/I/718jJQI5A+L._AC_SX522_.jpg',
    'Placa mãe',
    ''
);

INSERT INTO product(id, name, description, image_url, created_at, update_at, unity_value) VALUES (
  1,
  'Placa de Vídeo 1050 Ti',
  'Lorem ipsum',
  'https://a-static.mlcdn.com.br/618x463/placa-de-video-asus-geforce-gtx-1050-ti-4gb-gddr5-128-bits-cerberus/magazineluiza/227145900/34876e5bbecb5973522782793bfac931.jpg',
  '2021-09-25',
  CURRENT_TIMESTAMP(),
  '800.00'
);

INSERT INTO product(id, name, description, image_url, created_at, update_at, unity_value) VALUES (
     1,
     'Placa de Vídeo RTX 3080 Ti',
     'Lorem ipsum',
     'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSrnDYndkdcFASS7DlJEXPYb89SfpYCvo6I3ZRGao-VbwixznVrnyXG0irMt_Se1xPJyaN2HbR4O8kRLUqbZX74NpyOXCig2g',
     '2021-09-25',
     CURRENT_TIMESTAMP(),
     '9349.00'
 );

INSERT INTO productCategory(id, product_id, category_id) VALUES (1, 2, 1);
INSERT INTO productCategory(id, product_id, category_id) VALUES (2, 2, 2);