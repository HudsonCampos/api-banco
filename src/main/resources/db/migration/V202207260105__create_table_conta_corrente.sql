CREATE TABLE If NOT EXISTS t_conta_corrente (
    id_conta_corrente int8 NOT NULL,
    id_correntista_fk int8 NOT NULL,
    numero_agencia_fk int8 NOT NULL,
    limite DECIMAL (18,2),   
    saldo DECIMAL (18,2),
    ativa CHAR (8),
    PRIMARY KEY (id_conta_corrente),
    FOREIGN KEY (id_correntista_fk) REFERENCES t_correntista (id_correntista),
    FOREIGN KEY (numero_agencia_fk) REFERENCES t_agencia (numero_agencia)
)
