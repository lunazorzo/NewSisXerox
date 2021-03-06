--Estado
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (01, 'AC', 'Acre');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (02, 'AL', 'Alagoas');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (03, 'AP', 'Amapá');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (04, 'AM', 'Amazonas');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (05, 'BA', 'Bahia');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (06, 'CE', 'Ceará');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (07, 'DF', 'Distrito Federal');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (08, 'ES', 'Espírito Santo');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (09, 'GO', 'Goiás');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (10, 'MA', 'Maranhão');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (11, 'MT', 'Mato Grosso');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (12, 'MS', 'Mato Grosso do Sul');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (13, 'MG', 'Minas Gerais');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (14, 'PA', 'Pará');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (15, 'PB', 'Paraíba');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (16, 'PR', 'Paraná');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (17, 'PE', 'Pernambuco');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (18, 'PI', 'Piauí');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (19, 'RJ', 'Rio de Janeiro');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (20, 'RN', 'Rio Grande do Norte');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (21, 'RS', 'Rio Grande do Sul');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (22, 'RO', 'Rondônia');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (23, 'RR', 'Roraima');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (24, 'SC', 'Santa Catarina');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (25, 'SP', 'São Paulo');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (26, 'SE', 'Sergipe');
INSERT INTO "estado" ("cd_estado", "sgl_estado", "nm_estado") VALUES (27, 'TO', 'Tocantins');

-- Instituição
INSERT INTO "instituicao" ("nm_instituicao") VALUES ('FASUL');

--CURSO
INSERT INTO "curso" ("nm_curso","cd_instituicao") VALUES ('Sistema de Informação',1);

--Usuário
INSERT INTO "usuario" ("usuario","senha","fg_ativo") VALUES ('ADMIN','123', '1');

--FormaPgto
INSERT INTO "formpgto" ("nm_formpgto") VALUES ('DINHEIRO');
INSERT INTO "formpgto" ("nm_formpgto") VALUES ('CRÉDITO');
--marca
INSERT INTO "marca" ("nm_marca") VALUES ('GERAL');

--Modelo
INSERT INTO "modelo" ("nm_modelo", "cd_marca") VALUES ('GERAL',1);

--Unidade
INSERT INTO "unidade" ("nm_unidade") VALUES ('Unidade');

--Aluno
INSERT INTO aluno( nm_aluno, dt_cadastro, vl_saldo, rg_aluno, ra_aluno, cd_curso)  VALUES ('Aluno Teste', '2016-01-01', 50.00, 1234, 123, 1);

--Produto
INSERT INTO produto(nm_produto, dt_cadastro, fg_ativo, vl_compra, vl_venda, cd_marca, cd_unidade, cd_modelo) VALUES ('Caneta', '2016-01-01', true, 0.10, 1.20, 1, 1, 1);
INSERT INTO produto(nm_produto, dt_cadastro, fg_ativo, vl_compra, vl_venda, cd_marca, cd_unidade, cd_modelo) VALUES ('Xerox', '2016-01-01', true, 0.10, 0.20, 1, 1, 1);

