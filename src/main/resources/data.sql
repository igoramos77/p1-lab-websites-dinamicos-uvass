INSERT INTO category(image_url, name, slug, description) VALUES (
    'https://static.kabum.com.br/conteudo/categorias/HARDWARE.png',
    'Hardware',
    'hardware',
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
  'https://images.kabum.com.br/produtos/fotos/115571/placa-de-video-gigabyte-nvidia-geforce-rtx-2060-d6-6g-gddr6-gv-n2060d6-6gd_1597412926_m.jpg',
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

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
     'Cadeira Gamer Alpha Gamer Vega, Preto, Reclinável, com Almofadas, Cilindro de Gás Classe 4',
     'As cadeiras gaming Alpha Gamer Vega incluem duas almofadas: para apoio lombar e também para apoio da cabeça. Caso pretendas sentar-te numa posição mais reta, remove as almofadas. Se pretendes uma posição mais relaxada e confortável, então instala as almofadas. É tão simples quanto isto.',
     'https://images.kabum.com.br/produtos/fotos/81454/cadeira-gamer-alpha-gamer-vega-black_1608292452_m.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP(),
     '949.45'
 );

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
     'Cadeira Gamer Husky Gaming Racing, Vermelho, Com Almofadas, Reclinável, Descanso de Braço 3D - HRC-R',
     'As cadeiras gaming Alpha Gamer Vega incluem duas almofadas: para apoio lombar e também para apoio da cabeça. Caso pretendas sentar-te numa posição mais reta, remove as almofadas. Se pretendes uma posição mais relaxada e confortável, então instala as almofadas. É tão simples quanto isto.',
     'https://images.kabum.com.br/produtos/fotos/114483/cadeira-gamer-husky-racing-red-hrc-r_1612440724_m.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP(),
     '999.95'
 );

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
     'Headset Gamer Hyperx CloudX, Drivers 53mm, Xbox One e Xbox Série X e S, P3, Preto e Cinza - HHSC2-CG-SL/G',
     'O Headset Gamer HyperX CloudX foi testado e aprovado pela Microsoft e apresenta o conforto com a assinatura HyperX, durabilidade e som claro e nítido para gamers de Xbox.',
     'https://images.kabum.com.br/produtos/fotos/132449/headset-gamer-hyperx-cloudx-drivers-53mm-xbox-one-e-xbox-serie-x-e-s-p3-preto-e-cinza-hhsc2-cg-sl-g_1628597061_m.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP(),
     '433.90'
 );

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
     'PC Gamer Concórdia, Processador Ryzen 5 3400G, 16GB, SSD 480GB, Fonte 500W, Windows 10 Pro - 40420',
     'O Processador Ryzen 5 3400G com 3.7GHz é uma excelente opção para quem que um bom custo benefício, com os gráficos integrados Radeon RX Vega 11 Graphics tenha um ótimo desempenho na sua Gameplay.',
     'https://images.kabum.com.br/produtos/fotos/133953/pc-gamer-concordia-processador-ryzen-5-3400g-16gb-ssd-480gb-fonte-500w-windows-10-pro-40420_1635193587_m.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP(),
     '4239.90'
 );

INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (
     'iPhone 12 Branco, 128GB - MGJC3BZ/A',
     'A14 Bionic, o chip mais rápido em um smartphone. Tela OLED de ponta a ponta. Ceramic Shield quatro vezes mais resistente a quedas. E modo Noite em todas as câmeras.',
     'https://images.kabum.com.br/produtos/fotos/131115/iphone-12-branco-128gb-mgjc3bz-a_1605099052_m.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP(),
     '8495.85'
 );

INSERT INTO productCategory(product_id, category_id) VALUES (1, 1);
INSERT INTO productCategory(product_id, category_id) VALUES (2, 1);
INSERT INTO productCategory(product_id, category_id) VALUES (6, 2);
INSERT INTO productCategory(product_id, category_id) VALUES (4, 3);
INSERT INTO productCategory(product_id, category_id) VALUES (5, 3);
INSERT INTO productCategory(product_id, category_id) VALUES (7, 6);
INSERT INTO productCategory(product_id, category_id) VALUES (8, 4);

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