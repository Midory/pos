-- Insertion dans la table Company (Boutique de Bijoux)
INSERT INTO company (id, name, description)
VALUES
('11111111-1111-1111-1111-111111111111', 'Bijouterie Élégance', 'Boutique spécialisée dans la vente de bijoux de luxe.');

-- Insertion dans la table Store (Boutique physique)
INSERT INTO store (id, name, address, company_id)
VALUES
('22222222-2222-2222-2222-222222222222', 'Boutique Élégance', '10 Rue de la Mode, Paris', '11111111-1111-1111-1111-111111111111');

-- Insertion dans la table Inventory (Inventaire de la boutique)
INSERT INTO inventory (id, store_id)
VALUES
('33333333-3333-3333-3333-333333333333', '22222222-2222-2222-2222-222222222222');

-- Insertion dans la table ProductCategory
-- Catégorie "Colliers"
INSERT INTO product_category (id, code, name, description)
VALUES
('44444444-4444-4444-4444-444444444444', 'COL001', 'Colliers', 'Collection de colliers en or, argent et pierres précieuses.');

-- Catégorie "Bagues"
INSERT INTO product_category (id, code, name, description)
VALUES
('55555555-5555-5555-5555-555555555555', 'BAG001', 'Bagues', 'Bagues serties de diamants et autres pierres fines.');

-- Catégorie "Bracelets"
INSERT INTO product_category (id, code, name, description)
VALUES
('66666666-6666-6666-6666-666666666666', 'BRA001', 'Bracelets', 'Bracelets en or, argent ou platine avec designs exclusifs.');

-- Insertion dans la table Product
-- Produit : Collier en or 18K
INSERT INTO product (id, code, name, description, barcode, product_category_id, product_attribute_values)
VALUES
('77777777-7777-7777-7777-777777777777',
 'PRD-COL-001',
 'Collier en or 18K',
 'Collier en or 18 carats agrémenté d’un pendentif serti d’un diamant.',
 '1234567890123',
 '44444444-4444-4444-4444-444444444444',
 '[
     {"name": "Poids", "value": "20g", "type": "spec", "order": "1"},
     {"name": "Longueur", "value": "45cm", "type": "spec", "order": "2"}
 ]');

-- Produit : Bague en diamant
INSERT INTO product (id, code, name, description, barcode, product_category_id, product_attribute_values)
VALUES
('88888888-8888-8888-8888-888888888888',
 'PRD-BAG-001',
 'Bague en diamant',
 'Bague élégante sertie d’un diamant de 0.5 carat pour une touche de raffinement.',
 '2345678901234',
 '55555555-5555-5555-5555-555555555555',
 '[
     {"name": "Diamètre", "value": "7mm", "type": "spec", "order": "1"},
     {"name": "Poids", "value": "5g", "type": "spec", "order": "2"}
 ]');

-- Produit : Bracelet en argent
INSERT INTO product (id, code, name, description, barcode, product_category_id, product_attribute_values)
VALUES
('99999999-9999-9999-9999-999999999999',
 'PRD-BRA-001',
 'Bracelet en argent',
 'Bracelet en argent sterling avec gravure personnalisée pour une élégance discrète.',
 '3456789012345',
 '66666666-6666-6666-6666-666666666666',
 '[
     {"name": "Taille", "value": "Ajustable", "type": "spec", "order": "1"},
     {"name": "Poids", "value": "15g", "type": "spec", "order": "2"}
 ]');

-- Insertion dans la table ProductInventory
-- Inventaire pour Collier en or 18K
INSERT INTO product_inventory (id, product_id, quantity, inventory_id)
VALUES
('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa',
 '77777777-7777-7777-7777-777777777777',
 10,
 '33333333-3333-3333-3333-333333333333');

-- Inventaire pour Bague en diamant
INSERT INTO product_inventory (id, product_id, quantity, inventory_id)
VALUES
('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb',
 '88888888-8888-8888-8888-888888888888',
 5,
 '33333333-3333-3333-3333-333333333333');

-- Inventaire pour Bracelet en argent
INSERT INTO product_inventory (id, product_id, quantity, inventory_id)
VALUES
('cccccccc-cccc-cccc-cccc-cccccccccccc',
 '99999999-9999-9999-9999-999999999999',
 20,
 '33333333-3333-3333-3333-333333333333');

-- Insertion dans la table ProductPrice
-- Prix pour Collier en or 18K
INSERT INTO product_price (id, product_id, store_id, price, discount_percentage, rebate, currency, start_date, end_date, active)
VALUES
('dddddddd-dddd-dddd-dddd-dddddddddddd',
 '77777777-7777-7777-7777-777777777777',
 '22222222-2222-2222-2222-222222222222',
 1500.00,
 10.00,
 0.00,
 'EUR',
 '2025-03-08T00:00:00+00:00',
 '2025-12-31T23:59:59+00:00',
 true);

-- Prix pour Bague en diamant
INSERT INTO product_price (id, product_id, store_id, price, discount_percentage, rebate, currency, start_date, end_date, active)
VALUES
('eeeeeeee-eeee-eeee-eeee-eeeeeeeeeeee',
 '88888888-8888-8888-8888-888888888888',
 '22222222-2222-2222-2222-222222222222',
 2000.00,
 5.00,
 0.00,
 'EUR',
 '2025-03-08T00:00:00+00:00',
 '2025-12-31T23:59:59+00:00',
 true);

-- Prix pour Bracelet en argent
INSERT INTO product_price (id, product_id, store_id, price, discount_percentage, rebate, currency, start_date, end_date, active)
VALUES
('ffffffff-ffff-ffff-ffff-ffffffffffff',
 '99999999-9999-9999-9999-999999999999',
 '22222222-2222-2222-2222-222222222222',
 300.00,
 0.00,
 0.00,
 'EUR',
 '2025-03-08T00:00:00+00:00',
 NULL,
 true);