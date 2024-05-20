CREATE TABLE transacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    valor INT NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    descricao VARCHAR(10) NOT NULL,
    data_transacao TIMESTAMP,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
