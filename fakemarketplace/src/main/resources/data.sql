INSERT
INTO
  users
  (user_Name, img)
VALUES
  ('Chigre', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');

  INSERT
  INTO
    users
    (user_Name, img)
  VALUES
    ('Pancho Porto', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');
  INSERT
  INTO
    users
    (user_Name, img)
  VALUES
    ('Flod', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');

  INSERT
  INTO
    users
    (user_Name, img)
  VALUES
    ('Benito Leal', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');

INSERT
  INTO
    users
    (user_Name, img)
  VALUES
    ('Marisol Evora', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');

INSERT
  INTO
    users
    (user_Name, img)
  VALUES
    ('Alvaro Garcia', 'https://cdn-icons-png.flaticon.com/512/21/21104.png');



INSERT
INTO
  products
  (name, category, price, img, description, seller_id)
VALUES
  ('Vaqueros de la serie Alma Cantaro', 'Escultura', 1637, 'https://www.artmajeur.com/medias/mini/c/h/chigre/artwork/15622252_baqueros-1.jpg', 'Obra realizada en arcilla cocida y esmaltada', 1);

  INSERT
  INTO
    products
    (name, category, price, img, description, seller_id)
  VALUES
    ('Totos', 'Escultura', 1334, 'https://www.artmajeur.com/medias/mini/c/h/chigre/artwork/15622525_totos-2.jpg', 'Obra realizada con ferralla de torno conformada y pintada con pintura al polvo', 1);
    INSERT
    INTO
      products
      (name, category, price, img, description, seller_id)
    VALUES
      ('Dias de lluvia', 'Escultura', 171, 'https://www.artmajeur.com/medias/mini/f/r/francisco-porto-paredes/artwork/9972841_20170109-21-e.jpg', 'Escultura en bronce y acero', 2);
      INSERT
      INTO
        products
        (name, category, price, img, description, seller_id)
      VALUES
        ('El vengador de afrentas', 'Escultura', 138, 'https://www.artmajeur.com/medias/mini/f/r/francisco-porto-paredes/artwork/9972784_20170109-29.jpg', 'Escultura en bronce y acero', 2);
        INSERT
        INTO
          products
          (name, category, price, img, description, seller_id)
        VALUES
          ('Gaia dans une foret de kelp', 'Cuadros', 3594, 'https://www.artmajeur.com/medias/mini/f/l/flodouce/artwork/15210592_gaia-9.jpg?v=1640456702', 'Pintura con pigmentos tradicionales mezclados con resinas', 3);
          INSERT
          INTO
            products
            (name, category, price, img, description, seller_id)
          VALUES
            ('Magic land', 'Cuadros', 546, 'https://www.artmajeur.com/medias/mini/f/l/flodouce/artwork/15647398_magic-land-3-b.jpg?v=1649958519', 'Pintura, acrilico en lienzo de lino', 3);
            INSERT
            INTO
              products
              (name, category, price, img, description, seller_id)
            VALUES
              ('Migrantes', 'Cuadros', 3503, 'https://www.artmajeur.com/medias/mini/a/n/ancalatita/artwork/14484845_migrantes.jpg', 'Pintura, acrilico en lienzo', 4);
              INSERT
              INTO
                products
                (name, category, price, img, description, seller_id)
              VALUES
                ('La desforestacion masiva importa un pimiento', 'Cuadros', 1572, 'https://www.artmajeur.com/medias/mini/a/n/ancalatita/artwork/14577305_me-importa-un-pimiento.jpg', 'Pintura, acrilico en madera', 4);
                INSERT
                INTO
                  products
                  (name, category, price, img, description, seller_id)
                VALUES
                  ('El reflejo de la reflexion de los perros', 'Cuadros', 2.891, 'https://www.artmajeur.com/medias/mini/a/n/ancalatita/artwork/14484686_el-reflejo.jpg?v=1620055943', 'Pintura, oleo en lienzo', 4);
                  INSERT
                  INTO
                    products
                    (name, category, price, img, description, seller_id)
                  VALUES
                    ('Pretend to be normal', 'Cuadros', 902, 'https://www.artmajeur.com/medias/mini/m/a/marisol-evora/artwork/15838339_pretend-to-be-normal-whole-bild.jpg', 'Pintura, acrilico, rotulador en lienzo', 5);
                    INSERT
                    INTO
                      products
                      (name, category, price, img, description, seller_id)
                    VALUES
                      ('El alma de la mariposa', 'Cuadros', 2303, 'https://www.artmajeur.com/medias/mini/m/a/marisol-evora/artwork/15837301_la-alma-de-la-mariposa.jpg', 'Pintura, acrilico, rotulador en lienzo', 5);
                      INSERT
                      INTO
                        products
                        (name, category, price, img, description, seller_id)
                      VALUES
                        ('Happy anywhere', 'Cuadros', 3209, 'https://www.artmajeur.com/medias/mini/m/a/marisol-evora/artwork/15831982_dsc-0217-1.jpg', 'Acrilico en lienzo', 5);
                        INSERT
                        INTO
                          products
                          (name, category, price, img, description, seller_id)
                        VALUES
                          ('En red', 'Grabados', 535, 'https://www.artmajeur.com/medias/mini/a/l/alvaro-garcia-lema/artwork/15909763_en-red.jpg?v=1658085838', 'Xilografia en papel', 6);
                          INSERT
                          INTO
                            products
                            (name, category, price, img, description, seller_id)
                          VALUES
                            ('Lagarto, lagarto', 'Grabados', 235, 'https://www.artmajeur.com/medias/mini/a/l/alvaro-garcia-lema/artwork/15909760_lagarto-lagarto.jpg?v=1658078633', 'Xilografia en papel', 6);

INSERT
INTO
  messages
  (message, creator_id, product_id)
VALUES
  ('Hola soy un mensaje para comprar el producto 1', 1, 1);

INSERT
INTO
  messages
  (message, creator_id, product_id)
VALUES
  ('Mensaje para el producto 2', 1, 2);