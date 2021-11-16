INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/HARDWARE.png',
    'Placas de Vídeo',
    'placas-de-video',
    'lorem ipsum dolor'
);

INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/PERIFERICOS.png',
    'Periféricos',
    'perifericos',
    ''
);

INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/CADEIRAS.png',
    'Cadeiras Gamer',
    'cadeiras-gamer',
    ''
);

INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/CELULAR-TELEFONE.png',
    'Celular & Telefone',
    'celular-e-telefone',
    ''
);

INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/TV.png',
    'TV',
    'tv',
    ''
);

INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/COMPUTADORES.png',
    'Computadores',
    'computadores',
    ''
);

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
  'Placa de Vídeo 1050 Ti',
  'Lorem ipsum',
  'https://a-static.mlcdn.com.br/618x463/placa-de-video-asus-geforce-gtx-1050-ti-4gb-gddr5-128-bits-cerberus/magazineluiza/227145900/34876e5bbecb5973522782793bfac931.jpg',
  CURRENT_TIMESTAMP(),
  CURRENT_TIMESTAMP(),
  '800.00'
);

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
    'SSD Kingston A400, 240GB, SATA, Leitura 500MB/s, Gravação',
    'Lorem ipsum',
    'https://images.kabum.com.br/produtos/fotos/85197/85197_index_m.jpg',
    CURRENT_TIMESTAMP(),
    CURRENT_TIMESTAMP(),
    '189.99'
 );

 INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
    'Placa de Vídeo Default',
    'Lorem ipsum',
    'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSrnDYndkdcFASS7DlJEXPYb89SfpYCvo6I3ZRGao-VbwixznVrnyXG0irMt_Se1xPJyaN2HbR4O8kRLUqbZX74NpyOXCig2g',
    CURRENT_TIMESTAMP(),
    CURRENT_TIMESTAMP(),
    '2500.00'
 );

INSERT INTO productCategory(product_id, category_id) VALUES (2, 1);
INSERT INTO productCategory(product_id, category_id) VALUES (2, 2);
INSERT INTO productCategory(product_id, category_id) VALUES (3, 1);

INSERT INTO promotion(name, description, start_date, end_date, created_at, update_at) VALUES (
    'Super promoção Placa de Vídeo AMD Radeon 7',
    'Lorem ipsum dolor siamet',
    '2021-09-26',
    '2021-09-30',
    CURRENT_TIMESTAMP(),
    CURRENT_TIMESTAMP()
);

INSERT INTO promotionItem(promotion_value, created_at, update_at, product_id, promotion_id) VALUES (
    2000.00, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, 1);