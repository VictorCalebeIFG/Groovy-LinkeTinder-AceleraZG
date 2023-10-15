INSERT INTO CANDIDATO (NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA)
VALUES
  ('João', 'Silva', '1990-05-15', 'joao@email.com', '123.456.789-01', 'Brasil', '12345-678', 'Descrição pessoal do João', 'senha123'),
  ('Maria', 'Santos', '1985-08-20', 'maria@email.com', '987.654.321-09', 'Brasil', '54321-876', 'Descrição pessoal da Maria', 'senha456'),
  ('Carlos', 'Gomes', '1995-03-10', 'carlos@email.com', '555.444.333-22', 'Brasil', '98765-432', 'Descrição pessoal do Carlos', 'senha789'),
  ('Ana', 'Ferreira', '1980-11-25', 'ana@email.com', '111.222.333-44', 'Brasil', '24680-135', 'Descrição pessoal da Ana', 'senha101'),
  ('Paulo', 'Oliveira', '1998-07-02', 'paulo@email.com', '777.888.999-55', 'Brasil', '86420-579', 'Descrição pessoal do Paulo', 'senha202');

INSERT INTO EMPRESA (NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA)
VALUES
    ('Empresa 1', '1234567890', 'empresa1@email.com', 'Descrição da Empresa 1', 'Brasil', '12345-678', 'senha123'),
    ('Empresa 2', '9876543210', 'empresa2@email.com', 'Descrição da Empresa 2', 'Brasil', '54321-876', 'senha456'),
    ('Empresa 3', '5554443332', 'empresa3@email.com', 'Descrição da Empresa 3', 'Brasil', '98765-432', 'senha789'),
    ('Empresa 4', '1112223334', 'empresa4@email.com', 'Descrição da Empresa 4', 'Brasil', '24680-135', 'senha101'),
    ('Empresa 5', '7778889995', 'empresa5@email.com', 'Descrição da Empresa 5', 'Brasil', '86420-579', 'senha202');

INSERT INTO COMPETENCIA (TAG) VALUES
    ('Java'),
    ('JavaScript'),
    ('Python'),
    ('C++'),
    ('HTML'),
    ('CSS'),
    ('SQL'),
    ('Git'),
    ('React'),
    ('Angular'),
    ('Vue.js'),
    ('Node.js'),
    ('Ruby'),
    ('PHP'),
    ('Swift'),
    ('Flutter');

INSERT INTO VAGA(
	EMPRESA_ID,
	NOME,
	DESCRICAO,
	LOCAL
)
VALUES(
	(SELECT ID FROM EMPRESA WHERE EMAIL = 'empresa1@email.com'),
	'nome da vaga da empresa 1',
	'descricao da vaga da empresa 1',
	'local da empresa 1'
);
