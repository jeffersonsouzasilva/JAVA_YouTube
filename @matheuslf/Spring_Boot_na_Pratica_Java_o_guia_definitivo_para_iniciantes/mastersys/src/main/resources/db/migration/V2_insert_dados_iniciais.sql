INSERT INTO modalidades (nome) VALUES
(nome 'Musculação'),
(nome 'Funcional'),
(nome 'Jiu-Jitsu'),
(nome 'Muay Thai'),
(nome 'Pilates');

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 120.00 FROM modalidades WHERE nome = 'Musculação';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Trimestral', 330.00 FROM modalidades WHERE nome = 'Musculação';